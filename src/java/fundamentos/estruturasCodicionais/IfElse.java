package fundamentos.estruturasCodicionais;

public class IfElse {
    public static void main(String[] args) {
        //if (se)
        // if else (se senão) //utilizando para testar condições
        // else if (utizado quando tiver mais de uma condição)

        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juventil
        // idade >=18 categoria adulto

        int idade = 15;
        if (idade < 15) {
            System.out.println("Idade: " + idade + ", categoria infantil");
        }
        else if( idade >= 15 && idade < 18){
            System.out.println("Idade: " + idade + ", categoria juvenil");
        }
        else {
            System.out.println("Idade: " + idade + ", categoria adulto");
        }
    }
}
