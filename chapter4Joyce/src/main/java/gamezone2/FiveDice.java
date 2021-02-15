/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import gamezone1.Die;

/**
 *
 * @author DELL
 */
public class FiveDice {
    private Die[] dados;
    
    public FiveDice(){
        this.dados= new Die[5];
        this.lanzar();
    }
    
    public Integer combinacion(){
        int contador=0,mayor=0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 5; j++) {
                if(this.dados[j].getCara()==i){
                    contador++;
                }
            }
            if(contador>mayor){
                mayor=contador;
            }
            contador=0;
        }
        
        return mayor;
    }
    public void lanzar(){
        for (int i = 0; i < 5; i++) {
            this.dados[i]=new Die();
        }
    }
    
    public void getDados(){
        for (int i = 0; i < 5; i++) {
            System.out.println(this.dados[i].getCara());   
        }
    }
}
