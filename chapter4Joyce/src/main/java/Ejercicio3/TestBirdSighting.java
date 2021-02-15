/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author DELL
 */
public class TestBirdSighting {
    public static void main(String[] args) {
        BirdSighting bird= new BirdSighting();
        BirdSighting bird2= new BirdSighting("Canario",3,64);        
        
        System.out.println("Pajaro: "+bird.getBird()+", Visitas: "+ bird.getNumero()+", al dia: "+ bird.getDia());
        System.out.println("Pajaro: "+bird2.getBird()+", Visitas: "+ bird2.getNumero()+", al dia: "+ bird2.getDia());

    }
}
