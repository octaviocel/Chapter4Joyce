/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        Billing uno = new Billing();
        
        System.out.println(uno.computeBill(500));
        System.out.println(uno.computeBill(100, 40));
        System.out.println(uno.computeBill(400,4,300));
    }
}
