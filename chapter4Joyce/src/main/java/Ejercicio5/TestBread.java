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
public class TestBread {
    public static void main(String[] args) {
        Bread pan= new Bread("Trigo",41);
        
        System.out.println("El pan: "+pan.getTipo()+" tiene "+pan.getCalorias()+" calorias."+Bread.MOTTO);
    }
}
