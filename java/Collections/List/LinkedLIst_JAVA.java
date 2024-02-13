package Collections.List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedLIst_JAVA {

    /*
        ---------------------------- LINKEDLIST -----------------------------
        Representa una lista doblemente enlazada (con ida y vuelta).
        Proporciona métodos para realizar operaciones comunes en listas, como agregar elementos al principio o al final 
        de la lista, insertar elementos en una posición específica, eliminar elementos, y acceder a elementos por índice, 
        entre otras operaciones. Dado que la lista está doblemente enlazada, las inserciones y eliminaciones pueden ser 
        más eficientes que en una lista simplemente enlazada, ya que no es necesario recorrer toda la lista para realizar 
        estas operaciones.
    
        -No tiene indice determinado , se visualiza registro por registro
        -Mantiene el orden de insercion FIFO 
        -Puede ser usada como una pila , cola y lista.
        -Permite hacer inserciones o eliminaciones al principio o al final de la coleccion
    
     */

    public static void main(String[] args) {

        // creamos una LinkedList de String
        List<String> lista2 = new LinkedList<String>();

        // cargamos
        lista2.add("Elemento 1");
        lista2.add("Elemento 2");
        lista2.add("Elemento 3");
        lista2.add("Elemento 4");

        // agregar elemento en una posicion especifica
        lista2.add(2, "NuevoElemento");
        // agregar al principio
        lista2.add(0, "ElementoPrincipal");

        // Mostrar los elementos de la lista
        System.out.println("-------------------- LISTA LINEAL -------------------");
        System.out.println("Contenido de la LinkedList: " + lista2);

        System.out.println("-------------------- LISTA FOREACH ------------------");

        for (String elementos : lista2) {
            System.out.println(elementos);
        }

        // acceder a los elementos de la lista por indice y mostrar
        System.out.println("-------------------- ACCESO INDICE ------------------");
        String acceso = lista2.get(3);
        System.out.println("En la posicion 3 = " + acceso);

        // Tamaño de la lista
        System.out.println("------------------- TAMAÑO LISTA -------------------");
        System.out.println("El tamaño de la lista: " + lista2.size());
        
        
        // Antes de eliminar los elementos verificamos si la lista esta vacia o no

        if (!lista2.isEmpty()) {
            lista2.remove("Elemento 2");
            lista2.remove("NuevoElemento");
        }
        System.out.println("----------------------- ELIMIMAR ALGUNAS POSICIONES --------------------- ");
        // Mostrar los elementos después de las eliminaciones
        System.out.println("Contenido de la LinkedList después de las eliminaciones: " + lista2);

        // elimino toda la lista
        lista2.removeAll(lista2);
        
        
        // -----------------------------------------------------------------------------------------
        // lista de numeros
        List<Integer> numeros = new LinkedList<>();
        
        numeros.addAll(Arrays.asList(1,2,4,6,8,9,5)); // agregamos muchos elementos a la lista
        
        System.out.println("------------------------ LISTA DE NUMEROS -------------------------------");
        System.out.println("Lista de numeros: " + numeros);
        
        List<Integer> numeritos = numeros.subList(2, 5); // obtenemos una sublista de la lista numeros desde la posicion 2 al 4
        
        System.out.println("\nSublista: "+  numeritos);
    }

}
