package Collections;

public class Persona implements Comparable<Persona> {

    private String nombre;
    private int edad;
    private int peso;

    public Persona() {
    }

    public Persona(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        // comparar personas por edad
        return Integer.compare(this.edad, otraPersona.edad);

    }

    @Override
    public String toString() {
        return "Persona{"
                + "nombre='" + nombre + '\''
                + ", edad=" + edad
                + ", peso=" + peso
                + '}';
    }

}
