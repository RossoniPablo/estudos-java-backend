package poo.introducaometodos.teste;

import poo.introducaometodos.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Pablo");
        funcionario.setIdade(24);
        funcionario.setSalarios(new double[]{1500, 1800, 2000});
        funcionario.imprime();
        System.out.println("Média: " + funcionario.getMedia());

        }

}