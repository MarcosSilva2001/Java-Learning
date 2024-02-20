public class METODO_BURBUJA {
    public static void main(String[] args) {

        int vector[] = { 1, 5, 9, 2, 6, 11, 3 };

        System.out.println("-------------------------- Antes de ordenar -------------------------");
        mostrar(vector);

        ordenamientoBurbuja(vector);

        System.out.println("\n-------------------------- Despues de ordenar -------------------------");
        mostrar(vector);

    }

    public static void ordenamientoBurbuja(int array[]) {

        int aux, i, j;

        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {

                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public static void mostrar(int array[]) {

        System.out.print("\t\t\t   ");
        for (int i : array) {
            System.out.print(" " + i);
        }
    }
}
