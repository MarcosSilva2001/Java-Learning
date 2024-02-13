package Abstraccion;

// la clase hija Animal es abstracta pues podemos dividirlos en carnivoros y  hervivoros  o una mezcla de ambos
public abstract  class Animal extends SerVivo{
    
    @Override
    public abstract void alimentarse(); // es un metodo abstracto pues depende se si es un animal carnivoro o hervivoro
}
