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
            System.out.println(" Seleccione la acción que desea realizar");
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

                    eliminarDatos();
                    break;
            }

        } while (opcion != 5);

    }
//---------------------------------------------------------------------------------------------------------

    public void ingresarValor() {

        char ingresaRegistro = 'n';
        boolean condicional1 = false;
        boolean condicional2 = false;
        boolean condicional3 = false;
        boolean condicional4 = false;

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

            do {
                System.out.print("Nota Parcial Uno: ");
                parcial_1 = sc.nextDouble();

                if (parcial_1 > -1 && parcial_1 < 21) {
                    System.out.println("++Nota validada");
                    condicional1 = true;
                } else {
                    System.out.println("--Nota no valida, por favor ingrese una nota del 0 al 20");

                }
            } while (condicional1 == false);

            do {
                System.out.print("Nota Parcial Dos: ");
                parcial_2 = sc.nextDouble();

                if (parcial_2 > -1 && parcial_2 < 21) {
                    System.out.println("++Nota validada");
                    condicional2 = true;
                } else {
                    System.out.println("--Nota no valida, por favor ingrese una nota del 0 al 20");

                }
            } while (condicional2 == false);

            do {
                System.out.print("Nota Zona: ");
                zona = sc.nextDouble();

                if (zona > -1 && zona < 31) {
                    System.out.println("++Nota validada");
                    condicional3 = true;
                } else {
                    System.out.println("--Nota no valida, por favor ingrese una nota del 0 al 30");

                }
            } while (condicional3 == false);

            do {
                System.out.print("Nota Examen Final: ");
                examenFinal = sc.nextDouble();

                if (examenFinal > -1 && examenFinal < 31) {
                    System.out.println("++Nota validada");
                    condicional4 = true;
                } else {
                    System.out.println("--Nota no valida, por favor ingrese una nota del 0 al 30");

                }
            } while (condicional4 == false);

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

        System.out.println("Id\tNombre \tApellido\tCarné\tParcial1\tParcial2\tZona \tFinal \tTotal\n");

        for (Alumno alumno : listAlumnos) {

            System.out.println(alumno.getNoAlumno() + "\t" + alumno.getNombre() + " \t" + alumno.getApellido()
                    + "\t" + alumno.getCarnet() + "\t" + alumno.getParcial_1() + "  \t\t" + alumno.getParcial_2()
                    + "\t\t" + alumno.getZona() + "  \t" + alumno.getExamenFinal()
                    + "  \t" + alumno.getTotal() + "\n");
        }

    }
//---------------------------------------------------------------------------------------------------------------------------

    public void modificarDatos() {

        int noAlumno2;
        int indice = 0;
        boolean condicional = false;
        boolean condicional1 = false;
        boolean condicional2 = false;
        boolean condicional3 = false;
        boolean condicional4 = false;

        do {
            System.out.print("Número del alumno que desea modificar: ");
            noAlumno2 = sc.nextInt();

            for (Alumno alumno : listAlumnos) {

                if (alumno.getNoAlumno() == noAlumno2) {
                    int opcion2;
                    condicional = true;

                    do {
                        System.out.println(" \t--Modificar Datos--");
                        System.out.println("   -------*MENÚ*---------");
                        System.out.println(" Seleccione el dato que desea modificar");
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

                                do {
                                    System.out.print("Ingrese la nueva nota del parcial uno: ");
                                    parcial_1 = sc.nextDouble();

                                    if (parcial_1 > -1 && parcial_1 < 21) {
                                        System.out.println("++Nota validada");
                                        condicional1 = true;
                                    } else {
                                        System.out.println("--Nota no valida, por favor ingrese una nota del 0 al 20");

                                    }
                                } while (condicional1 == false);

                                listAlumnos.get(indice).setParcial_1(parcial_1);
                                listAlumnos.get(indice).setTotal(alumno.getParcial_1() + alumno.getParcial_2()
                                        + alumno.getExamenFinal() + alumno.getZona());
                                break;

                            case 4:
                                System.out.println("\t---Parcial Dos---");

                                do {
                                    System.out.print("Ingrese la nueva nota del parcial dos: ");
                                    parcial_2 = sc.nextDouble();

                                    if (parcial_2 > -1 && parcial_2 < 21) {
                                        System.out.println("++Nota validada");
                                        condicional2 = true;
                                    } else {
                                        System.out.println("--Nota no valida, por favor ingrese una nota del 0 al 20");

                                    }
                                } while (condicional2 == false);

                                listAlumnos.get(indice).setParcial_2(parcial_2);
                                listAlumnos.get(indice).setTotal(alumno.getParcial_1() + alumno.getParcial_2()
                                        + alumno.getExamenFinal() + alumno.getZona());
                                break;

                            case 5:
                                System.out.println("\t---Zona---");

                                do {
                                    System.out.print("Ingrese la nueva zona: ");
                                    zona = sc.nextDouble();

                                    if (zona > -1 && zona < 31) {
                                        System.out.println("++Nota validada");
                                        condicional3 = true;
                                    } else {
                                        System.out.println("--Nota no valida, por favor ingrese una nota del 0 al 30");

                                    }
                                } while (condicional3 == false);

                                listAlumnos.get(indice).setZona(zona);
                                listAlumnos.get(indice).setTotal(alumno.getParcial_1() + alumno.getParcial_2()
                                        + alumno.getExamenFinal() + alumno.getZona());
                                break;

                            case 6:
                                System.out.println("\t---Examen Final---");

                                do {
                                    System.out.print("Ingrese la nueva nota del examen final: ");
                                    examenFinal = sc.nextDouble();

                                    if (examenFinal > -1 && examenFinal < 31) {
                                        System.out.println("++Nota validada");
                                        condicional4 = true;
                                    } else {
                                        System.out.println("--Nota no valida, por favor ingrese una nota del 0 al 30");

                                    }
                                } while (condicional4 == false);

                                listAlumnos.get(indice).setExamenFinal(examenFinal);
                                listAlumnos.get(indice).setTotal(alumno.getParcial_1() + alumno.getParcial_2()
                                        + alumno.getExamenFinal() + alumno.getZona());
                                break;
                        }

                    } while (opcion2 != 7);

                }

                indice++;

            }

            if (condicional == false) {
                System.out.println("--Número del alumno es incorrecto");

            }

        } while (condicional == false);

    }
//-----------------------------------------------------------------------------------------------------------------------------

    public void eliminarDatos() {

        int noAlumno2;
        int indice = 0;
        int eliminarNom;
        boolean condicional = false;

        do {
            System.out.print("Número del alumno que desea modificar: ");
            noAlumno2 = sc.nextInt();

            for (Alumno alumno : listAlumnos) {

                if (alumno.getNoAlumno() == noAlumno2) {
                    int opcion2;
                    condicional = true;

                    do {
                        System.out.println(" \t--Eliminar Datos--");
                        System.out.println("   -------*MENÚ*---------");
                        System.out.println(" Seleccione el dato que desa eliminar");
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
                                
                             //   indice = listAlumnos.indexOf(carnet);

                                listAlumnos.remove(carnet);
                                System.out.println("Carné eliminado con éxito");

                                listAlumnos.get(indice).setCarnet(carnet);
                                break;

                            case 2:

                                System.out.println("\t--Nombre y Apellido--");

                                System.out.println("1. Eliminar Nombre");
                                System.out.println("2. Eliminar Apellido");
                                System.out.print("--Opción: ");
                                eliminarNom = sc.nextInt();

                                if (eliminarNom != 1) {

                                    listAlumnos.remove(nombre);
                                    System.out.println("Nombre eliminado con éxito");

                                    listAlumnos.get(indice).setNombre(nombre);

                                } else {

                                    listAlumnos.remove(apellido);
                                    System.out.println("Apellido eliminado con éxito");

                                    listAlumnos.get(indice).setApellido(apellido);
                                }

                                break;

                            case 3:
                                System.out.println("\t---Parcial Uno--- ");

                                listAlumnos.remove(parcial_1);
                                System.out.println("Parcial Uno eliminado con éxito");

                                listAlumnos.get(indice).setParcial_1(parcial_1);
                                listAlumnos.get(indice).setTotal(alumno.getParcial_1() + alumno.getParcial_2()
                                        + alumno.getExamenFinal() + alumno.getZona());
                                break;

                            case 4:
                                System.out.println("\t---Parcial Dos---");

                                listAlumnos.remove(parcial_2);
                                System.out.println("Parcial Dos eliminado con éxito");

                                listAlumnos.get(indice).setParcial_2(parcial_2);
                                listAlumnos.get(indice).setTotal(alumno.getParcial_1() + alumno.getParcial_2()
                                        + alumno.getExamenFinal() + alumno.getZona());
                                break;

                            case 5:
                                System.out.println("\t---Zona---");

                                listAlumnos.remove(zona);
                                System.out.println("Zona eliminada con éxito");

                                listAlumnos.get(indice).setZona(zona);
                                listAlumnos.get(indice).setTotal(alumno.getParcial_1() + alumno.getParcial_2()
                                        + alumno.getExamenFinal() + alumno.getZona());
                                break;

                            case 6:
                                System.out.println("\t---Examen Final---");

                                listAlumnos.remove(examenFinal);
                                System.out.println("Examen Final eliminado con éxito");

                                listAlumnos.get(indice).setExamenFinal(examenFinal);
                                listAlumnos.get(indice).setTotal(alumno.getParcial_1() + alumno.getParcial_2()
                                        + alumno.getExamenFinal() + alumno.getZona());
                                break;
                        }

                    } while (opcion2 != 7);

                }

                indice++;

            }

            if (condicional == false) {
                System.out.println("--Número del alumno es incorrecto");

            }

        } while (condicional == false);

    }

}
