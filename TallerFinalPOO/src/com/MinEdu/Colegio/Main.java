package com.MinEdu.Colegio;

import com.MinEdu.Estudiantes.Estudiante;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //En el metodo main, crea una instancia ("objeto") de la clase Escuela.
        Escuela escuela = new Escuela();
        //Agrega al menos tres estudiantes a la lista utilizando el metodo agregarEstudiante.
        escuela.agregarEstudiante(new Estudiante("Ana",1,8));
        escuela.agregarEstudiante(new Estudiante("Tefa",2,6));
        escuela.agregarEstudiante(new Estudiante("Pepe",3,5));
//        // Busca un estudiante por su número de identificación utilizando el metodo buscarEstudiante
//        Estudiante estudianteEncontrado = escuela.buscarEstudiente(3);
//        // y muestra su información en pantalla
//        if (estudianteEncontrado != null) {
//            estudianteEncontrado.mostrarEstudiente();
//        } else {
//            System.out.println("No se encontró ningún estudiante con el ID: 3");
//        }
        //4. Interacción con el Usuario
        //Implementa un menú de texto en el metodo main que permita al usuario realizar las siguientes operaciones:
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1) Agregar un nuevo estudiante");
            System.out.println("2) Buscar un estudiante por # de identificación");
            System.out.println("3) Salir\n");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el # de identificacion del estudiente: ");
                    int idNuevo = scanner.nextInt();
                    scanner.nextLine();
                    // Validar si #Id existe
                    if (escuela.buscarEstudiente(idNuevo)!=null){
                        System.out.println("Lo siento, Ya exite ese #Id");
                    }else {
                        System.out.println("Ingrese el nombre del estudiente: ");
                        String nombreNuevo = scanner.nextLine();
                        System.out.println("Ingrese la calificacion del estudiente: ");
                        double calificacionNueva = scanner.nextDouble();
                        // Validar la calificación
                        if (calificacionNueva >= 0 && calificacionNueva <= 10){
                            Estudiante estudianteNuevo = new Estudiante(nombreNuevo, idNuevo, calificacionNueva);
                            escuela.agregarEstudiante(estudianteNuevo);
                            System.out.println("Estudiente agragado con exito.\n");
                        }else {
                            System.out.println("Lo siento, las caificaciones deben estar en el rango indicado 0 a 10\n");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el # de identificacion del estudiente que desea buscar:");
                    int idParaBuscar = scanner.nextInt();
                    Estudiante estudianteEncontrado = escuela.buscarEstudiente(idParaBuscar);
                    if (estudianteEncontrado != null) {
                        estudianteEncontrado.mostrarEstudiente();
                    } else {
                        System.out.println("No se encontró ningún estudiante con el ID: #"+idParaBuscar+"\n");
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.\n");
            }
        } while (opcion != 3);
        scanner.close();
    }
}
