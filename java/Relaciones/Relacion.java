package Relaciones;

import java.util.ArrayList;
import java.util.List;

/*
    En programación orientada a objetos, las relaciones entre clases y objetos se pueden establecer de varias maneras, 
    como la herencia y la composición y la agreagacion:

    En Java, las relaciones entre clases y objetos se establecen a través de los conceptos de herencia, composición y asociación. Aquí tienes un resumen conciso de estos conceptos:

1 . Herencia:

Permite que una clase (subclase) herede atributos y métodos de otra clase (superclase).
Se utiliza la palabra clave extends para establecer una relación de herencia.

2 . Composición:

Implica que un objeto puede contener otros objetos. Se crea una instancia de una clase dentro de otra.
Permite construir objetos complejos utilizando componentes más simples.

3 . Asociación:

Es una relación más general y flexible donde las clases interactúan entre sí sin una dependencia fuerte.
Puede ser unidireccional o bidireccional, y se puede lograr a través de referencias de objetos.

En resumen, en Java, las relaciones entre clases y objetos se construyen mediante herencia para compartir comportamientos y atributos, 
composición para crear objetos complejos a partir de componentes más simples, y asociación para permitir que las clases interactúen 
de manera más flexible


La relacion de 1 a N se hace del lado del 1 hacia la N
 */
public class Relacion {

    public static void main(String[] args) {

        Auto aut = new Auto();

        aut.setId(1L);
        aut.setMarca("Fiat");
        aut.setModelo("Caca");

        List<Propietario> listaPropietarios = new ArrayList<>();

        // agregamos algunos propietarios a la lista
        listaPropietarios.add(new Propietario(20L, "Marcos", "Silva"));
        listaPropietarios.add(new Propietario(36L, "Mister", "Paliyo"));

        // agregamos al set de auto la lista de propietarios
        aut.setListaPropietarios(listaPropietarios);

        System.out.println("El auto " + aut.getMarca() + " modelo " + aut.getModelo() + " cuyo id es " + aut.getId() 
                            + " - Tiene como propietarios a : \n" + aut.getListaPropietarios().toString());
    }
}
