package Collections.List;

import java.util.Stack;

public class Pilas_Stack {

    /*
       Pila (stack) es una estructura de datos que sigue el principio de "último en entrar, primero en salir" (LIFO). 
       el último elemento que se añade a la pila es el primero en ser retirado. La pila se puede visualizar como una 
        serie de elementos apilados uno encima del otro, donde el último elemento añadido está en la parte superior 
        de la pila.
    
        En las pilas se pueden apilar y desapilar ( push y pop )
    
        -.push() -> Agrega un elemento a la parte superior de la pila.
        -.pop() -> Retira y devuelve el elemento en la parte superior de la pila. 
        -.peek() -> Devuelve el elemento en la parte superior de la pila sin retirarlo.
        -.clear() -> Elimina todos los elementos de la pila.
        -.size() -> Devuelve el número de elementos en la pila.
        -.search() -> Busca un elemento de la pila y  devuelve -1 si no lo encuentra
    
     */
    public static void main(String[] args) {

        // creamos una pila
        Stack<Integer> pila = new Stack<>();

        System.out.println(" Pila vacia: " + pila);
        System.out.println(" Está vacia? " + pila.isEmpty());

        // cargar la pila
        for (int i = 0; i < 6; i++) {
            pila.push(i);
        }
        // Obtener y mostrar el elemento en la parte superior de la pila (sin eliminarlo)
        Integer elementoSuperior = pila.peek();
        System.out.println("Elemento en la parte superior de la pila: " + elementoSuperior);

        // mostramos la pila cargada
        System.out.println("--------------- PILA CARGADA -------------");
        for (Integer pilita : pila) {
            System.out.print(pilita + "  ");
        }

        System.out.println("\n--------------------------------------");
        // Buscamos un elemento en la pila

        if (pila.search(2) >= 0) {

            System.out.println("Esta el 2 ? : Si ");
        } else {
            System.out.println("Esta el 2 ? : No ");
        }

    }
}
