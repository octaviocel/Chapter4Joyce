/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author DELL
 */
public class TestRadio {
    public static void main(String[] args) {
        Circle uno = new Circle();
        Circle dos = new Circle();
        Circle tres = new Circle();
        
        uno.setRadio(5.0);
        dos.setRadio(2.1);
        
        System.out.println(String.format("El primer circulo: \n Diametro: %.1f \n Radio: %.1f \n Area: %.2f", uno.getDiametro(),uno.getRadio(),uno.getArea()));
        System.out.println(String.format("El segundo circulo: \n Diametro: %.1f \n Radio: %.1f \n Area: %.2f", dos.getDiametro(),dos.getRadio(),dos.getArea()));
        System.out.println(String.format("El tercer circulo: \n Diametro: %.1f \n Radio: %.1f \n Area: %.2f", tres.getDiametro(),tres.getRadio(),tres.getArea()));
    }
}
