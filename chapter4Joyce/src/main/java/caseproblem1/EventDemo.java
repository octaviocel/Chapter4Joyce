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
public class EventDemo {
    public static void main(String[] args) {
        Event ev1= new Event();
        Event ev2= new Event("R545",81);
        
        Event.logo();
        ev1.mostrar();
        System.out.println("\n\n");
        ev2.mostrar();
    }
}
