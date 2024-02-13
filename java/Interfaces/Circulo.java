package Interfaces;

//implementamos las dos interfaces  Figura , Rotable y Dibujable (Herencia multiple) y sus metodos abstractos
public class Circulo implements Figura, Rotable, Dibujable {

    // atributos
    private Double radio;

    // metodos
    // constructor
    public Circulo(Double radio) {
        this.radio = radio;
    }

    // getters and setters
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {

        Double area = Math.PI * radio * radio;
        return area;

    }

    @Override
    public void rotar() {
        System.out.println("Soy un circulo y estoy rotando");
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }

}

