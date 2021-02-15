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
public class Circle {
    private Double radio;
    private Double diametro;
    private Double area;

    public Circle() {
        this.radio=1.0;
        this.diametro=this.radio*2;
        this.area= Math.pow(this.radio, 2)*Math.PI;
    }

    public void setRadio(Double radio){
        this.radio=radio;
        this.diametro=radio*2;
        this.area= Math.pow(radio, 2)*Math.PI;
    }
    
    public Double getRadio() {
        return radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public Double getArea() {
        return area;
    }
    
    
    
    
}
