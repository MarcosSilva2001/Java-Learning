package Polimorfismo;


public class Coche extends Vehiculo {
    
    protected int can_puertas;
    
    
    public Coche(int can_puertas, String marca, String matricula, Double precio) {
        super(marca, matricula, precio);
        this.can_puertas = can_puertas;
    }

    public int getCan_puertas() {
        return can_puertas;
    }

    public void setCan_puertas(int can_puertas) {
        this.can_puertas = can_puertas;
    }

    @Override
    public void estacionar() {
        System.out.println("El coche se esta aparcando en el estacionamiento...");
    }
    
    
}
