package ArchivoBinario;

import java.io.Serializable;

public class Persona implements Serializable {

    private String Nombre;
    private int edad;

    // contructores
    public Persona() {
    }

    public Persona(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInfo() {
        // Mostrar la información
        System.out.println("Nombre: " + this.getNombre() + "\nEdad: " + this.getEdad());

        System.out.println("---------------------------------------");
    }
}
