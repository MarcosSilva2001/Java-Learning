package Polimorfismo;

/*
    ------------------------------------------------ Polimorfismo -------------------------------------------------
    Se refiere a la capacidad de objetos de diferentes tipos de ser tratados como objetos de un mismo tipo  
    (Ejemplo Un vehiculo que tiene la funcion de estacionar y cada vehiculo se estaciona de maneras distintas) 
    durante la ejecución del programa. Esto se logra mediante el uso de herencia y la implementación de interfaces. 

    Un objeto puede comportarse de diferentes maneras    
    ---------------------------------------------------------------------------------------------------------------
 */
public  class Vehiculo {
    
    protected String marca;
    protected String matricula;
    protected Double precio;

    public Vehiculo(String marca, String matricula, Double precio) {
        this.marca = marca;
        this.matricula = matricula;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo de la marca" +  marca + ", matricula " + matricula + " y precio=" + precio ;
    }
    
    
    public  void estacionar(){
        System.out.println("Soy un vehiculo generico estacionando....");
    }
}
