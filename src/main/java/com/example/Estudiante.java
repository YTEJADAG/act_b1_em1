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

    public double getpromedio (){
        return promedio;
    }
    
    // TODO: Implementar métodos setter para cada atributo

     public void setnombre (String nombre){
        this.nombre = nombre;
    }

    // Nota: En el setter de edad, validar que sea mayor o igual a 0

     public void setedad (int edad){
        if (edad >= 0){
            this.edad = edad;
            else {
                System.out.println("La edad no es correcta");
            }
        }
        
    }

     // Nota: En el setter de promedio, validar que esté entre 0.0 y 10.0
    public void setPromedio (double promedio){
        if (promedio>=0.0 && promedio <=10.0){
            this.promedio=promedio;
            else {
                System.out.println("El promedio debe estar entre 0.0 y 10.0");

            }
        }

    }

    // TODO: Crear método mostrarInformacion que imprima los datos del estudiante
    
   public void mostrarInformacion () {
    System.out.println("Estudiante: " + nombre  + "Edad: " + edad + "Promedio: "  + promedio);

    
   }
}