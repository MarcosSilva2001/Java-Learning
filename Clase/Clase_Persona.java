package Clase;
/*
 Una Clase en java es una plantilla y posee: 
 -Metodos : es una parte de codigo que se puede reutilizar y se pueden llamar las veces que sean necesarias, 
            aceptan valores como argumento y retornan otro valor.
 -Atributos : es una caracteristica que vamos a asociar a nuestra clase.

 Un Objeto en java es una instancia de una clase
 */

//Quiero crear la clase Persona , donde Persona va a ser el constructor que me permitira craer Objetos de la clase persona
public class Clase_Persona {
    // Atributos
    String nombre;
    String apellido;
    int edad;

    // Metodos pueden ser publicas o privadas, de tipo void o de algun tipo de dato
    public void Mostar_Informacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("-----------------------");
    }

}
