/*
Nombre:               Carné:
Mario Zavala           2000123
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

            }
        } while (opcion != 3);

    }
}
