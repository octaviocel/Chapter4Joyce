/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author DELL
 */
public class Mate {

    private Integer numero;

    public Mate() {
        this.numero = 1;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void raizCuadrada() {
        System.out.println("La raiz cuadrada de " + this.getNumero() + " es: " + Math.sqrt(this.numero));
    }

    public void sen() {
        System.out.println("Seno: " + Math.sin(this.numero));
    }

    public void cos() {
        System.out.println("Coseno: " + Math.cos(this.numero));
    }

    public void valores() {
        System.out.println("Floor: " + Math.floor(this.numero));
        System.out.println("Ceiling: "+ Math.ceil(this.numero));
        System.out.println("Round: "+ Math.round(this.numero));
    }

    public void max(){
        System.out.println("Max: "+ Math.max((int) 'D', this.numero));
    }
    
    public void min(){
            System.out.println("Min: "+ Math.min((int) 'D', this.numero));
    }
}
