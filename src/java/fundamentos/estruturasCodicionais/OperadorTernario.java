package fundamentos.estruturasCodicionais;

//operador ternário é uma forma resumidade de escrever if e else, é indicado para quando tem somente uma condição.
//(condicao) ? verdadeiro : falso
public class OperadorTernario {
    public static void main(String[] args) {
        //Doar se salário for > 3000
        double salario = 3000;

        /*Utilizando if ele
         *String mensagemDoar = "Eu vou doar R$500,00";
         *String mensagemNaoDoar = "Ainda não posso doar";
         *String resultado;

         *if(salario > 5000) {
            resultado = mensagemDoar;
         *}
         *else {
            resultado = mensagemNaoDoar;
         *}

         *System.out.println(resultado);
        */

        //utilizando operador ternário
        String resultado = salario > 5000 ? "Eu vou doar R$500,00" : "Ainda não posso doar";

        System.out.println(resultado);
    }
}
