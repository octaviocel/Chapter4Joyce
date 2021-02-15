/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author DELL
 */
public class Bread {
    private String tipo;
    private Integer calorias;
    public final static String MOTTO="The staff of life";

    public Bread(String tipo, Integer calorias) {
        this.tipo = tipo;
        this.calorias = calorias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }
    
    
}
