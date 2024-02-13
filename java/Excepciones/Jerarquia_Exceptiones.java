package Excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
La  superClase padre de las exceciones es Throwable  y de el derivan 2 clases hija (Error y Exception).





                ------> ERROR (fallas de hardware no lo podemos solucionar nosotros con código a diferencia de las Exception)
    Throwable |
                ------> EXCEPTION  ------->IOException (Excepciones verificadas)
                                  |
                                   ------->RunTimeException (Excepciones no verificadas)




    Exceptiones Verificadas :       Son errores que el compilador requiere manejar o declarar en la firma del método. 
 (No dependen del programador)      Estas excepciones, como IOException, están asociadas con situaciones específicas, 
                                    como problemas de entrada/salida o interacciones con bases de datos. (interacciones de terceros)

    Exceptiones No Verificadas :    Son problemas en tiempo de ejecución que no necesitan ser manejados explícitamente mediante bloques try-catch.
   (Dependen del programador)       Es esencial programar de manera cuidadosa para prevenir estas excepciones y mejorar la estabilidad del programa.          



 */
public class Jerarquia_Exceptiones {

    public static void main(String[] args) {

        /*
            Un ejemplo básico de una excepción verificada en Java sería el manejo de la excepción IOException. 
            Esta excepción se lanza cuando ocurre un error de entrada/salida, por ejemplo, al tratar de abrir un archivo que no existe.
         */
        
        // Intentar abrir un archivo que no existe
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            String linea = br.readLine();
            System.out.println(linea);
            br.close();
        } catch (IOException e) {
            // Manejo de la excepción de entrada/salida
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
        
        //-------------------------------------------------------------------------------------------------------------------
        //Excepcion de division por cero es una EXCEPTION NO VERIFICADA de RunTimeException 

        int num1 = 2, num2 = 0;

        int div = num1 / num2;

        System.out.println("Division : " + div);
        
    }

}
