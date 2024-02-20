package Polimorfismo;


public class Colectivo extends Vehiculo {
    
    protected float velocidad;

    public Colectivo(float velocidad, String marca, String matricula, Double precio) {
        super(marca, matricula, precio);
        this.velocidad = velocidad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void estacionar() {
        System.out.println("El colectivo lo dejo estacionado en la terminal....");
    }

    
    
}
