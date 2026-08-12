package fundamentos.arrays;

public class ArrayForEach {
    public static void main(String[] args) {
        //Formas de inicializar um array
        int[] numeros  = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{5,4,3,2,1};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros2[i]);
        }

        //não acessa um index especifico
        for(int num : numeros3){
            System.out.println(num);
        }

    }
}
