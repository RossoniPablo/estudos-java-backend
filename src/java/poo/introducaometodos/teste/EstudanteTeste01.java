package poo.introducaometodos.teste;

import poo.introducaometodos.Estudante;
import poo.introducaometodos.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args){
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome  =  "Nome01";
        estudante01.idade = 1;
        estudante01.sexo  = 'M';

        estudante02.nome  =  "Nome02";
        estudante02.idade = 2;
        estudante02.sexo  = 'F';

        ImpressoraEstudante impressora = new ImpressoraEstudante();

      impressora.imprime(estudante01);
      impressora.imprime(estudante02);





    }
}
