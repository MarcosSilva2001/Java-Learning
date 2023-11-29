package Clase;

public class Objeto_Persona {
    public static void main(String[] args) {

        Persona persona1; // con esto declaramos una variable del tipo Persona

        // Creamos un Objeto de la Clase Persona
        persona1 = new Persona(); // Llamamos al constructor Persona que reserva espacio en memoria para crear el
                                  // Objeto y devuelve la referencia de donde se creo el objeto y se lo asignamos
                                  // a persona1

        // Ya podemos acceder a los atributos del objeto creado
        persona1.nombre = "Marcos";
        persona1.apellido = "Silva";
        persona1.edad = 22;

        // Ahora llamamos al metodo Mostar_Informacion
        persona1.Mostar_Informacion();
    }
}
