/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11;

/**
 *
 * @author DELL
 */
public class TestState {
    public static void main(String[] args) {
        State oaxaca= new State("Oaxaca",4500000,"Oaxaca de Juarez", 150000,"Istmo",500000);
        
        System.out.println("Estado: "+oaxaca.getEstado()+oaxaca.getPoblacion());
        System.out.println("Capital: "+oaxaca.getCapital().getNombre()+oaxaca.getCapital().getPoblacion());
        System.out.println("Ciudas mas poblada: "+oaxaca.getMaspoblado().getNombre()+oaxaca.getMaspoblado().getPoblacion());
    }
}
