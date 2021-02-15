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
public class TestSandwichFilling {
    public static void main(String[] args) {
        SandwichFilling sand= new SandwichFilling("ozuna",45);
        SandwichFilling sand2= new SandwichFilling("atun",37);
        SandwichFilling sand3= new SandwichFilling("queso",50);
        
        System.out.println("El sandwich relleno de "+ sand.getRelleno()+" tiene "+ sand.getCalorias()+" Calorias.");
        System.out.println("El sandwich relleno de "+ sand2.getRelleno()+" tiene "+ sand2.getCalorias()+" Calorias.");
        System.out.println("El sandwich relleno de "+ sand3.getRelleno()+" tiene "+ sand3.getCalorias()+" Calorias.");

    }
}
