import java.lang.String;

/* 
    ------------------------------------- STRING --------------------------------------------
    La clase String es una de las clases fundamentales que forma parte del paquete java.lang. 
    La clase String se utiliza para representar cadenas de caracteres , esta proporciona una 
    variedad de métodos para realizar operaciones en cadenas de caracteres

    Las posciones en la cadena de caracteres empiezan desde el 0
    0 - 1 - 2 - 3 - 4 - ........
    -----------------------------------------------------------------------------------------

    ---------------- Algunas de los metodos mas utilzados de la clase string ----------------

    - .lentgh() -> Devuelve la longitud del string
    - .charAt(int index) -> Devuelve el carácter en la posición especificada.
    - .compareTo() = .equals() -> Compara dos string teniendo en cuenta mayus y minus
    - .compareToIgnoreCase() = .equalsIgnoreCase() -> Compara dos string sin tener en cuenta mayus y minus
    - .concat() -> Concatena dos o mas strings
    - .contains() -> Verifica si una cadena contiene otra cadena como una subcadena. Devuelve (true o false) 
    - .startsWith() -> Verifica si un string comienza con una cadena especifica. Devuelve (true o false) 
    - .endsWith() -> Verifica si un string termina con una cadena especifica. Devuelve (true o false) 
    - .indexOf() -> Devuelve la posición de la primera ocurrencia de la cadena especificada.
    - .lastIndexOf() -> Devuelve la posición de la ultima ocurrencia de la cadena especificada.
    - .replace(String objetivo , String reemplazo)  ->  Reemplaza cadenas en un string
    - .toLowerCase() -> Convierte un string en minusculas
    - .toUpperCase() -> Convierte un string en mayusculas
    - .trim() ->  Elimina espacios en blanco al inicio y al final de un string.
    - .substring(int beginIndex, int endIndex)-> Devuelve una cadena del string segun dos posiciones inicio y final.


*/

public class Clase_String {

    public static void main(String[] args) {

        // Metodo .length()
        String ejemploLength = "Hola, mundo!";
        int longitud = ejemploLength.length();
        System.out.println("Longitud de la cadena: " + longitud);

        // Metodo .charAt(int index)
        String ejemploCharAt = "Java";
        char caracter = ejemploCharAt.charAt(2);
        System.out.println("Carácter en la posición 2: " + caracter);

        // Metodo .compareTo() = .equals()
        String str1 = "Hola";
        String str2 = "hola";
        int comparacion = str1.compareTo(str2);
        System.out.println("Comparación con compareTo: " + comparacion);

        // Metodo .compareToIgnoreCase() = .equalsIgnoreCase()
        String str3 = "Java";
        String str4 = "java";
        boolean sonIguales = str3.equalsIgnoreCase(str4);
        System.out.println("Comparación sin tener en cuenta mayúsculas y minúsculas: " + sonIguales);

        // Metodo .concat()
        String str5 = "Hola";
        String str6 = "Mundo";
        String concatenada = str5.concat(" " + str6);
        System.out.println("Cadenas concatenadas: " + concatenada);

        // Metodo .contains()
        String ejemploContains = "Java es un lenguaje de programación";
        boolean contieneJava = ejemploContains.contains("Java");
        System.out.println("Contiene 'Java': " + contieneJava);

        // Metodo .startsWith()
        String ejemploStartsWith = "Java es poderoso";
        boolean comienzaConJava = ejemploStartsWith.startsWith("Java");
        System.out.println("Comienza con 'Java': " + comienzaConJava);

        // Metodo .endsWith()
        String ejemploEndsWith = "Java es divertido";
        boolean terminaConDivertido = ejemploEndsWith.endsWith("divertido");
        System.out.println("Termina con 'divertido': " + terminaConDivertido);

        // Metodo .indexOf()
        String ejemploIndexOf = "Java es un lenguaje de programación";
        int posicionJava = ejemploIndexOf.indexOf("Java");
        System.out.println("Posición de 'Java': " + posicionJava);

        // Metodo .lastIndexOf()
        String ejemploLastIndexOf = "Java es un lenguaje de programación, y Java es popular";
        int ultimaPosicionJava = ejemploLastIndexOf.lastIndexOf("Java");
        System.out.println("Última posición de 'Java': " + ultimaPosicionJava);

        // Metodo .replace()
        String ejemploReplace = "Hola, mundo!";
        String reemplazada = ejemploReplace.replace("mundo", "GPT-4");
        System.out.println("Cadena reemplazada: " + reemplazada);

        // Metodo .toLowerCase()
        String ejemploLowerCase = "HELLO WORLD";
        String enMinusculas = ejemploLowerCase.toLowerCase();
        System.out.println("En minúsculas: " + enMinusculas);

        // Metodo .toUpperCase()
        String ejemploUpperCase = "hello world";
        String enMayusculas = ejemploUpperCase.toUpperCase();
        System.out.println("En mayúsculas: " + enMayusculas);

        // Metodo .trim()
        String ejemploTrim = "   Hola, mundo!   ";
        String sinEspacios = ejemploTrim.trim();
        System.out.println("Sin espacios en blanco: " + sinEspacios);

        // Metodo .substring(int beginIndex, int endIndex)
        String ejemploSubstring = "Java es poderoso";
        String subcadena = ejemploSubstring.substring(8, 16);
        System.out.println("Subcadena: " + subcadena);
    }
}
