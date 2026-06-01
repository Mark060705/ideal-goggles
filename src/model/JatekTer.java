/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author AmmerMárkDániel(SZF_
 */
public class JatekTer {
    private int maxPoz, minpoz;
    private Karakter[] karakterek = new Karakter[2];
    private static final Random RND = new Random();

    public JatekTer(int maxPoz, Karakter[] karakterek) {
        this.maxPoz = maxPoz;
        this.minpoz = 0;
        this.karakterek = karakterek;
    }
    
    public JatekTer(Karakter[] karakterek) {
        this(3, karakterek);
    }
    

    public Karakter[] getKarakterek() {
        return karakterek;
    }
    
    public int getMaxPoz() {
        return maxPoz;
    }

    public int getMinpoz() {
        return minpoz;
    }
    
    public void pozEllenorzes(){
        if (karakterek[0].getPoz() == karakterek[1].getPoz()){
            int seb1 = RND.nextInt(4);
            int seb2 = RND.nextInt(4);
            karakterek[0].sebzodik(seb1);
            karakterek[1].sebzodik(seb2);
        }
    }
    
    
}
