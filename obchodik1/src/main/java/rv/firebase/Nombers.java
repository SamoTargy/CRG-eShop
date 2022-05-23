/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv.firebase;

/**
 *
 * @author PC
 */
public class Nombers {
    
    private String id;
    private String Cislo1;
    private String Cislo2;
    private String Cislo3;

    public String getId() {
        return id;
    }

    public String getCislo1() {
        return Cislo1;
    }

    public String getCislo2() {
        return Cislo2;
    }

    public String getCislo3() {
        return Cislo3;
    }

    
    public Nombers(String id, String Cislo1, String Cislo2, String Cislo3) {
        this.id = id;
        this.Cislo1 = Cislo1;
        this.Cislo2 = Cislo2;
        this.Cislo3 = Cislo3;
    }

    
    
    
}
