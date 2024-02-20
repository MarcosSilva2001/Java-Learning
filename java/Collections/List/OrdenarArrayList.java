package Collections.List;

import Collections.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    Para poder ordenar la lista necesitamos utilizar el metodo sort() ordena la lista en orden 
    ascendente según el orden natural de los elementos
    Para que la ordenación funcione correctamente, la clase Persona debe implementar la interfaz Comparable 
    y definir la lógica de comparación en el método compareTo()


    -------------------------- PASOS -------------------------------
    1)  Implementar la interfaz Comparable en la clase de los elementos del ArrayList
        Asegúrate de que la clase de los elementos del ArrayList implemente la interfaz Comparable<T>, 
        donde T es el tipo de los elementos.
    
    2)  Utiliza el método sort de la clase Collections para ordenar el ArrayList.
                                Collections.sort(lista);
        El método sort utiliza la implementación del método compareTo para determinar el orden de los elementos.

    3)  Personalizar la lógica de comparación según tus necesidades Ajusta la lógica de comparación en el 
        método compareTo para reflejar cómo deseas que se ordenen los elementos.


        PARA COMPARAR NOMBRES USAMOS
        Collections.sort(lista, Comparator.comparing(Elemento::getCampo));

 */
public class OrdenarArrayList {

    public static void main(String[] args) {
        // creamos un array list de personas
        ArrayList<Persona> personas = new ArrayList<>();

        // agregamos personas al ArrayList
        personas.add(new Persona("Marcos", 22, 70));
        personas.add(new Persona("Aylen", 19, 50));
        personas.add(new Persona("Andy", 22, 57));
        personas.add(new Persona("Pablo", 12, 51));
        personas.add(new Persona("Jose", 38, 96));
        personas.add(new Persona("Franco", 2, 12));

        // Mostrar la lista antes de ordenar
        System.out.println("------------- ANTES DE ORDENAR POR EDAD -------------");
        for (Persona perso : personas) {
            System.out.println(perso.toString());
        }

        // Ordenar la lista en orden ascendente por edad le pasamos como argumento la lista
        Collections.sort(personas);

        // Mostrar la lista después de ordenar
        System.out.println("------------- DESPUES DE ORDENAR POR EDAD -------------");
        for (Persona perso : personas) {
            System.out.println(perso.toString());
        }

        // ahora ordenamos por nombre alfabetico
        Collections.sort(personas,Comparator.comparing(Persona::getNombre));
        
        System.out.println("------------- ORDENADO POR NOMBRE -------------");
        for (Persona perso : personas) {
            System.out.println(perso.toString());
        }
    }

}
