public class TiposDatos {

    public static void main(String[] args) {

        short corto = 12345; // Entero corto de 2 bytes (16 bits)
        int entero = 12345567; // Entero de 4 bytes (32 bits)
        long enteroLong = 123456789123456789L; // Entero largo de 8 bytes (64 bits)
        float flotante = 123.45f; // Número decimal de punto flotante de 4 bytes (32 bits)
        double doble = 123.45; // Número decimal de punto flotante de doble precisión de 8 bytes (64 bits)
        char caracter = 'a'; // Carácter Unicode de 2 bytes (16 bits)
        boolean booleano = true; // Valor booleano que ocupa 1 bit, pero su tamaño exacto puede variar según la implementación
        
        // Imprimimos los resultados
        System.out.println(corto);
        System.out.println(entero);
        System.out.println(flotante);
        System.out.println(doble);
        System.out.println(caracter);
        System.out.println(booleano);
        System.out.println(enteroLong);


    }

}