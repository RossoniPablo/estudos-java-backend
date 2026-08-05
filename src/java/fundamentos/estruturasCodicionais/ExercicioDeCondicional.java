package fundamentos.estruturasCodicionais;

//Exercício
//Quanto tenho que pagar de imposta na Olanda em 2020, baseado no meu salário
/*
    0 a 34.712      paga 9.70%
    34.713 a 68.507 paga 37.35%
    68.508          paga 49.50%
 */


public class ExercicioDeCondicional {
    public static void main(String[] args){
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100; //9.70%
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;

        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        }
        else if(salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        }
        else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("Salário anual: " + salarioAnual + " valor do imposto:  " + valorImposto);
    }
}
