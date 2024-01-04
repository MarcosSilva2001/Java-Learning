package ArchivoTexto;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 *  Un Archivo es una secuancia de bytes que son almacenados en el almacenamiento secundario en forma de dato.
 *  Es un recurso de almacenamiento persistente utilizado para almacenar datos de manera que puedan ser recuperados 
 *  y utilizados en futuras ejecuciones del programa.
 * 
 * TIPOS DE ARCHIVOS:
 * -Archivos de Texto:Son reconocidos por su contenido (Legibles) y es accesible a el mediante cualquier editor de texto
 * -Archivo Binario: Contiene datos en un formato no legible directamente por humanos , pueden contener una variedad de datos, 
 *                   incluyendo información no estructurada y datos no-textuales.
 */
public class ClaseFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * ------------------ Clase File -------------------
         * Es parte del paquete java.io y se utiliza para manipular información sobre
         * archivos y directorios en el sistema de archivos
         * 
         * --------------------- Métodos -----------------------
         * 
         * -.getAbsolutePath(): Devuelve la ruta absoluta del archivo o directorio.
         * -.getName(): Devuelve el nombre del archivo o directorio.
         * -.getPath(): Devuelve la ruta del archivo o directorio en forma de cadena.
         * -.length(): Devuelve la longitud del archivo (cantidad de letrar)
         * -.lastModified(): Devuelve la última fecha de modificación del archivo en
         * milisegundos desde la época.
         * -Si tienes una ruta a un archivo, getParent() te dará la ruta al directorio
         * que contiene ese archivo.
         * -.createNewFile(): Crea un nuevo archivo vacío y devuelve true si se creó con
         * éxito.
         * -.mkdir(): Crea una carpeta representado por este objeto File.
         * -.delete(): Elimina el archivo o directorio representado por este objeto
         * File.
         * -.exists(): Devuelve true si el archivo o directorio representado por este
         * objeto File existe.
         * -.canRead(), canWrite(), canExecute(): Devuelven true si el archivo o
         * directorio tiene permisos de lectura, escritura o ejecución, respectivamente.
         * -.renameTo(File dest): Renombra el archivo o directorio representado por este
         * objeto File con el nombre especificado por el objeto dest. Devuelve true si
         * la operación fue exitosa.
         * -File.separator: es una constante que representa el separador de directorios
         * específico del sistema operativo
         */

        File archivo = new File("ArchivoTexto\\ArchPrueba.txt"); // ruta relativa

        // Controlar las excepciones
        try {
            if (archivo.createNewFile()) {
                System.out.println();
                System.out.println("El archivo ha sido creado exitosamente!!!");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("El archivo ya existe - Ocurrio un error.");
                System.out.println();
            }
        } catch (IOException e) {

            e.printStackTrace(System.out);
        }

        // obtenemos el nombre del archivo
        System.out.println("Nombre del archivo: " + archivo.getName());

        // obtenemos la direccion absoluta del archivo
        System.out.println("Ruta Absoluta del archivo: " + archivo.getAbsolutePath());

        // el archivo existe?
        System.out.println("¿ Existe el archivo ? : " + archivo.exists());

        // Esta habilitado la escritura?
        System.out.println("¿ Se puede escribir el archivo ? : " + archivo.canWrite());

        System.out.println("\n");

        System.out.println("¿ Desea renombrar el archivo? Si/No: ");
        String bandera = sc.nextLine();

        if (bandera.equalsIgnoreCase("Si")) {
            System.out.print("Ingrese el nuevo nombre: ");
            String nuevoNombre = sc.nextLine();

            // Construir la ruta y nombre del nuevo archivo
            String rutaNuevoArchivo = archivo.getParent() + File.separator + nuevoNombre;
            File archivoRenombrado = new File(rutaNuevoArchivo);

            // Intentar renombrar el archivo
            if (archivo.renameTo(archivoRenombrado)) {
                System.out.println("El archivo se ha renombrado con éxito.");
            } else {
                System.out.println("No se pudo renombrar el archivo.");
            }

        }

        System.out.println("\n");

        sc.close();
    }
}
