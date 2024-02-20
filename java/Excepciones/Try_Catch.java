package Excepciones;

/*
    Por lo general los try catch se usan en excepciones verificadas o comprobadas

    Para el manojo de excepciones necesitamos saber:
    
    - TRY (intentar) : Bloque donde puede ocurrir el error
    - CATCH (atrapar) : Es como el else del try , se ejecuta al dispararse una excepcion en el bloque try
    - FINALLY : Bloque de codigo que se ejecuta siempre sin importar si hubo o no errores
    - THROWS (va definido a lado del nombre del metodo) : Determina que excepciones puede lanzar un metodo
 */
public class Try_Catch {

    public static void main(String[] args) {
        // un ejemlo es querer acceder a una posicion de un array que esta fuera de su limite

        int array[] = {11, 21, 4, 8};

        // intenta acceder a la posicion 5 y mostra lo que tiene 
        try {
            System.out.println("El numero de la posicion 5 es:  " + array[5]);

        } catch (Exception e) { // de lo contrario agarra la accepcion del cual se trate y enves de mostrar el error ,mostra el siguiente mensaje

            System.out.println("Intentaste acceder a una posicion del array que no existe..");
        }

    }
}
