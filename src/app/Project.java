/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.Random;
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
        Random RND = new Random();
        
        Karakter k1 = new Karakter('h', 0);
        Karakter k2 = new Karakter('v', 0);
        


        Karakter[] karakterek = new Karakter[2];
        karakterek[1] = k2;
        karakterek[0] = k1;
        
        JatekTer j = new JatekTer(karakterek);
        
        
        while (true) {            
            int m1 = RND.nextInt(j.getMaxPoz());
            int m2 = RND.nextInt(j.getMaxPoz());
            k1.setPoz(m1);
            k2.setPoz(m2);
            
            j.pozEllenorzes();
            
            System.out.println(k1.toString() + " | " + k2.toString() + "\n-------------------------------");
            
            if(k1.getHp() == 0 || k2.getHp() == 0){
                break;
            }
        }
        
        
    }
    
}
