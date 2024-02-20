package Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
    --------------------------------------- MAP --------------------------------------
    Representa una colección de pares clave-valor, donde cada clave está asociada con un valor. La interfaz Map no extiende la interfaz Collection 
    como lo hacen otras interfaces de colecciones, ya que no almacena simplemente elementos individuales, sino pares clave-valor.

    En un Map, cada clave es única y está asociada a un solo valor. Esto permite realizar búsquedas eficientes basadas en la clave, 
    ya que cada clave identifica de manera única un valor dentro del mapa.

    Tipos de implementaciones:

    -HashMap: Implementa un mapa basado en una tabla hash. Ofrece un acceso rápido y eficiente a los elementos, 
              pero no garantiza un orden específico de las claves.

              
    -TreeMap: Implementa un mapa respaldado por un árbol de búsqueda balanceado (por defecto, un árbol rojo-negro). 
              Mantiene las claves ordenadas en un orden ascendente.


    -LinkedHashMap: Implementa un mapa que mantiene el orden de inserción de las claves. Combina la eficiencia de búsqueda 
                    de un HashMap con el orden de inserción de un LinkedHashSet.

    Algunas de las operaciones comunes que puedes realizar en un Map incluyen:

    -.put(K key, V value):  Agrega un par clave-valor al mapa.
    -.get(Object key):      Obtiene el valor asociado con la clave especificada.
    -.remove(Object key):   Elimina el par clave-valor asociado con la clave especificada.
    -.containsKey(Object key):  Verifica si el mapa contiene la clave especificada.
    -.containsValue(Object value):  Verifica si el mapa contiene el valor especificado.
    -.size():   Devuelve el número de pares clave-valor en el mapa.
    -.isEmpty():    Devuelve true si el mapa no contiene pares clave-valor.
    
 */
public class ClaseMap {

    public static void main(String[] args) {
        // ---------------- HashMap -----------------
        Map<Integer, String> diccionarioHash = new HashMap<>();

        System.out.println("------------------- HashMap ------------------");
        // agregamos elementos al diccionario Map
        diccionarioHash.put(1, "Perro");
        diccionarioHash.put(3, "Gato");
        diccionarioHash.put(4, "Leon");
        diccionarioHash.put(8, "Pajaro");
        diccionarioHash.put(2, "Camaleon");

        /*
            diccionarioHash.entrySet(): Este método devuelve un conjunto de todas las entradas (pares clave-valor) presentes en el mapa diccionarioHash. 
            Cada entrada está representada como un objeto Entry<Integer, String>.
         */
        // Mostrar el contenido del diccionario (orden no especifico)
        for (Entry<Integer, String> entry : diccionarioHash.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " - Valor: " + entry.getValue());
        }
        
        
        System.out.println("\nImprimir solo las claves: "+ diccionarioHash.keySet());
        System.out.println("Imprimir solo los valores: "+ diccionarioHash.values());

        // ---------------- TreeMap -----------------
        Map< String, Integer> diccionarioTree = new TreeMap<>();

        System.out.println("------------------- TreeMap ------------------");
        // agregamos elementos al diccionario Map
        diccionarioTree.put("1", 20);
        diccionarioTree.put("4", 15);
        diccionarioTree.put("3", 25);
        diccionarioTree.put("9", 50);
        diccionarioTree.put("5", 36);


        // Mostrar el contenido (orden accendente por clave)
        for (Entry<String,Integer> entry : diccionarioTree.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " - Valor: " + entry.getValue());
        }

        Boolean estaOno = diccionarioTree.containsValue(50);
        System.out.println("\nEl valor 50 se encuentra en el diccionario? : " + estaOno);
        
        
        
        // ---------------- LinkedHashMap -----------------
        Map< String, String> diccionarioLinkedHash= new LinkedHashMap<>();

        System.out.println("------------------- LinkedHashMap ------------------");
        // agregamos elementos al diccionario Map
        diccionarioLinkedHash.put("Uno","Peru");
        diccionarioLinkedHash.put("Tres","Argentina");
        diccionarioLinkedHash.put("Cinco","Chile");
        diccionarioLinkedHash.put("Dos","Paraguay");
        diccionarioLinkedHash.put("Nueve","Brasil");


        // Mostrar el contenido (oorden de inserción)
        for (Entry<String,String> entry : diccionarioLinkedHash.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " - Valor: " + entry.getValue());
        }

    }
}
