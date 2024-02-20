package Abstraccion;


// es una clase hija de la sub clase Animal y esta no es abstracta 
public class Animal_Hervivoro extends Animal {

    @Override
    public void alimentarse() {
        System.out.println("Los animales hervivoros se alimentan de plantas");
    }
    
}
