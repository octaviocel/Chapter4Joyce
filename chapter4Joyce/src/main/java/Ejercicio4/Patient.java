/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author DELL
 */
public class Patient {
    private Integer id;
    private Integer edad;
    private BloodData sangre;

    public Patient() {
        this.id=0;
        this.edad=0;
        this.sangre= new BloodData();
    }

    public Patient(Integer id, Integer edad, BloodData sangre) {
        this.id = id;
        this.edad = edad;
        this.sangre = sangre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public BloodData getSangre() {
        return sangre;
    }

    public void setSangre(BloodData sangre) {
        this.sangre=sangre;
    }
    
    
}
