package Herencia;

public class AnimalesAcuaticos extends Animal { // con extends decimos que la clase actual (hija) es heredada de la clase SuperClase (Padre)

    // atributos
    private Double velocidad;
    private boolean aletas;

    // metodos 
    // constructores
    public AnimalesAcuaticos() {
    }

    // ademas de sus atributos tambien hereda los de la clase Animal y sus metodos al igual que los setter y getter
    public AnimalesAcuaticos(Double velocidad, boolean aletas, String nombre, String edad, Double peso) {

        super(nombre, edad, peso); // con super llamamos los atributos de la clase padre Animal que ya estan inicializados
        this.velocidad = velocidad;
        this.aletas = aletas;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean getAletas() {
        return aletas;
    }

    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }

    public void mostrar() {

        System.out.println("El animal que eligio es  " + getNombre() + " y es un " + getEdad() + " con un peso de " + getPeso() + "kg.");
        System.out.println("Tiene una velocidad de nado de " + getVelocidad() + " m/s ");
        System.out.println("Posee aletas  " + getAletas());

    }

}
