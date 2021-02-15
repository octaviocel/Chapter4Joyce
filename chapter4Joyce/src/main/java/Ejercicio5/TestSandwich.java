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
public class TestSandwich {
    public static void main(String[] args) {
        Sandwich san= new Sandwich("Trigo", 55, "atun", 45);
        Sandwich san2= new Sandwich("Normal", 20, "Choriqueso", 70);
        
        System.out.println("Este sandwich tiene: "+san.getPan().getTipo()+ san.getRelleno().getRelleno()+" y tiene "+ (san.getPan().getCalorias()+san.getRelleno().getCalorias()));
        System.out.println("Este sandwich tiene: "+san2.getPan().getTipo()+ san2.getRelleno().getRelleno()+" y tiene "+ (san2.getPan().getCalorias()+san2.getRelleno().getCalorias()));

    }
}
