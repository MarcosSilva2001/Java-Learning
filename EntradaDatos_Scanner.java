
import java.util.Scanner;

public class EntradaDatos_Scanner {
    // Para poder ingresar datos por teclado necesitamos de la clase Scanner e
    // importar su biblioteca

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // definimos una variable de entrada de datos

        String dato;
        float decimal;
        int num;

        // Pedimos por teclado cada tipo de dato a ingresar utiliza un nex distinto
        System.out.println("Ingrese un texto o palabra: ");
        dato = entrada.nextLine();

        System.out.println("Ingrese un numero entero: ");
        num = entrada.nextInt();

        System.out.println("Ingrese un numero decimal: ");
        decimal = entrada.nextFloat();

        // IMPRIMIMOS POR PANTALLA LO INGRESADO POR TECLADO
        System.out.println("\nEste es el mensaje ingresado por teclado:  " + dato);
        System.out.println("El Numero entero ingresado es:  " + num);
        System.out.println("El Numero decimal ingresado es:  " + decimal);

        entrada.close(); // cerramos la clase de entrada que creamos asi evitamos memory leaks

    }
}
