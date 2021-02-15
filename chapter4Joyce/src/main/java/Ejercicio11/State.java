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
public class State {
    private String estado;
    private Integer poblacion;
    private City capital;
    private City maspoblado;
    
    public State(String estado, Integer poblacion, String nombre2, Integer po1,String nombre3, Integer po2){
        this.estado=estado;
        this.poblacion=poblacion;
        this.capital = new City(nombre2,po1);
        this.maspoblado= new City(nombre3, po2);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(String nombre, Integer po) {
        this.capital.setNombre(nombre);
        this.capital.setPoblacion(po);
    }

    public City getMaspoblado() {
        return maspoblado;
    }

    public void setMaspoblado(String nombre, Integer po) {
        this.maspoblado.setNombre(nombre);
        this.maspoblado.setPoblacion(po);
    }
    
    
}
