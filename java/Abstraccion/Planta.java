package Abstraccion;

// Planta ya no es una clase abstracta pues sabemos que tipo de ser vivo es y como se alimenta por lo que su metodo tampoco sera abstracta
public class Planta extends SerVivo {
    
    @Override
    public void alimentarse() {
        System.out.println("La planta se alimenta a traves de la fotosintesis");
    }
    
}
