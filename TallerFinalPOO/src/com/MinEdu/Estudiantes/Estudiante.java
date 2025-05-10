package com.MinEdu.Estudiantes;

public class Estudiante {
    //#1 Atributo con encapsulamiento (privados)
    //Crea una clase llamada Estudiante con los siguientes atributos:
    //Nombre (String), Número de Identificación (int) y Calificación (double)
    private String nombre;
    private int numeroIdentificacion;
    private double calificacion;
    //#2 constructoers
    //Buena Practica vacio
    public Estudiante() {
    }
    //Crea un constructor que permita inicializar estos atributos al crear una instancia de la clase Estudiante.
    public Estudiante(String nombre, int numeroIdentificacion, double calificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.calificacion = calificacion;
    }
    //#3 Setter y Getter
    //Implementa métodos get y set para todos los atributos.
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    // Metodo mostrarEstudiente (lo puse yo para mostrar los datos del estudiente, no lo pido la actividad)
    public void mostrarEstudiente(){
        System.out.println("--Datos del estudiante--");
        System.out.println("Codigo: "+ numeroIdentificacion);
        System.out.println("Nombre: "+nombre);
        System.out.println("Calificacion: "+calificacion+"\n");
    }
}
