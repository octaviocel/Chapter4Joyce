/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author DELL
 */
public class YearEnd {

    private Integer dia;
    private Integer mes;
    private Integer anio;

    public YearEnd() {
        this.inicializar();
    }

    public YearEnd(Integer dia, Integer mes, Integer anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String diasFaltantes() {        
        return "Faltan " + (bisisesto()-diaActual()) + " para el siguiente año.";
    }

    public Integer bisisesto(){
        return getAnio() % 4 == 0 ? 366 : 365;
    }
    
    public Integer diaActual(){
        return diaActual(this.mes-1)+ this.dia;
    }
    
    private Integer diaActual(Integer a){
        if(a==1){
            return diasMes(a);
        }else{
            return diasMes(a)+ diaActual(a-1);
        }
    }
    public void inicializar() {
        setDia((Integer) 1);
        setMes((Integer) 1);
        setAnio((Integer) 2000);
    }

    private Integer diasMes(Integer a) {
        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return getAnio() % 4 == 0 ? 29 : 28;
            /*if( anio % 4 == 0){
                    return 29;
                }else{
                    return 28;
                }*/
            default:
                return -1;

        }
    }
}
