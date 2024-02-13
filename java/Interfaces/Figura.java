package Interfaces;

/*
    -------------------------------------------- Interfaces ( Herencia Multiple) ---------------------------------------------------
    En Java, una interfaz es una colección de métodos abstractos (sin implementación) y constantes que pueden ser implementados por clases. 
    Las interfaces permiten la definición de métodos que deben ser implementados por cualquier clase que implemente la interfaz

    Usamos la palabra "interface" para crear la SuperClase Padre y para sus clases hijas usamos "implements"

*/
public interface Figura {
    
    
    // metodo abstracto no es necesario poner la palabra abstract ya que al ser una interface java ya sabe que es un metodo abstracto
    public Double calcularArea();

    public static interface Dibujable {
    }
}
