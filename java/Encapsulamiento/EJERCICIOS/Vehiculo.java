package Encapsulamiento.EJERCICIOS;
/*
    ---------------------------------------- Ejercicio 2 -----------------------------------------------------
    Construir un programa que dada una serie de vehículos caracterizados por su marca, modelo y precio, 
    imprima las propiedades del vehículo más barato. Para ello, se deberán leer por teclado las características 
    de cada vehículo y crear una clase que represente a cada uno de ellos.
    ----------------------------------------------------------------------------------------------------------
*/

public class Vehiculo {
    // atributos
    private String marca;
    private int modelo;
    private float precio;
    
    // metodos
    
    // constructor
    public Vehiculo(String marca, int modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public float getPrecio() {
        return precio;
    }
   
    
}
