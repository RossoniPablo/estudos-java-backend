package poo.introducaoMetodos.teste;

import poo.introducaoMetodos.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Pablo";
        funcionario.idade = 24;
        funcionario.salarios = new double[]{1500, 1800, 2000};

        funcionario.imprimeVoid();

        }

}