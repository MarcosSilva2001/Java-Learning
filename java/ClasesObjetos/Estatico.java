
package ClasesObjetos;

/*  
    Al usar Estatico  estamos declarando miembros que pasan a ser de la clase y no de cada instancia individual
    entonces todos los objetos creados van a compartir el mismo atrituto o metodo
*/

public class Estatico {
    public static int edad = 1;
    
    
    public static void main(String[] args) {
        Estatico persona1 = new Estatico();
        Estatico persona2 = new Estatico();
        
        
        persona1.edad = 10; //al definir la edad , queda definido para todas las clases que creemos , quedara definida con el ultimo valor ingresado para edad
        persona2.edad = 22; 
        
        System.out.println(" Persona 1 edad = " +  Estatico.edad); // como el valor de edad lo definimos static entonces pasa a ser de la clase y lo podemos llamar de la clase
        System.out.println(" Persona 2 edad = " +  Estatico.edad);
        
        
        
    }
    
}
