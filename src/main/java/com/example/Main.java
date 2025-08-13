package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores
        // 2. Mostrar la información de ambos estudiantes
        // 3. Modificar algún atributo usando un setter
        // 4. Mostrar la información actualizada

        Estudiante estudiante1 = new Estudiante("Valeria García", 33, "4,5");
        Estudiante estudiante2 = new Estudiante("Jony García", 30, "3,8");

        
        System.out.println("Estudiante 1:");
        estudiante1.mostrarInformacion();

        System.out.println("Estudiante 2:");
        estudiante2.mostrarInformacion();

    
        System.out.println("Modificando información del Estudiante 1");
        estudiante1.setEdad(28);
        estudiante1.setPromedio("4,8");

        System.out.println("Información Actualizada del Estudiante 1");
        estudiante1.mostrarInformacion();

        System.out.println("Información del Estudiante 2 (sin cambios)");
        estudiante2.mostrarInformacion();
    



        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
        // 2. Crear un libro usando el constructor con solo titulo y autor
        // 3. Mostrar información de ambos libros
        // 4. Aplicar descuento usando ambas versiones del método
        // 5. Mostrar información actualizada de los libros
    

        Libro libro1 = new Libro ("Habitos Atómico", "James Clear", 20.30);

        
        Libro libro2 = new Libro("Harry Potter", "J.K. Rowlings");
        
        
        System.out.println("Información Inicial de Libros");
        System.out.println("Libro 1:");
        libro1.mostrarInformacion();

        System.out.println("Libro 2:");
        libro2.mostrarInformacion();

        
        System.out.println("Aplicando descuentos");
        System.out.println("Aplicando descuento del 10% a Libro 1:");
        libro1.aplicarDescuento(10.0);

        System.out.println("\nAplicando descuento de $5 a Libro 2:");
        libro2.aplicarDescuento(5);

        
        System.out.println("Información Actualizada de Libros");
        System.out.println("Libro 1 (después del descuento):");
        libro1.mostrarInformacion();

        System.out.println("Libro 2 (después del descuento):");
        libro2.mostrarInformacion();
    }
}