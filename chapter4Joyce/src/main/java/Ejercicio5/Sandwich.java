/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author DELL
 */
public class Sandwich {
    private Bread pan;
    private SandwichFilling relleno;

    public Sandwich(Bread pan, SandwichFilling relleno) {
        this.pan = pan;
        this.relleno = relleno;
    } 

    public Sandwich(String tipo, Integer calorias, String relleno,Integer calorias2){
        this(new Bread(tipo,calorias), new SandwichFilling(relleno,calorias2));
    }

    public Bread getPan() {
        return pan;
    }

    public void setPan(Bread pan) {
        this.pan = pan;
    }

    public SandwichFilling getRelleno() {
        return relleno;
    }

    public void setRelleno(SandwichFilling relleno) {
        this.relleno = relleno;
    }
    
    
}
