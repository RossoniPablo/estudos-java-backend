package poo.introducaometodos.teste;

import poo.introducaometodos.Pessoa;

public class PessoaTeste01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Pablo");
        pessoa.setIdade(10);


//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
