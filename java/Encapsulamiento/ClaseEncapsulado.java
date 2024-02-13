package Encapsulamiento;

/*
    ------------------- ENCAPSULAMIENTO ---------------------
    Se refiere a la práctica de ocultar los detalles internos de una clase como en una capsula y permitir el acceso controlado a través de métodos públicos accesores. 
    Se logra utilizando modificadores de acceso como private para campos y métodos, y proporcionando métodos públicos "ACCESORES" (getters y setters) 
    para interacctuar con los atributos.
 */

public class ClaseEncapsulado {

    private int edad;
    private String nombre;

    // metodos accesores Getters y Setters (get = obtener  ; set = colocar)
    
    public void setEdad(int edad) { // establecer edad

        this.edad = edad;
    }

    public int getEdad() { // mostrar edad

        return edad;
    }

    public void setNombre(String nombre) { // establecer nombre

        this.nombre = nombre;
    }

    public String getNombre() { // mostrar nombre

        return nombre;
    }

}
