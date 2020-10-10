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

    public static Scanner sc = new Scanner(System.in);
    List<Alumno> listAlumnos = new ArrayList();

    public static void main(String[] args) {
        ListadoAlumnos lista = new ListadoAlumnos();
        lista.listAlumnos = new ArrayList();
        lista.Listado();
    }

    public void Listado() {
     
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
            noAlumno = sc.nextInt();
            System.out.print("Nombre: ");
            nombre = sc.next();
            System.out.print("Apellido: ");
            apellido = sc.next();
            System.out.print("Carné: ");
            carnet = sc.nextInt();
            System.out.print("Nota Parcial Uno: ");
            parcial_1 = sc.nextDouble();

            if (parcial_1 <= 0 || parcial_1 <= 20) {

                System.out.println("Nota no valida, por favor ingrese una nota "
                        + "del 0 al 20");

                System.out.print("Nota Parcial Uno: ");
                parcial_1 = sc.nextDouble();
            }

            System.out.print("Nota Parcial Dos: ");
            parcial_2 = sc.nextDouble();

            if (parcial_2 <= 0 || parcial_2 <= 20) {

                System.out.println("Nota no valida, por favor ingrese una nota "
                        + "del 0 al 20");

                System.out.print("Nota Parcial Dos: ");
                parcial_2 = sc.nextDouble();
            }

            System.out.print("Zona: ");
            zona = sc.nextDouble();

            if (zona <= 0 || zona <= 30) {

                System.out.println("Nota no valida, por favor ingrese una nota "
                        + "del 0 al 30");

                System.out.print("Zona: ");
                zona = sc.nextDouble();
            }

            System.out.print("Examen Final: ");
            examenFinal = sc.nextDouble();

            if (examenFinal <= 0 || examenFinal <= 20) {

                System.out.println("Nota no valida, por favor ingrese una nota "
                        + "del 0 al 20");

                System.out.print("Examen Final: ");
                examenFinal = sc.nextDouble();
            }

            listAlumnos.add(new Alumno(noAlumno, nombre, apellido, carnet, parcial_1, parcial_2, zona, examenFinal));

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

        for (Alumno alumno : listAlumnos) {

            System.out.println(alumno.getNoAlumno() + "\t" + alumno.getNombre()
                    + "\t" + alumno.getParcial_1() + "\t\t" + alumno.getParcial_2()
                    + "\t\t" + alumno.getZona() + "\t" + alumno.getExamenFinal()
                    + "\t" + alumno.getTotal() + "\n");
        }

    }
//-------------------------------------------------------------------------------

    public void modificarDatos() {

        
        int opcion2;

        double noAlumno;
        String nombre, apellido;
        double carnet, parcial_1, parcial_2, zona, examenFinal;

        String nuevoNom, nuevoApellido;
        double nuevocarnet, nuevoparcial_1, nuevoparcial_2, nuevozona, nuevoexamenFinal;

        //     System.out.println("Número del alumno que desea modificar");
        //     noAlumno = scn.nextDouble();
        //     if (noAlumno != 0) {
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
            opcion2 = sc.nextInt();

            switch (opcion2) {
                case 1:

                    System.out.println("\t--Nombre--");

                    //    System.out.print("Nuevo nombre: ");
                    //    nombre = scn.next();
                    //    System.out.print("Nuevo apellido: ");
                    //     apellido = scn.next();
                    System.out.println("*******************");
                    //  System.out.println("El nombre anterior era: " + nombre + " " + apellido);
                    System.out.println("*******************");
                    //    System.out.println("El nombre se cambio por: " + nuevoNom + " " + nuevoApellido);
                    System.out.println("*******************");
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

        } while (opcion2 != 6);

        //  } else {
        //     System.out.println("Dato no se encuentra");
        // }
    }

}
