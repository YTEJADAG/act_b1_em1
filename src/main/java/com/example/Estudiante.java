package com.example;

public class Estudiante {
    // TODO: Declarar atributos privados para nombre, edad y promedio

    private String nombre;
    private int edad;
    private double promedio;
    
    // TODO: Crear constructor que reciba nombre, edad y promedio como parámetros

    public Estudiante (String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    
    // TODO: Implementar métodos getter para cada atributo

    public String getnombre (){
        return nombre;
    }

    public int getedad (){
        return edad;
    }

    public int getpromedio (){
        return promedio;
    }
    
    // TODO: Implementar métodos setter para cada atributo

     public void setnombre (String nombre){
        this.nombre = nombre;
    }

     public void setedad (int edad){
        if (edad >= 0){
            this.edad = edad;
            else {
                System.out.println(La edad no es correcta);
            }
        }
        
    }

    public void setpromedio (double promedio){
        
        this.promedio = promedio;
    }


    // Nota: En el setter de edad, validar que sea mayor o igual a 0
    // Nota: En el setter de promedio, validar que esté entre 0.0 y 10.0
    
    // TODO: Crear método mostrarInformacion que imprima los datos del estudiante
    
   
}
