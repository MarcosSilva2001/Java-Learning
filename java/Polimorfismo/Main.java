package Polimorfismo;

public class Main {

    public static void main(String[] args) {

        // voy a crear varios tipos de objetos de la clase vehiculo y sus derivados y contenerlos en un vector de la clase padre
        Vehiculo[] vector = new Vehiculo[4];

        vector[0] = new Coche(4, "Fiat", "ABC 12", 5000.0);
        vector[1] = new Moto("Negro", "Yamaha", "ABC 20", 2200.0);
        vector[2] = new Vehiculo("Ford", "ADF 14", 9780.0);
        vector[3] = new Colectivo(110, "Mercedes Benz", "ABC 900", 20100.0);
        // podemos tener un vector de varios tipos de vehiculos y cada uno con su forma distinta de estacionar polimorfo ( muchas formas )

        for (Vehiculo Vehiculos : vector) { //for each    for( Tipo_Dato  nombreVariable : vector/lista ){}
            Vehiculos.estacionar();
        }
    }
}
