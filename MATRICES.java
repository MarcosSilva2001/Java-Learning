import java.util.Scanner;

public class MATRICES {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tMATRIZ");

        int fila, colum;
        System.out.print("Ingresa la cantidad de fila: ");
        fila = sc.nextInt();
        System.out.print("Ingresa la cantidad de columna: ");
        colum = sc.nextInt();

        int[][] Matriz = new int[fila][colum];

        // carga de la matriz

        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < colum; j++) {

                System.out.print("\nCargue la matriz [" + i + "][" + j + "]: ");
                Matriz[i][j] = sc.nextInt();
            }
        }

        // mostrar la matriz
        System.out.println("\n\t\tMOSTRAR MATRIZ");
        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < colum; j++) {

                System.out.print("  " + Matriz[i][j]);

            }
            System.out.println();
        }

        sc.close();
    }

}
