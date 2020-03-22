/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigarrenAstea.modeloak;

import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author root
 */
public class HerrialdeenComboBoxModela<String> extends DefaultComboBoxModel {

    /**
     *
     * @param nondik Balio posibleak "dbtik",""
     */
    public HerrialdeenComboBoxModela(String nondik) {
        if (nondik.equals("dbtik")) {
            // hemen datubasera konektatu etab.
        } else {
            this.addElement(" ");
            this.addElement("Errusia");
            this.addElement("SouthAfrika");
            this.addElement("Venezuela");
        }
    }
}

