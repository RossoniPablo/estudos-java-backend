package poo.introducaoClasses.teste;

import poo.introducaoClasses.Carro;

public class CarroTeste01 {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.nome = "Jeta";
        carro.modelo = "JTI";
        carro.ano = 2017;

        System.out.println("Meu carro é um " + carro.nome + " modelo " + carro.modelo + " ano " + carro.ano);
    }
}
