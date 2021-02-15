/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author DELL
 */
public class FormLetterWriter {
    private String apellido;
    private String nombre;
    

    public String displaySalutation(String apellido){
        this.apellido=apellido;
        return "Dear Mr. or Ms. "+ this.getApellido()+"\nThank you for your recent order.";
    }
    
    public String displaySalutation(String nombre, String apellido){
        this.apellido=apellido;
        this.nombre=nombre;
        return "Dear "+this.getNombre() + " "+ this.getApellido()+"\nThank you for your recent order.";
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
