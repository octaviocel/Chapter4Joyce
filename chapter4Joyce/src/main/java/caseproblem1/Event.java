/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

/**
 *
 * @author DELL
 */
public class Event {
    private final static Integer precioinvitado = 35;
    private final static Integer tipoevento = 50;
    
    private String nevento;
    private Integer invitados;
    private Integer precio;
    
    public Event(){
        this.nevento="A000";
        this.invitados=0;
    }

    public Event(String nevento, Integer invitados) {
        this.nevento = nevento;
        this.invitados = invitados;
        this.precio= invitados*precioinvitado;
    }

    
    public void setEvento(String nevento) {
        this.nevento = nevento;
    }

    public void setInvitados(Integer invitados) {
        this.invitados = invitados;
        this.precio= invitados*precioinvitado;
    }

    public String getNevento() {
        return nevento;
    }

    public Integer getInvitados() {
        return invitados;
    }

    public Integer getPrecio() {
        return precio;
    }
    
    public void mostrar(){
        System.out.println(String.format("Evento No.%s\nTotal Invitados: %d\nCosto Total: $%d", this.nevento,this.invitados,this.precio));
        this.costo();
    }

    private void costo(){
        System.out.println("Precio por invitado $35");
        if(this.invitados >= 50){
            System.out.println("Evento grande");
        }else{
            System.out.println("Evento chico");
        }
    }
    
    public static void logo(){
        System.out.println("----------------------");
        System.out.println("-  Carly’s Catering  -");
        System.out.println("-    party foods     -");
        System.out.println("----------------------");
    }
}
