/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

import java.util.Scanner;

/**
 *
 * @author marioz
 */
public class Alumno {
    Scanner scn = new Scanner(System.in);
    

    double noAlumno;
    String nombre;
    String apellido;
    double carnet;
    double parcial_1;
    double parcial_2;
    double examenFinal;
    double zona;
    double total;
    
    Alumno(){}

    public Alumno(double noAlumno, String nombre, String apellido, double carnet,
            double parcial_1, double parcial_2,double zona, double examenFinal) {
        this.noAlumno = noAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.parcial_1 = parcial_1;
        this.parcial_2 = parcial_2;
        this.examenFinal = examenFinal;
        this.zona=zona;
         this.total = parcial_1+parcial_2+zona+examenFinal;
    }

    public double getNoAlumno() {
        return noAlumno;
    }

    public void setNoAlumno(double noAlumno) {
        this.noAlumno = noAlumno;
    }
    
    
   /* 
    public int getNoAlumno() {
        return noAlumno;
    }

    public void setNoAlumno(int noAlumno) {
        this.noAlumno = noAlumno;
    }
*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getCarnet() {
        return carnet;
    }

    public void setCarnet(double carnet) {
        this.carnet = carnet;
    }

    public double getParcial_1() {
        return parcial_1;
    }

    public void setParcial_1(double parcial_1) {
        this.parcial_1 = parcial_1;
    }

    public double getParcial_2() {
        return parcial_2;
    }

    public void setParcial_2(double parcial_2) {
        this.parcial_2 = parcial_2;
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }

    public double getZona() {
        return zona;
    }

    public void setZona(double zona) {
        this.zona = zona;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
    public void noAlumno() {
        noAlumno = scn.nextInt();
    }
    
   
}

