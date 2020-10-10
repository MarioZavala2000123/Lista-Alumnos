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
    /*
     Menu
     1. Ingreso notas
     2. Listar
     3. Modificar
     1.id que desea modificar
     seleccione el registro que desea modificar 
     1.Nombre
     2.Parcial Uno
     3.Parcial Dos
     4.Zona
     5.Examen Final
     4. Salir
     */

    ArrayList<Alumno> listaAlumnos;

    public static void main(String[] args) {
        ListadoAlumnos lista = new ListadoAlumnos();
        lista.listaAlumnos = new ArrayList();
        lista.Listado();
    }

    public void Listado() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-------*MENÚ*---------");
            System.out.println("Seleccione la acción que desea realizar");
            System.out.println("1. Ingresar datos alumnos");
            System.out.println("2. Mostrar información ingresada ");
            System.out.println("3. Modificar ");
            System.out.println("4. Salir");
            System.out.print("--Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("\t--*Agregar Notas*--");

                    ingresarValor();
                    break;

                case 2:
                    System.out.println("\t---Ver Notas--- ");

                    mostrarNotas();
                    break;

                case 3:
                    System.out.println("\t---Modificar---");

                    modificarDatos();
                    break;
            }

        } while (opcion != 4);

    }
//-------------------------------------------------------------------------------

    public void ingresarValor() {
        Scanner sc = new Scanner(System.in);

        double noAlumno;
        String nombre;
        String apellido;
        double carnet;
        double parcial_1;
        double parcial_2;
        double zona;
        double examenFinal;
        char ingresaRegistro = 'n';

        System.out.println("---------------------------------------------------");
        System.out.println("Bienvenidos a la base de datos de Escuela Nacional");
        System.out.println("---------------------------------------------------\n");

        do {

            System.out.println("\tIngresar datos de los estudiantes");
            System.out.print("Número de alumno: ");
            noAlumno = sc.nextDouble();
            System.out.print("Nombre: ");
            nombre = sc.next();
            System.out.print("Apellido: ");
            apellido = sc.next();
            System.out.print("Carné: ");
            carnet = sc.nextDouble();
            System.out.print("Nota Parcial Uno: ");
            parcial_1 = sc.nextDouble();
            System.out.print("Nota Parcial Dos: ");
            parcial_2 = sc.nextDouble();
            System.out.print("Zona: ");
            zona = sc.nextDouble();
            System.out.print("Examen Final: ");
            examenFinal = sc.nextDouble();

            listaAlumnos.add(new Alumno(noAlumno, nombre, apellido, carnet, parcial_1, parcial_2, zona, examenFinal));

            System.out.println("  --¿Desa agregar algún otro dato? s/n");
            System.out.print("Respuesta: ");
            ingresaRegistro = sc.next().charAt(0);
        } while (ingresaRegistro == 's');

    }
//-------------------------------------------------------------------------------

    public void mostrarNotas() {

        System.out.println("---------------------------------------------------");
        System.out.println("Proximamente Acutalización con nuevo menu de opciones");
        System.out.println("---------------------------------------------------\n");

        System.out.println("Id\tNombre\tParcial1\tParcial2\tZona\tFinal\tTotal\n");

        for (Alumno alumno : listaAlumnos) {

            System.out.println(alumno.getNoAlumno() + "\t" + alumno.getNombre()
                    + "\t" + alumno.getParcial_1() + "\t\t" + alumno.getParcial_2()
                    + "\t\t" + alumno.getZona() + "\t" + alumno.getExamenFinal()
                    + "\t" + alumno.getTotal());
        }

    }
//-------------------------------------------------------------------------------

    public void modificarDatos() {

        Scanner scn = new Scanner(System.in);
        int opcion;
        /*
         3. Modificar
         1.id que desea modificar
         seleccione el registro que desea modificar 
         1.Nombre
         2.Parcial Uno
         3.Parcial Dos
         4.Zona
         5.Examen Final
         */

        double noAlumno;
        String nombre;
        String apellido;
        double carnet;
        double parcial_1;
        double parcial_2;
        double zona;
        double examenFinal;

        double valor, nuevoValor;
        int indice;

        System.out.print("El número del alumno que desea modificar: ");
        valor = scn.nextInt();

        indice = listaAlumnos.indexOf(valor);

        if (indice != -1) {

            System.out.println("Nuevo Valor: ");
            nuevoValor = scn.nextInt();

           // listaAlumnos.set(indice, nuevoValor);
           // listaAlumnos.set(new Alumno(noAlumno, nombre, apellido, carnet, parcial_1, parcial_2, zona, examenFinal));
        } else {
            System.out.println("Dato no se encuentra");

        }

        System.out.println("Número del alumno que desea modificar");
        noAlumno = scn.nextDouble();

        if (noAlumno != 0) {
            System.out.println("Número del alumno que desea modificar");
            noAlumno = scn.nextDouble();
            do {
                System.out.println("-------*MENÚ*---------");
                System.out.println("Seleccione la acción que desea realizar");
                System.out.println("1. Nombre");
                System.out.println("2. Parcial Uno");
                System.out.println("3. Parcial Dos");
                System.out.println("4. Zona");
                System.out.println("5. Examen Final");
                System.out.println("6. Salir");
                System.out.print("--Opción: ");
                opcion = scn.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("\t--Nombre--");

                        break;

                    case 2:
                        System.out.println("\t---Parcial Uno--- ");

                        break;

                    case 3:
                        System.out.println("\t---Parcial Dos---");

                        break;

                    case 6:
                        System.out.println("\t---Zona---");

                        break;

                    case 5:
                        System.out.println("\t---Examen Final---");

                        break;
                }

            } while (opcion != 6);

        } else {
            System.out.println("Dato no se encuentra");

        }
    }

}
