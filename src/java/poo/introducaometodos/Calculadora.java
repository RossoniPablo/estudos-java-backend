package poo.introducaometodos;

public class Calculadora {
    //void quando não retorna nada, tem a saída mas não tem um retorno
    public void calcularDoisNumeros() {
        System.out.println(20 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(20 - 10);
    }

    //Passando parametros
    public void multiplicaDoisNumeros(int numeroA, int numeroB) {
        System.out.println(numeroA * numeroB);
    }

    //Metodo com retorno
    public double divideDoisNumero(double num1, double num2) {
        if(num2 != 0 ){
          return   num1 / num2;
        }
        return 0;
    }

    //Metodo com tipo primitivo
    //dentro da classe quando pasa vári
}
