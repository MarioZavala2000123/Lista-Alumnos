package uspg.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class ListadoAlumnos {

    public static Scanner sc = new Scanner(System.in);
    List<Alumno> listAlumnos = new ArrayList();

    public static double noAlumno;
    public static String nombre;
    String apellido;
    public static double carnet;
    public static double parcial_1;
    public static double parcial_2;
    public static double zona;
    public static double examenFinal;

    public static void main(String[] args) {
        ListadoAlumnos lista = new ListadoAlumnos();
        lista.listAlumnos = new ArrayList();
        lista.Listado();
    }
//---------------------------------------------------------------------------------------------------------

    public void Listado() {

        int opcion;

        do {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("   -------*MENÚ PRINCIPAL*---------");
            System.out.println("Seleccione la acción que desea realizar");
            System.out.println("1. Ingresar datos alumnos");
            System.out.println("2. Mostrar información ingresada ");
            System.out.println("3. Modificar Datos");
            System.out.println("4. Eliminar Datos");
            System.out.println("5. Salir");
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

                case 4:
                    System.out.println("\t---Eliminar---");

                    break;
            }

        } while (opcion != 5);

    }
//---------------------------------------------------------------------------------------------------------

    public void ingresarValor() {

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
/*
            //FALTA BUCLE
            if (parcial_1 <= 0 || parcial_1 <= 20) {

                System.out.println("Nota no valida, por favor ingrese una nota "
                        + "del 0 al 20");

                System.out.print("Nota Parcial Uno: ");
                parcial_1 = sc.nextDouble();
            }
*/
            System.out.print("Nota Parcial Dos: ");
            parcial_2 = sc.nextDouble();
/*
            if (parcial_2 <= 0 || parcial_2 <= 20) {

                System.out.println("Nota no valida, por favor ingrese una nota "
                        + "del 0 al 20");

                System.out.print("Nota Parcial Dos: ");
                parcial_2 = sc.nextDouble();
            }
*/
            System.out.print("Zona: ");
            zona = sc.nextDouble();
/*
            if (zona <= 0 || zona <= 30) {

                System.out.println("Nota no valida, por favor ingrese una nota "
                        + "del 0 al 30");

                System.out.print("Zona: ");
                zona = sc.nextDouble();
            }
*/
            System.out.print("Examen Final: ");
            examenFinal = sc.nextDouble();
/*
            if (examenFinal <= 0 || examenFinal <= 20) {

                System.out.println("Nota no valida, por favor ingrese una nota "
                        + "del 0 al 20");

                System.out.print("Examen Final: ");
                examenFinal = sc.nextDouble();
            }
*/
            listAlumnos.add(new Alumno(noAlumno, nombre, apellido, carnet,
                    parcial_1, parcial_2, zona, examenFinal));

            System.out.println("  --¿Desa agregar algún otro dato? s/n");
            System.out.print("Respuesta: ");
            ingresaRegistro = sc.next().charAt(0);

        } while (ingresaRegistro == 's');

    }
//-------------------------------------------------------------------------------------------------------------------------

    public void mostrarNotas() {

        System.out.println("---------------------------------------------------");
        System.out.println("Proximamente Acutalización con nuevo menu de opciones");
        System.out.println("---------------------------------------------------\n");

        System.out.println("Id\tNombre \tApellido\tParcial1\tParcial2\tZona \tFinal \tTotal\n");

        for (Alumno alumno : listAlumnos) {

            System.out.println(alumno.getNoAlumno() + "\t" + alumno.getNombre() + " \t" + alumno.getApellido()
                    + "  \t\t" + alumno.getParcial_1() + "  \t\t" + alumno.getParcial_2()
                    + "\t\t" + alumno.getZona() + "  \t" + alumno.getExamenFinal()
                    + "  \t" + alumno.getTotal() + "\n");
        }

    }
//---------------------------------------------------------------------------------------------------------------------------

    public void modificarDatos() {

        int noAlumno2;
        int indice = 0;
        boolean act = false;

        System.out.println("Número del alumno que desea modificar");
        noAlumno2 = sc.nextInt();

        for (Alumno alumno : listAlumnos) {

            if (alumno.getNoAlumno() == noAlumno2) {
                int opcion2;
                act = true;
                do {
                    System.out.println("\t--Modificar Datos--");
                    System.out.println("-------*MENÚ*---------");
                    System.out.println("Seleccione la acción que desea realizar");
                    System.out.println("1. Carné");
                    System.out.println("2. Nombre y Apellido");
                    System.out.println("3. Parcial Uno");
                    System.out.println("4. Parcial Dos");
                    System.out.println("5. Zona");
                    System.out.println("6. Examen Final");
                    System.out.println("7. Salir");
                    System.out.print("--Opción: ");
                    opcion2 = sc.nextInt();

                    switch (opcion2) {

                        case 1:
                            System.out.println("\t--Carné--");

                            System.out.print("Ingrese el nuevo carné: ");
                            carnet = sc.nextInt();

                            listAlumnos.get(indice).setCarnet(carnet);
                            break;

                        case 2:

                            System.out.println("\t--Nombre y Apellido--");

                            System.out.print("Nuevo nombre: ");
                            nombre = sc.next();

                            listAlumnos.get(indice).setNombre(nombre);

                            System.out.print("Nuevo apellido: ");
                            apellido = sc.next();
                            listAlumnos.get(indice).setApellido(apellido);
                            break;

                        case 3:
                            System.out.println("\t---Parcial Uno--- ");
                            System.out.print("Ingrese la nueva nota del parcial uno: ");
                            parcial_1 = sc.nextDouble();

                            listAlumnos.get(indice).setParcial_1(parcial_1);
                            listAlumnos.get(indice).setTotal(alumno.getParcial_1() + alumno.getParcial_2()
                                    + alumno.getExamenFinal() + alumno.getZona());
                            break;

                        case 4:
                            System.out.println("\t---Parcial Dos---");

                            System.out.print("Ingrese la nueva nota del parcial dos: ");
                            parcial_2 = sc.nextDouble();

                            listAlumnos.get(indice).setParcial_2(parcial_2);
                            listAlumnos.get(indice).setTotal(alumno.getParcial_1() + alumno.getParcial_2()
                                    + alumno.getExamenFinal() + alumno.getZona());
                            break;

                        case 5:
                            System.out.println("\t---Zona---");

                            System.out.print("Ingrese la nueva zona: ");
                            zona = sc.nextDouble();

                            listAlumnos.get(indice).setZona(zona);
                            listAlumnos.get(indice).setTotal(alumno.getParcial_1() + alumno.getParcial_2()
                                    + alumno.getExamenFinal() + alumno.getZona());
                            break;

                        case 6:
                            System.out.println("\t---Examen Final---");

                            System.out.print("Ingrese la nueva nota del examen final: ");
                            examenFinal = sc.nextDouble();

                            listAlumnos.get(indice).setExamenFinal(examenFinal);
                            listAlumnos.get(indice).setTotal(alumno.getParcial_1() + alumno.getParcial_2()
                                    + alumno.getExamenFinal() + alumno.getZona());
                            break;
                    }
                } while (opcion2 != 7);
            }
            indice++;
        }
        if (act == false) {
            System.out.println("Número del alumno es incorrecto");
            //return noAlumno2;
        }
           // break;

    }
//-----------------------------------------------------------------------------------------------------------------------------

    public void eliminarDatos() {

    }

}
