/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TwoDie {
    public static void main(String[] args) {
        Die dado1= new Die();
        Die dado2= new Die();
        Scanner pen = new Scanner(System.in);
        int n =1;
        do{
            System.out.println("El primer dado: "+ dado1.getCara());
            System.out.println("El segundo dado: "+dado2.getCara());
            
            System.out.println("Quieres lanzar de nuevo? [1]si  [0]no");
            n = pen.nextInt();
            dado1.lanzar();
            dado2.lanzar();
        }while(n!=0);
    }
}
