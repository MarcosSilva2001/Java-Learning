public class OperadorCondicional {
    public static void main(String[] args) {
        
        //Exp1 ? Exp1 : Exp2
        //se verifica si Expresion uno se cumple , de cumplirse se ejecuta una accion 1 y de lo contrario una accion 2

        //ejemplo
        int num1=2;
        int num2=5;
        String resultado;

        resultado = (num1 > num2) ? "Es mayor" : "Es menor";

        System.out.println(resultado);
    }
}
