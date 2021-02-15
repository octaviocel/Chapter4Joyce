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
public class BirdSighting {
    private String bird;
    private Integer numero;
    private Integer dia;
    
    public BirdSighting(){
        this.bird="rolin";
        this.dia=1;
        this.numero=1;
    }

    public BirdSighting(String bird, Integer numero, Integer dia) {
        this.bird = bird;
        this.numero = numero;
        this.dia = dia;
    }

    
    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }
    
    
}
