package fundamentos.operadores;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero1 = 10;
        int numero2 = 20;

        double resultadAdicao = numero1 + numero2;
        double resultadoSubtracao = numero1 - numero2;
        double resultadoMultiplicacao = numero1 * numero2;
        double resultadoDivisao = numero1 / numero2;
        System.out.println("Adição: "+ resultadAdicao +", Subtração: "+resultadoSubtracao +", Multiplicação: "+ resultadoMultiplicacao + ", Divisão: "+ resultadoDivisao);

        //Operadores Relacionais
            //% resto
                int resto = 20 % 2;
                System.out.println(resto);

            // < > menor maior
                boolean isDezMenorQueVinte = 10 < 20;
                System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);

                boolean isDezMaiorQueVinte = 10 > 20;
                System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);

            // <= menor igual
                boolean isDezMenorOuIgualQueVinte = 10 <= 20;
                System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);

            // >= maior igual
                boolean isDezMaiorOuIgualQueVinte = 10 >= 20;
                System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);

            // == igual
                boolean isDezIgualVinte = 10 == 20;
                System.out.println("isDezIgualVinte: " + isDezIgualVinte);

            // != diferente
                boolean isDezDiferenteDeDez = 10 != 10;
                System.out.println("isDezDiferenteDeDez: " + isDezDiferenteDeDez);

        //Operadores lógicos
            // &&(and) comparação - as duas comparações precisam ser verdadeiras, se não da falço
                int idade = 24;
                float salario = 3500f;
                boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
                boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3812;
                System.out.println(("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta));
                System.out.println(("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta));

            // ||(or)  ou - pelo menos uma das comparações precisa ser verdadeiro, para dar verdadeiro
                double valorTotalContaCorrente = 200;
                double valorTotalContaPoupanca = 20002;
                float valorPlaystation = 5000f;

                boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
                System.out.println(isPlaystationCincoCompravel);

            // !(not)  negação
                boolean maiorDeIdade = true;
                boolean podeEntrar = !maiorDeIdade;
                System.out.println(podeEntrar);

        //Operadores de atribuição
            // = igual
            // += mais igual
            // - menor igual
            // *= multiplicação igual
            // /= divisão igual
            // %= resto igual
            double bonus = 1800;
            bonus += 1000; //(bonus = bonus + 1000 ) 2800
            System.out.println(bonus);
            bonus -= 1000; //1800
            System.out.println(bonus);
            bonus *= 2; //3600
            System.out.println(bonus);
            bonus /= 2; //1800
            System.out.println(bonus);
            bonus %= 2; // 0
            System.out.println(bonus);

        // ++ --
            int contador = 0;
            contador += 1; // contator = contador + 1
            contador++;
            contador--;
            // antes primeiro incrementa e depois executa
            ++contador;
            --contador;
    }
}
