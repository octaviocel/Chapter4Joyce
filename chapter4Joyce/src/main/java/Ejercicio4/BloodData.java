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
public class BloodData {
    private Sangre tipo;
    private Rh factor;
    
    public BloodData(){
        this.factor=Rh.POSITIVO;
        this.tipo=Sangre.O;
    }

    public BloodData(Sangre tipo, Rh factor) {
        this.tipo = tipo;
        this.factor = factor;
    }
    
    public Sangre getTipo() {
        return tipo;
    }

    public void setTipo(Sangre tipo) {
        this.tipo = tipo;
    }

    public Rh getFactor() {
        return factor;
    }

    public void setFactor(Rh factor) {
        this.factor = factor;
    }
    
    
}
