package fundamentos.tiposdedados;


import java.util.Locale;

/*São tipos que não armazenam diretamente o valor, mas sim uma referência (endereço) para um objeto na memória,
* ao contrario dos dados primitivos, eles podem possuir: métodos - atributos e valor null.
*/
public class DadosNaoPrimitivos {
    public  static void main(String[] args) {
        //classe String
        String nome = "Pablo";
        //métodos
        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());

        //Array
        int[] numeros = {1,2,3,4,5,6};
        String[] nomes = {"Pablo", "Gabi", "Miguel"};

        //Classes
        //Pessoa pessoa = new Pessoa();

        //Características
        //Podem ter métodos
            nome.toUpperCase();
            nome.length();
        //Podem receber null
            String nome2 = null;
        //São criados a partir de classes
        //Pessoa2 pessoa2 = new Pessoa2();
    }
}
