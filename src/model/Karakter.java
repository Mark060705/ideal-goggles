/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AmmerMárkDániel(SZF_
 */
public class Karakter {
    private char tipus;
    private int poz, hp;

    public Karakter(char tipus, int poz) {
        this.tipus = tipus;
        this.poz = poz;
        this.hp = 9;
    }
    
    public Karakter(char tipus) {
        this(tipus, 0);
        
    }
    
    public char getTipus() {
        return tipus;
    }

    public int getPoz() {
        return poz;
    }

    public int getHp() {
        return hp;
    }

    public void setPoz(int poz) {
        this.poz = poz;
    }

    public void sebzodik(int sebzes) {
        if(hp - sebzes < 0)
        hp = 0;
        else {
            hp = hp - sebzes;
        }
    }

    @Override
    public String toString() {
        return "" + tipus + ", poz=" + poz + ", hp=" + hp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.tipus;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Karakter other = (Karakter) obj;
        return this.tipus == other.tipus;
    }
    
    private void mozgas(int ujPoz){
        setPoz(ujPoz);
        
    }
    
    
    
}
