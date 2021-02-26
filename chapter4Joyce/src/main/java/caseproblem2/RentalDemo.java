/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

/**
 *
 * @author DELL
 */
public class RentalDemo {
    public static void main(String[] args) {
        Rental r1= new Rental();
        Rental r2= new Rental("R8373",23,38);
        
        Rental.logo();
        
        r1.mostrar();
        System.out.println("\n\n");
        r2.mostrar();
    }
}
