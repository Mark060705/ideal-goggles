/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import model.JatekTer;
import model.Karakter;

/**
 *
 * @author AmmerMárkDániel(SZF_
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karakter k1 = new Karakter('h', 0);
        Karakter k2 = new Karakter('v', 0);
        


        Karakter[] karakterek = new Karakter[2];
        karakterek[1] = k2;
        karakterek[0] = k1;
        
        JatekTer j = new JatekTer(karakterek);
    }
    
}
