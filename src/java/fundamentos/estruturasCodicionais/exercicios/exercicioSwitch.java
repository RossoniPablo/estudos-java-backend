package fundamentos.estruturasCodicionais.exercicios;

public class exercicioSwitch {
    public static void main(String[] args) {
        /*
        * Utilizando Switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        * considerando 1 como domingo
        * */
        byte dia = 4;

        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útel");
                break;
            default:
                System.out.println("Valor inválido");

        }
    }
}
