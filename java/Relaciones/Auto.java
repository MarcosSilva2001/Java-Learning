package Relaciones;

import java.util.List;


/*
    El auto puede tener una relacion 1 a 1 con el propietario ya que el coche solo tiene un propietario
    El propietario puede tener una relacion de 1 a muchos (1 a N) con la clase auto ya que puede tener varios autos
    Tambien la clase auto puede ir de 1 a N y tener varios propietarios , una coleccion de propietarios

*/

public class Auto {
    
    private long id;
    private String marca;
    private String modelo;
    
    private List<Propietario> listaPropietarios; // un coche puede tener una lista de propietarios ralacion 1 a N

    public Auto() {
    }

    public Auto(long id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

  
    
    
}
