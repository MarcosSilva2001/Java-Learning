package Metodos;

public class Operaciones_Aritmetica {

    // atributos
    int a;
    int b;

    /*
     * Un constructor en Java es un método especial dentro de una clase que se llama
     * automáticamente cuando se crea un objeto de esa clase. Su función principal
     * construir un objeto , reservar espacio en memoria con la palabra new y
     * tambien puede inicializar los atributos del objeto.
     */

    // Defino un constructor vacio
    public Operaciones_Aritmetica() {

    }

    // metodos sin parametros
    public void Suma() {
        int resultado = a + b;
        System.out.println("---------------------------");
        System.out.println("Suma: " + a + " + " + b + " = " + resultado);
    }

    public void Resta() {
        int resultado = a - b;
        System.out.println("---------------------------");
        System.out.println("Resta: " + a + " - " + b + " = " + resultado);
        System.out.println("---------------------------");
    }

    // metodos con valores por parametro
    public int Multiplicaion(int num1, int num2) {
        this.a = num1;
        this.b = num2;
        return a * b;
    }

    /*
     * OPERADOR THIS: es una variables que se crea de manera automatica cuando se
     * esta ejecutando un objeto y apunta a dicho objeto, se usa dentro de la clase
     * y puede apuntar a los atributos o metodos de la clase
     */

    public void Division(int a, int b) {
        this.a = a; // el argumento a se asigna al atruto this.a
        this.b = b;

        if (b != 0) {
            System.out.println("---------------------------");
            System.out.println("Division: " + a + " / " + b + " = " + (a / b));
            System.out.println("---------------------------");
        } else {
            System.out.println("---------------------------");
            System.out.println("ERROR DIVISION POR 0.");
            System.out.println("---------------------------");
        }
    }

}
