/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TestCertificateOfDeposit {
    public static void main(String[] args) {
        Scanner pen= new Scanner(System.in);
        CertificateOfDeposit cer=new CertificateOfDeposit();
        System.out.println("Dame numero de certificado");
        cer.setCertificado(pen.nextInt());
        System.out.println("Dame tu apellido");
        cer.setApellido(pen.next());
        System.out.println("Dame tu saldo");
        cer.setSaldo(pen.nextInt());
        System.out.println("Dame tu fecha de emision");
        cer.setEmicion(pen.nextInt(),pen.nextInt(),pen.nextInt());
        
        cer.mostrar();
    }
}
