package fundamentos.tiposdedados;

public class DadosPrimitivos {

    public static void main(String[] args) {
        int idade = 25;
        double preco = 19.90;
        boolean ativo = true;
        char inicial = 'R';
        long populacaoBrasil = 214_300_000L;

        System.out.println("Idade: " + idade);
        System.out.println("Preço: " + preco);
        System.out.println("Ativo: " + ativo);
        System.out.println("Inicial: " + inicial);
        System.out.println("População: " + populacaoBrasil);

        // Testando limites dos tipos
        System.out.println("Máximo de int: " + Integer.MAX_VALUE);
        System.out.println("Máximo de int + 1 (overflow): " + (Integer.MAX_VALUE + 1));
    }
}
