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
public class SandwichFilling {
    private String relleno;
    private Integer calorias;

    public SandwichFilling(String relleno, Integer calorias) {
        this.relleno = relleno;
        this.calorias = calorias;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }
    
    
}
