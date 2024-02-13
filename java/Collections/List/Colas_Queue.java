package Collections.List;

import java.util.LinkedList;
import java.util.Queue;

public class Colas_Queue {

    /*
    
        Las colas son útiles en situaciones donde se requiere procesar elemento en el orden en 
        que llegaron, como la gestión de tareas en un sistema.
        Sigue el orden de FIFO( el primero en entrar es el primero en salir)
    
        Se usa la Interfaz QUEUE para una cola y sus metodos mas comunes son:
    
        -.offer() -> Agregar un elemento a la cola
        -.poll() -> Eliminar un elemento de la cola
        -.peek() -> Obtener el primer elemento sin eliminarlo.
        -.clear() -> Elimina todos los elementos de la cola.
        -.size() -> Devuelve el número de elementos en la cola.
        -.search() -> Busca un elemento de la cola y  devuelve -1 si no lo encuentra o un numero positivo si está
    
    ------------- Implementaciones de Queue -------------------

    -LinkedList: Puede funcionar como una cola al implementar la interfaz Queue.
    -ArrayDeque: Una implementación de una cola de doble extremo que también implementa la interfaz Queue.
    -PriorityQueue: Una cola de prioridad que ordena los elementos según su prioridad.
    
     */
    public static void main(String[] args) {

        //crear una cola utilazando LinkedList 
        Queue<String> cola = new LinkedList<>();

        // agregar elementos a la cola
        for (int i = 1; i < 7; i++) {
            cola.offer("Elemento " + i);
        }

        // mostrar los elementos de la cola
        System.out.println("---------------- MOSTRAR LA COLA CARGADA -------------- ");
        System.out.println("Contenido de la cola: " + cola);

        System.out.println();
        // Obtener y mostrar el primer elemento de la cola (sin eliminarlo)
        System.out.println("Primer elemento de la cola: " + cola.peek());

        // Eliminar y mostrar el primer elemento de la cola
        System.out.println("Elemento eliminado de la cola: " + cola.poll());

        System.out.println();
        System.out.println("---------------- MOSTRAR LA COLA DESPUES DE LA ELIMINACION -------------- ");
        // Mostrar los elementos después de la eliminación
        System.out.println();
        System.out.println("Contenido de la cola después de la eliminación: " + cola);
        
        // Eliminar la cola
        System.out.println("--------------------- ELIMINAR LA COLA ----------------------");
        cola.clear();   
        
        System.out.println("La cola vacia: " + cola);
        
        
    }

}
