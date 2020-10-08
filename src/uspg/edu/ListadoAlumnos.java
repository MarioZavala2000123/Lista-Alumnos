/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marioz
 */
public class ListadoAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Alumno> listAlumnos = new ArrayList();

        int noAlumno;
        String nombre;
        String apellido;
        double carnet;
        double parcial_1;
        double parcial_2;
        double zona;
        double examenFinal;
        double total;
        char ingresaRegistro = 'n';

        do {

            System.out.println("ingresar los que se le solicita:");
            System.out.print("Número de alumno:");
            noAlumno = sc.nextInt();
            System.out.print("Nombre:");
            nombre = sc.next();
            System.out.print("Apellido:");
            apellido = sc.next();
            System.out.print("Carné:");
            carnet = sc.nextInt();
            System.out.print("Parcial numero uno:");
            parcial_1 = sc.nextDouble();
            System.out.print("Parcial numero dos:");
            parcial_2 = sc.nextDouble();
            System.out.print("Zona del alumno:");
            zona = sc.nextDouble();
            System.out.print("Examen final:");
            examenFinal = sc.nextDouble();

            listAlumnos.add(new Alumno(noAlumno, nombre, apellido, carnet, parcial_1, parcial_2, examenFinal));

            System.out.println("Desa ingresar algo mas? s/n");
            ingresaRegistro = sc.next().charAt(0);
        } while (ingresaRegistro == 's');

        System.out.println("Id\tNombre\tParcial1\tParcial2\tZona\tFinal\tTotal");
        for (Alumno alumno : listAlumnos) {

            System.out.println(alumno.getNoAlumno()
                    + "\t" + alumno.getNombre()
                    + "\t" + alumno.getParcial_1()
                    + "\t\t" + alumno.getParcial_2()
                    + "\t\t" + alumno.getZona()
                    + "\t" + alumno.getExamenFinal()
                    + "\t" + alumno.getTotal());
        }

        for (Alumno alumno : listAlumnos) {

            alumno.setZona(0);

            System.out.println(alumno.getNoAlumno()
                    + "\t" + alumno.getNombre()
                    + "\t" + alumno.getParcial_1()
                    + "\t\t" + alumno.getParcial_2()
                    + "\t\t" + alumno.getZona()
                    + "\t" + alumno.getExamenFinal()
                    + "\t" + alumno.getTotal());
        }

    }

}
