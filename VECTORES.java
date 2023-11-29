import java.util.Scanner;
/*
 Sintaxis para declarar un vector:
        tipo_dato [] nombre_vector;
        nombre_vector = new tipo_dato[tamaño];
    
        tipo_dato [] nombre_vector = new tipo_dato[tamaño];
 */

public class VECTORES {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        System.out.print("Ingrese el tamaño del vector: ");
        N = sc.nextInt();

        int[] Numeros = new int[N];
        int len = 0;

        // CARGA
        System.out.print("\n\t\tCARGA DEL VECTOR\n");
        for (int i = 0; i < N; i++) {

            System.out.print("Digite un Numero: ");
            Numeros[i] = sc.nextInt();
            len++;
        }
        // MOSTRAR
        System.out.println("\n\t\tEL VECTOR CARGADO\n");
        for (int i = 0; i < len; i++) {

            System.out.print("  " + Numeros[i]);
        }

        sc.close();
    }

}
