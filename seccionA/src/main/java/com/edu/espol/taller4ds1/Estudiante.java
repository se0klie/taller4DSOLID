package com.edu.espol.taller4ds1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author hailiejimenez
 */
public class Estudiante {
    DatosPersonales datos;
    Materia materias[];
    //getters y setters
}

class DatosPersonales{
    private String cedula;
    private String nombreCompleto;
    private String correoElectronico;
    //getters y setters
}

class Materia{
    private String IDMateria;
    private String nombre;
    private Profesor profesor;
    private Tarea tareas[];
    //getters y setters
}

class Profesor{
    private DatosPersonales datos;
    private Materia materias[];
    //getters y setters
}

class Tarea{
    private String idTarea;
    private Materia materia;
    private String contenido;
    //getters y setters
}