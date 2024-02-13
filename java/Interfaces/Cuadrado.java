package Interfaces;

public class Cuadrado implements Figura , Dibujable{ //implementamos las dos interfaces tanto Figura como Dibujable (Herencia multiple) y sus metodos abstractos
    // atributos
    private Double lado;
    
    
    // metodos 
    // constrcutor
    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    // getters and setters
    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        Double area = lado * lado;
        return area;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un cuadrado");
    }

    
}
