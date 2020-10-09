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

    ArrayList<Double> listaNumeros;

    public static void main(String[] args) {
        ListadoAlumnos miLista = new ListadoAlumnos();
        miLista.listaNumeros = new ArrayList();
        miLista.leerOpcion();
    }

    public void leerOpcion() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nLista de números");
            System.out.println("1 Agregar");
            System.out.println("2 Buscar");
            System.out.println("3 Modificar");
            System.out.println("4 Eliminar");
            System.out.println("5 Insertar elemento");
            System.out.println("6 Nostrar elemento");
            System.out.println("7 Salir");

            System.out.print("ingrese opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ingresarValor();
                    break;

                case 2:
                    buscarValor();
                    break;

                case 3:
                    modificarValor();
                    break;

                case 4:
                    eliminarValor();
                    break;

                case 5:
                    insertarValor();
                    break;

                case 6:
                    mostrarLista();
                    break;

            }
        } while (opcion != 7);
    }

    public void ingresarValor() {
        Scanner scn = new Scanner(System.in);
        double valor;
        System.out.println("ingrese valor");
        valor = scn.nextDouble();
        listaNumeros.add(valor);
    }

    public void buscarValor() {
        Scanner scn = new Scanner(System.in);
        double valor = 0;
        int indice = 0;
        System.out.println("valor a buscar");
        valor = scn.nextDouble();

        indice = listaNumeros.indexOf(valor);
        if (indice != -1) {
            System.out.println("Dato se encuentra en posicion" + indice);

        } else {
            System.out.println("Dato no se encuentra");
        }
    }

    public void modificarValor() {
        Scanner scn = new Scanner(System.in);
        double valor, nuevoValor;
        int indice;

        System.out.print("El número del alumno que desea modificar: ");
        valor = scn.nextInt();

        indice = listaNumeros.indexOf(valor);

        if (indice != -1) {

            System.out.println("Nuevo Valor: ");
            nuevoValor = scn.nextInt();
            listaNumeros.set(indice, nuevoValor);

        } else {
            System.out.println("Dato no se encuentra");
        }
    }

    public void eliminarValor() {
        Scanner scn = new Scanner(System.in);
        double valor;
        int indice;

        System.out.print("Valor a eliminar: ");
        valor = scn.nextDouble();
        indice = listaNumeros.indexOf(valor);

        if (indice != -1) {
            listaNumeros.remove(indice);
            System.out.println("Dato eliminado");
        } else {
            System.out.println("Dato no se encuentra");
        }
    }

    public void insertarValor() {
        Scanner scn = new Scanner(System.in);
        double valor;
        int indice;

        System.out.print("Valor a insertar: ");
        valor = scn.nextDouble();

        System.out.print("Posicion donde desea insertar: ");
        indice = scn.nextInt();
        listaNumeros.add(indice, valor);
    }

    public void mostrarLista() {
        if (listaNumeros.isEmpty()) {
            System.out.println("Elementos de la lista: ");
            /*
             for (int i = 0: i < listaNumeros.size(); i++){
             System.out.println(listaNumeros.get(i));
             }
             } else {
             System.out.println("No existen valores en la lista");
             }
             */
        }
    }
    /*
     int noAlumno;
     String nombre;
     String apellido;
     double carnet;
     double parcial_1;
     double parcial_2;
     double zona;
     double examenFinal;
     char ingresaRegistro = 'n';
     int opcion = 0;

    

    
     do {
     System.out.println("-------*MENÚ*---------");
     System.out.println("Seleccione la acción que desea realizar");
     System.out.println("1. Ingresar datos alumnos");
     System.out.println("2. Mostrar información ingresada ");
     System.out.println("3. Salir ");
     System.out.print("--Opción: ");
     opcion = sc.nextInt();

     switch (opcion) {
     case 1:

     System.out.println("\t--*Agregar Notas*--");

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
     System.out.print("Nota Parcial Dos: ");
     parcial_2 = sc.nextDouble();
     System.out.print("Zona: ");
     zona = sc.nextDouble();
     System.out.print("Examen Final: ");
     examenFinal = sc.nextDouble();

     listAlumnos.add(new Alumno(noAlumno, nombre, apellido, carnet, parcial_1, parcial_2, zona, examenFinal));

     System.out.println("  --¿Desa agregar algún otro dato? s/n");
     System.out.print("Respuesta: ");
     ingresaRegistro = sc.next().charAt(0);
     } while (ingresaRegistro == 's');
     break;

     case 2:
     System.out.println("\t---Ver Notas--- ");

     System.out.println("---------------------------------------------------");
     System.out.println("Proximamente Acutalización con nuevo menu de opciones");
     System.out.println("---------------------------------------------------\n");

     System.out.println("Id\tNombre\tParcial1\tParcial2\tZona\tFinal\tTotal\n");

     for (Alumno alumno : listAlumnos) {

     System.out.println(alumno.getNoAlumno() + "\t" + alumno.getNombre()
     + "\t" + alumno.getParcial_1() + "\t\t" + alumno.getParcial_2()
     + "\t\t" + alumno.getZona() + "\t" + alumno.getExamenFinal()
     + "\t" + alumno.getTotal());
     }
     break;

     case 3:
     System.out.println("\t---Modificar---");

                

     }

     }
     while (opcion 
     != 4);

     }
     */
}
