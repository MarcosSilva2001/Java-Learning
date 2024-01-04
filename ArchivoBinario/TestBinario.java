package ArchivoBinario;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * ------------------------ FileOutputStream ------------------------------ 
    Se utiliza para escribir datos en un archivo.
    Permite la creación de un flujo de salida de bytes que se conecta a un archivo en el sistema de archivos.
    Puede escribir datos en el archivo en forma de bytes, ya sea en forma de arrays de bytes o como bytes individuales.

    ------------------------ FileInputStream ------------------------------ 
    Se utiliza para leer datos de un archivo.
    Permite la creación de un flujo de entrada de bytes que se conecta a un archivo en el sistema de archivos.
    Puede leer datos del archivo en forma de bytes, ya sea en forma de arrays de bytes o como bytes individuales.

    Ambas clases se utilizan comúnmente junto con clases de buffer (como BufferedOutputStream y BufferedInputStream) 
    para mejorar la eficiencia de las operaciones de I/O mediante el uso de búferes


    ------------------------ ObjectOutputStream -------------------------- 
    Se utiliza para serializar objetos. 
    La serialización es el proceso de convertir un objeto en una secuencia de bytes que se pueden almacenar en un archivo, 
    transmitir a través de una red o reconstruir posteriormente

    Serialización de Objetos:

    Convierte objetos Java en una secuencia de bytes.
    Las clases deben implementar la interfaz Serializable para ser serializables.
    Permite la transmisión de objetos a través de la red o entre procesos.

    Cuando necesitas recuperar el objeto, puedes utilizar ObjectInputStream para leer y deserializar el archivo. 
    La serialización y deserialización son fundamentales para el intercambio de objetos en Java, especialmente en 
    contextos como la persistencia de datos, la transmisión de objetos a través de la red, o la comunicación entre 
    diferentes partes de una aplicación.
 */

public class TestBinario {

    private void escribirArchivo() {

        try {
            FileOutputStream archivo = new FileOutputStream("ArchivoBinario\\archivo.bin"); // Crear archivo binario
            ObjectOutputStream escritura = new ObjectOutputStream(archivo); // Crear un objeto serializable

            escritura.writeObject(new Persona("Marcos", 22)); // Escribir el objeto en el archivo
            escritura.writeObject(new Persona("Aylen", 20)); // Escribir el objeto en el archivo
            escritura.writeObject(new Persona("Pablo", 12)); // Escribir el objeto en el archivo
            System.out.println("Objeto serializado y almacenado en el archivo.");
            escritura.close();

        } catch (IOException error) {
            error.printStackTrace(System.out);
        }
    }

    // Crear metodo para leer el contenido de un archivo binario con objeto
    // serializado
    private void lecuraArchivo() {

        try {
            FileInputStream archivo = new FileInputStream("ArchivoBinario\\archivo.bin");
            ObjectInputStream lector = new ObjectInputStream(archivo);

            while (true) {
                // Leer y deserializar el objeto desde el archivo
                Persona persona = (Persona) lector.readObject();

                // Mostrar la información del objeto recuperado
                persona.mostrarInfo();
            }

        } catch (EOFException ex) { // EOFException es una excepción específica de Java que se lanza cuando se
                                    // intenta leer más allá del final de un archivo
            return;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }

    public static void main(String[] args) {
        TestBinario archivo = new TestBinario();

        archivo.escribirArchivo();
        archivo.lecuraArchivo();

    }
}
