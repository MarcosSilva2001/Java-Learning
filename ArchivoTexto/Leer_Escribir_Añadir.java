package ArchivoTexto;

import java.io.*;

/*
 * ---------------------------- BufferedReader --------------------------- 
    Se utiliza para leer texto desde un flujo de entrada, como un archivo o un InputStream.
    Proporciona operaciones adicionales de lectura, como readLine(), que lee una línea completa de texto.
    Almacena internamente un búfer para reducir la sobrecarga de las operaciones de lectura, ya que puede 
    leer datos en bloque en lugar de byte por byte.

    --------------------------- BufferedWriter ---------------------------
    Se utiliza para escribir texto en un flujo de salida, como un archivo o un OutputStream.
    Al igual que BufferedReader, almacena internamente un búfer para reducir la sobrecarga de 
    las operaciones de escritura, escribiendo datos en bloque en lugar de byte por byte.

    Reciben como parametro un obj FileReader para BufferReader y FileWriter para FileWriter

 */
public class Leer_Escribir_Añadir {

    File archivo;

    private void crearArchivoTexto() {
        archivo = new File("ArchivoTexto\\archivo.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Se creo el archivo con exito!!!");
            } else {
                System.out.println("Error al crear el archivo...");
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private void escrituraArchivoTexto() {

        try {

            FileWriter escribir = new FileWriter(archivo);
            escribir.write("HOLA SALUDOS A TODOS");
            escribir.close();
            System.out.println("El texto se añadio con exito!");

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private void lecturaArchivoTexto() {

        try {

            BufferedReader lector = new BufferedReader(new FileReader(archivo)); // Buffer reserva memoria para la
                                                                                 // lectura del archivo y luego la
                                                                                 // libera

            System.out.println(lector.readLine());
            lector.close();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private void eliminarArchivoTexto() {

        try {
            if (archivo.delete()) {

                System.out.println("Archivo eliminado con exito!");
            } else {
                System.out.println("Error al eliminar el archivo...");
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {

        Leer_Escribir_Añadir archivoText = new Leer_Escribir_Añadir();

        archivoText.crearArchivoTexto();
        archivoText.escrituraArchivoTexto();
        archivoText.lecturaArchivoTexto();
        // archivoText.eliminarArchivoTexto();
    }
}
