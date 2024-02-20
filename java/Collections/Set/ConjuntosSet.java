package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
    ---------------- Metodos de Set --------------------
    -.add() -> Agrega un elemento al conjunto si no está presente.
    -.remove() -> Elimina el elemento especificado del conjunto si está presente.
    -.contains(Object o) -> Verifica si el conjunto contiene el elemento especificado.
    -.size() -> Devuelve el número de elementos en el conjunto.
    -.isEmpty() -> Devuelve true si el conjunto no contiene elementos.
    -.clear() -> Elimina todos los elementos del conjunto.
    -.iterator() -> Devuelve un iterador sobre los elementos del conjunto.
*/
public class ConjuntosSet {
    
    public static void main(String[] args) {
        
        // ----------------- HashSet ---------------------
        Set<String> conjuntoHash = new HashSet<>();
        
        System.out.println("-------------- HashSet -----------------");
        // Agregamos algunos elementos 
        conjuntoHash.add("Marcos");
        conjuntoHash.add("Pablo");
        conjuntoHash.add("Antonio");
        conjuntoHash.add("Marcos");
        conjuntoHash.add("Junior");
        conjuntoHash.add("Marcos");
        
        // Mostramos los elementos en HashSet (sin orden específico)
        for (String i: conjuntoHash) {
            System.out.println(" " + i);
        }
        
        // ----------------- TreeSet ---------------------
        Set<String> conjuntoTree = new TreeSet<>();
        
        System.out.println("-------------- TreeSet -----------------");
        // Agregamos algunos elementos 
        conjuntoTree.add("Paraguay");
        conjuntoTree.add("Peru");
        conjuntoTree.add("Argentina");
        conjuntoTree.add("Argentina");
        conjuntoTree.add("Brasil");
        conjuntoTree.add("España");
        
        // Mostramos los elementos en TreeSet (orden ascendente)
        for (String j: conjuntoTree) {
            System.out.println(" " + j);
        }
        
        // ----------------- LinkedHashSet ---------------------
        Set<String> conjuntoLinkedHash = new LinkedHashSet<>();
        
        System.out.println("-------------- LinkedHashSet -----------------");
        // Agregamos algunos elementos 
        conjuntoLinkedHash.add("Computadora");
        conjuntoLinkedHash.add("Celular");
        conjuntoLinkedHash.add("Heladera");
        conjuntoLinkedHash.add("Notebook");
        conjuntoLinkedHash.add("Celular");
        conjuntoLinkedHash.add("Monitor");
        conjuntoLinkedHash.add("Teclado");
        
        
        // Mostramos los elementos en LinkedHashSet (orden de inserción)
        for (String k: conjuntoLinkedHash) {
            System.out.println(" " + k);
        }
    }
}
