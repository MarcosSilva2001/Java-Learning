package Collections.List;

import Collections.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
    -------------------------------------------- ArrayList_JAVA -----------------------------------------------
    Es una implementación de una lista dinámica que se basa en un array dinámico, lo que significa que 
    puede cambiar su tamaño dinámicamente a medida que se agregan o eliminan elementos.
    Es heterogenea ,puede contener elementos de diferentes tipos.
    Es accesible mediante indices , permite acceso aleatorio.
    El orden de los registros es el orden en el que fueron insertados (LIFO)

    Metodos Utiles:  - .add() -> Agregar elemento
                     - .remove() -> Eliminar elemento
                     - .get() -> Obtener elemento de una posicion especifica
                     - .size() -> Bbtener el tamaño de la lista
                     - .isEmpty() -> Devuelve true si la lista no contiene elementos 
                     - .contains() -> Devuelve true si la lista contiene el elemento especificado.
                     - .clear() -> Elimina todos los elementos de la lista.
                     -.set(int index, E element) -> Reemplaza el elemento en la posición especificada con el nuevo elemento.
                     
 */
public class ArrayList_JAVA {

    public static void main(String[] args) {
        // Declaro e inicializo mi ArrayList
        List<Persona> lista = new ArrayList<>();

        String nombre;
        int edad;
        int peso;

        Scanner sc = new Scanner(System.in);

        String bandera;

        System.out.print("¿Desea ingresar datos de una persona? (S/N) : ");
        bandera = sc.nextLine();

        while (bandera.equalsIgnoreCase("S")) {
            System.out.print("Ingrese el nombre: ");
            nombre = sc.nextLine();

            System.out.print("Ingrese la edad: ");
            // Manejo de la entrada de edad y consumir la nueva línea
            edad = Integer.parseInt(sc.nextLine());

            System.out.print("Ingrese el peso: ");
            // Manejo de la entrada de peso y consumir la nueva línea
            peso = Integer.parseInt(sc.nextLine());

            // Crear una nueva Persona y agregarla a la lista
            lista.add(new Persona(nombre, edad, peso));

            System.out.print("¿Desea ingresar datos de otra persona? (S/N) : ");
            bandera = sc.nextLine();
        }

        System.out.println("\n--------------- Lista de personas ingresadas --------------\n");
        
        System.out.println("------------- FOREACH --------------");
        for (Persona persona : lista) {
            // Imprimir los datos de la persona
            System.out.println("Nombre: " + persona.getNombre()
                    + ", Edad: " + persona.getEdad()
                    + ", Peso: " + persona.getPeso());
        }
        
        System.out.println("\n------------- FOR --------------");
        for (int i=0 ; i < lista.size() ; i++) {
            // Imprimir los datos de la persona
            System.out.println("Nombre: " + lista.get(i).getNombre()
                    + ", Edad: " + lista.get(i).getEdad()
                    + ", Peso: " + lista.get(i).getPeso());
        }
    }
}
