package poo.introducaoclasses.teste;

import poo.introducaoclasses.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Pablo";
        estudante.idade = 24;
        estudante.genero = 'M';

        System.out.println("Nome " + estudante.nome + " Idade " + estudante.idade + " Genero " + estudante.genero);
    }
}
