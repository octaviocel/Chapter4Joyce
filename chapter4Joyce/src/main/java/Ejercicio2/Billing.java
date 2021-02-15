/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author DELL
 */
public class Billing {
    private Integer precioLibro;
    private Integer cantidad;
    private Integer cupon;
    private final Double tax=0.08;

    public Integer getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(Integer precioLibro) {
        this.precioLibro = precioLibro;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCupon() {
        return cupon;
    }

    public void setCupon(Integer cupon) {
        this.cupon = cupon;
    }
    
    public String computeBill(Integer preciolibro){
        this.precioLibro=preciolibro;
        return "El costo total es: "+ (this.getPrecioLibro()+(this.getPrecioLibro()*tax));
    }
    
    public String computeBill(Integer preciolibro, Integer cantidad){
        this.precioLibro=preciolibro;
        this.cantidad = cantidad;
        int c= this.getCantidad()*this.getPrecioLibro();
        return "El costo total es: "+ (c+(c*tax));
    }
    
    public String computeBill(Integer preciolibro,Integer cantidad,Integer cupon){
        this.precioLibro=preciolibro;
        this.cantidad = cantidad;
        this.cupon = cupon;
        int c= (this.getCantidad()*this.getPrecioLibro())-this.getCupon();
        return "El costo total es: "+ (c+(c*tax));
    }
}
