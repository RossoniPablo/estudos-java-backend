package poo.introducaometodos.teste;

import poo.introducaometodos.Calculadora;

public class CalculadoraTeste01 {
    public void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.calcularDoisNumeros();
        calculadora.subtrairDoisNumeros();
        //metodo criado com parametros
        calculadora.multiplicaDoisNumeros(10, 10);

        //metodo com retorno
        System.out.println(calculadora.divideDoisNumero(20, 0));
    }
}
