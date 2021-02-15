/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.util.GregorianCalendar;

/**
 *
 * @author DELL
 */
public class CertificateOfDeposit {
    private Integer certificado;
    private String apellido;
    private Integer saldo;
    private Fecha emicion;
    private Fecha vencimiento;

    public CertificateOfDeposit(){
        
    }
    
    public CertificateOfDeposit(Integer certificado, String apellido, Integer saldo, Fecha emicion) {
        this.certificado = certificado;
        this.apellido = apellido;
        this.saldo = saldo;
        this.emicion=emicion;
        this.vencimiento=new Fecha(this.emicion.getDia(),this.emicion.getMes(),(this.emicion.getAnio()+1));
    }

    public Integer getCertificado() {
        return certificado;
    }

    public void setCertificado(Integer certificado) {
        this.certificado = certificado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Fecha getEmicion() {
        return emicion;
    }

    public void setEmicion(Integer dia, Integer mes, Integer anio) {
        this.emicion = new Fecha(dia,mes,anio);
    }

    public Fecha getVencimiento() {
        return vencimiento;
    }

    
    public void mostrar(){
        System.out.println("El certificado numero: "+ this.certificado);
        System.out.println("De la persona: "+this.apellido);
        System.out.println("Con saldo: "+this.saldo);
        System.out.println(String.format("Fecha de emision: %d/%d/%d", this.emicion.getDia(),this.emicion.getMes(),this.emicion.getAnio()));
        System.out.println(String.format("Fecha de vencimiento: %d/%d/%d", this.vencimiento.getDia(),this.vencimiento.getMes(),this.vencimiento.getAnio()));
    }
    
}
