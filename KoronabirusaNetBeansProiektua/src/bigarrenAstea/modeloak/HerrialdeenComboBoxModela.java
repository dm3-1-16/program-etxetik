/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigarrenAstea.modeloak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author root
 */
public class HerrialdeenComboBoxModela extends DefaultComboBoxModel {

    /**
     *
     * @param nondik Balio posibleak "dbtik",""
     */
    public HerrialdeenComboBoxModela(String nondik) {
        if (nondik.equals("dbtik")) {
            String taula = "Herrialdeak";
            String eremua = "herrialdea";
            String sql = "SELECT * FROM " + taula;

            try (Connection conn = konektatu();
                    PreparedStatement pstmt = conn.prepareStatement(sql)) {
                ResultSet rs = pstmt.executeQuery();
                this.addElement(" ");
                while (rs.next()) {
                    this.addElement(rs.getString("Herrialdea"));
                }
            } catch (SQLException e) {
                System.out.println("SQLException => " + e.getErrorCode() + "-" + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception => " + e.getMessage());
            }

        } else {
            this.addElement(" ");
            this.addElement("Errusia");
            this.addElement("SouthAfrika");
            this.addElement("Venezuela");
        }
    }

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

}
