/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        FiveDice dado= new FiveDice();
        int n=1;
        Scanner pen = new Scanner(System.in);
        do{
        dado.getDados();        
        System.out.println("Hay "+ dado.combinacion()+" numeros del mismo tipo");
        System.out.println("Quieres seguir lanzando [1]si  [0]no");
        n=pen.nextInt();  
        dado.lanzar();
        }while(n!=0);
    }
}
