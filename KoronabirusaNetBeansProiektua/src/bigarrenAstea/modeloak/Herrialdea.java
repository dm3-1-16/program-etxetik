/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigarrenAstea.modeloak;

/**
 *
 * @author root
 */
public class Herrialdea {
    
    private String herrialdea;
    private int populazioa;
    private int azalera;

    public Herrialdea(String herrialdea, int populazioa, int azalera) {
        this.herrialdea = herrialdea;
        this.populazioa = populazioa;
        this.azalera = azalera;
    }

    public String getHerrialdea() {
        return herrialdea;
    }

    public void setHerrialdea(String herrialdea) {
        this.herrialdea = herrialdea;
    }

    public int getPopulazioa() {
        return populazioa;
    }

    public void setPopulazioa(int populazioa) {
        this.populazioa = populazioa;
    }

    public int getAzalera() {
        return azalera;
    }

    public void setAzalera(int azalera) {
        this.azalera = azalera;
    }

    @Override
    public String toString() {
        return "Herrialdea{" + "herrialdea=" + herrialdea + ", populazioa=" + populazioa + ", azalera=" + azalera + '}';
    }
    
    
}
