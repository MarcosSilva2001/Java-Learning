package Herencia;

public class Animal {

    //atributos 
    private String nombre;
    private String edad;
    private Double peso;

    // metodos
    // Constructores
    
    public Animal() {
    }

    public Animal(String nombre, String edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

   
    
}
