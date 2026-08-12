package fundamentos.estruturasDeRepeticao.exercicios;

public class ExercicioFor {
    public static void main(String[] args){
        //Imprima todos os números pares de 0 até 10

        for (int i = 0; i <= 100 ; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
