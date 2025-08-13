package com.example;

public class Libro {
    // TODO: Declarar atributos privados para titulo, autor y precio

    private String titulo;
    private String autor;
    private double precio;

    
    // TODO: Crear constructor con todos los atributos (titulo, autor, precio)

    public Libro (String titulo , String autor , double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    // TODO: Crear constructor con solo titulo y autor (precio = 0.0)

    public Libro (String titulo , String autor){
    this.titulo = titulo;
    this.autor = autor;
    this.precio = 0.0;
}
    
    // TODO: Implementar métodos getter para cada atributo

    public String getTitulo(){
        return nombre;
    }

    public String getAutor(){
        return autor;

    }

    public double getPrecio(){
        return precio;
    }
    
    // TODO: Implementar métodos setter para cada atributo
    // Nota: Validar que el precio no sea negativo

    public void setTitulo (String titulo) {
        this.titulo = titulo;

    }

     public void setAutor (String autor) {
        this.autor = autor;

    }

    public void setPrecio (double precio) {
        if (precio >= 0 ){
            this.precio = precio;

    }
        else {
            System.out.println("El precio no es correcto.");

        }
            

        }    
        
    // TODO: Crear método aplicarDescuento que reciba porcentaje
    // Nota: Calcular descuento y actualizar precio

    public void aplicarDescuento (double montoDescuento){
        if (montoDescuento >=0 && montoDescuento <= 50){
            double descuentoAplicado = this.precio * (montoDescuento / 100);
            this.precio = this.precio - descuentoAplicado;
            System.out.println("Descuento del " + montoDescuento + "% aplicado. Nuevo precio: " + String.format("%.2f", this.precio));
        } else {
            System.out.println("No aplica el descuento.");
        }
        }
    }
    
    // TODO: Crear método aplicarDescuento que reciba porcentaje y monto máximo
    // Nota: Aplicar descuento solo si no excede el monto máximo

    public void aplicarDescuento (double porcentaje, double montoMaximo) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            double descuentoCalculado = this.precio * (porcentaje / 100.0);

            if (descuentoCalculado <= montoMaximo) { 
                this.precio = this.precio - descuentoCalculado;
                System.out.println("Descuento del " + porcentaje + "% (" + String.format("%.2f", descuentoCalculado) + ") aplicado. Nuevo precio: " + String.format("%.2f", this.precio));
            } else {
                System.out.println("No se aplicó el descuento del " + porcentaje + "% (" + String.format("%.2f", descuentoCalculado) + "). Excede el monto máximo permitido de " + String.format("%.2f", montoMaximo) + ".");
            }
        } else {
            System.out.println("No se aplicó el descuento.");
        }   
    }
    
    // TODO: Crear método mostrarInformacion que imprima los datos del libro

    public void mostrarInformacion() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Precio: " + String.format("%.2f", this.precio));
    }
    
    
}
