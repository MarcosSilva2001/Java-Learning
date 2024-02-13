package Herencia.SobreEscritura_Miembros;

public class Persona extends Animal{
    
    /**
     *
     */
    @Override    // override es una anotacion para definir que se esta sobrescribiendo un metodo de la clase heredada en este caso el metodo comer
    public void comer(){
        
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
    
}
