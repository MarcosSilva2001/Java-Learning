
package Abstraccion;


public class Principal {
    public static void main(String[] args) {
        // creamos un objeto de la clase plata 
        Planta planta = new Planta();
        
        //No podemos crear objetos de la clase animal porque esta es una clase abstracta pero podemos crear objetos de sus clase hija
        Animal_Carnivoro animal1= new Animal_Carnivoro();
        Animal_Hervivoro animal2= new Animal_Hervivoro();
        
        planta.alimentarse();
        animal1.alimentarse();
        animal2.alimentarse();
    }
}
