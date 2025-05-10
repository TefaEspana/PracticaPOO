package com.MinEdu.Colegio;

import com.MinEdu.Estudiantes.Estudiante;
import java.util.HashSet;
import java.util.Set;

public class Escuela {
    //Crea una clase llamada Escuela que represente una lista de estudiantes.
    // Utiliza una colección Set para almacenar los objetos Estudiante. Inicializa la colección en el constructor.
    private Set<Estudiante> listaEtudiente;
    public Escuela(){ //  Inicializa la colección (HashSet) en el constructor de Escuela.
        this.listaEtudiente = new HashSet<>();
    }
    // Metodos En Escuela
    //Implementa un metodo agregarEstudiante que permita agregar un estudiante a la lista.
    public void agregarEstudiante(Estudiante estudiante){
        this.listaEtudiente.add(estudiante);
    }
    //Implementa un metodo buscarEstudiante que permita buscar un estudiante por su número de identificación
    //y devuelva el objeto Estudiante correspondiente si se encuentra.
    public Estudiante buscarEstudiente (int numeroIdentificacion){//tipo de retorno del metodo (me va traer objetos de la clase Estudiente)
        for (Estudiante estudiante : listaEtudiente){ //Estudiante estudiante declara el tipo y la variable
            if (estudiante.getNumeroIdentificacion() == numeroIdentificacion){
                return estudiante;
            }
        }
        return null; //NO se usa Sout porque mezacla la responsabilida de buscar, en buscar e imprimir
    }
}
