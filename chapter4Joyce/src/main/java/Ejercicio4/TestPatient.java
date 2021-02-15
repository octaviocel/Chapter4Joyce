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
public class TestPatient {
    public static void main(String[] args) {
        Patient paciente = new Patient();
        Patient paciente2 = new Patient(5454,42,new BloodData(Sangre.A,Rh.NEGATIVO));
        
        System.out.println("Paciente: "+paciente.getId()+"\nEdad: "+paciente.getEdad()+"\nSangre: "+paciente.getSangre().getFactor()+" "+paciente.getSangre().getTipo());
        System.out.println("Paciente: "+paciente2.getId()+"\nEdad: "+paciente2.getEdad()+"\nSangre: "+paciente2.getSangre().getFactor()+" "+paciente2.getSangre().getTipo());
    }
}
