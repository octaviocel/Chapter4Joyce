/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

/**
 *
 * @author DELL
 */
public class Rental {

    private final static int hora = 60;
    private final static int rentahora = 40;
    
    private String contrato;
    private Integer horas;
    private Integer min;
    private Integer precio;
    
    public Rental(){
        this.setContrato("A000");
        this.setHorasAndMin(0, 0);
    }
    
    public Rental(String contrato, Integer horas, Integer min){
        this.setContrato(contrato);
        this.setHorasAndMin(horas, min);
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public void setHorasAndMin(Integer horas, Integer min) {
        this.horas = horas;
        this.min=min;
        this.precio=(this.horas*rentahora)+this.min;
    }

    public String getContrato() {
        return contrato;
    }

    public Integer getHoras() {
        return horas;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getPrecio() {
        return precio;
    }
    
    public void mostrar(){
        System.out.println(String.format("Renta No. %s\nHoras: %d\nMinutos: %d\nCosto total: $%d", this.contrato,this.horas,this.min,this.precio));
    }
    
    public static void logo(){
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("<   Sammy’s Seashore   <");
        System.out.println("< Rents Beach Equipmen <");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
    }
    
}
