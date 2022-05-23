/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;

import java.awt.Point;

/**
 *
 * @author PC
 */
public class Ucty {
    
    private String Meno;
    private String Priezvislo;
    private String PrihlasMneo;      
    private String Heslo;

    public Ucty(String Meno, String Priezvislo, String PrihlasMneo, String Heslo) {
        this.Meno = Meno;
        this.Priezvislo = Priezvislo;
        this.PrihlasMneo = PrihlasMneo;
        this.Heslo = Heslo;
    }

    public String getMeno() {
        return Meno;
    }

    public String getPriezvislo() {
        return Priezvislo;
    }

    public String getPrihlasMneo() {
        return PrihlasMneo;
    }

    public String getHeslo() {
        return Heslo;
    }

    Point get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
