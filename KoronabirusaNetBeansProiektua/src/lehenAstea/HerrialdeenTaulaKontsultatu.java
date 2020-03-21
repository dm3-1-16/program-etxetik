package lehenAstea;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/** 
 * 
 * @author  Idoia Madariaga (Ane Tubiak bidalitako lana oinarritzat hartuta)
 */
public class HerrialdeenTaulaKontsultatu {

    public static Connection konektatu() {
        String server = "localhost"; 
        String db = "KoronabirusaDB";
        String url = "jdbc:mysql://" + server + "/" + db;
        String user = "ikaslea";
        String pass = "ikaslea";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("SQL Errorea: " + e.getErrorCode() + "-" + e.getMessage());
        } catch (Exception e) {
            System.out.println("SQL ez dan errorea: " + e.getMessage());
        }
        return conn;
    }

    public static void ikusi() {
        String taula = "Herrialdeak";
        String eremua = "herrialdea";
        String sql = "SELECT * FROM " + taula + " WHERE " + eremua + " LIKE ?";
        Scanner sc = new Scanner(System.in);
        System.out.print("Sartu herrialde baten izena (edo * dena ikusteko): ");

        try (Connection conn = konektatu();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            String sartutakoa = sc.nextLine();
            if (!sartutakoa.equals("*")) {
                pstmt.setString(1, sartutakoa);
            } else {
                pstmt.setString(1, "%");
            }
            ResultSet rs = pstmt.executeQuery();
            int prozesatutakoErregistroak = 0;
            while (rs.next()) {
                prozesatutakoErregistroak++;
                if (prozesatutakoErregistroak == 1) {
                    System.out.printf("%-20s %10s %10s %10s \n", "Herrialdea", "Populazioa", "Azalera", "Dentsitatea");
                    System.out.println("============================================================================");
                }
                String h = rs.getString("herrialdea");
                int p = rs.getInt("populazioa");
                int a = rs.getInt("azalera");
                double d = p / a;

                System.out.printf("%-20s %10d %10d %9.2f \n", h, p, a, d);

            }
            if (prozesatutakoErregistroak == 0) {
                System.out.println("Ez daukagu herrialde horren inguruko daturik.");
            }

        } catch (SQLException e) {
            System.out.println("SQL errore bat gertatu da.");
        } catch (Exception e) {
            System.out.println("SQL ez dan errorea: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ikusi();
    }
}
