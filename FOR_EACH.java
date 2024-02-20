import java.util.Scanner;

public class FOR_EACH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tam;

        System.out.print("Ingrese el tamaño del vector: ");
        tam = sc.nextInt();

        int[] numeros = new int[tam];

        System.out.println("------------------------------- CARGA DEL VECTOR ----------------------------------");

        System.out.println("Ingrese " + tam + " números:");

        // Cargar el array con valores ingresados por el usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + (i + 1) + "]: ");
            numeros[i] = sc.nextInt();
        }

        // Imprimir el array completo después de la carga
        System.out.println("-------------------------- Array después de la carga --------------------------");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Cerrar el scanner después de su uso
        sc.close();
    }
}
