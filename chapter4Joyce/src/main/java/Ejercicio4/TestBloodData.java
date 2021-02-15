/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author DELL
 */
public class TestBloodData {
    public static void main(String[] args) {
        BloodData san= new BloodData();
        BloodData san2= new BloodData(Sangre.AB,Rh.NEGATIVO);
        
        System.out.println("Esta perona tiene sangre: "+san.getTipo()+" "+san.getFactor());
        System.out.println("Esta perona tiene sangre: "+san2.getTipo()+" " +san2.getFactor());
        
        
    }
}
