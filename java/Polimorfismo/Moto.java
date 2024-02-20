package Polimorfismo;


public class Moto extends Vehiculo{
    
    protected String color;

    public Moto(String color, String marca, String matricula, Double precio) {
        super(marca, matricula, precio);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void estacionar() {
        System.out.println("La moto es muy facil de estacionar...");
    }
    
    
}
