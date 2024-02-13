package Herencia;

import java.util.HashSet;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {

        AnimalesAcuaticos pescadito = new AnimalesAcuaticos();

        pescadito.setNombre("Pescado");
        pescadito.setEdad("Joven");
        pescadito.setPeso(1.5);
        pescadito.setVelocidad(23.1);
        pescadito.setAletas(true);

        pescadito.mostrar();

    }
}
