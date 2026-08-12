package fundamentos.estruturasDeRepeticao;

public class estruturas {
    public static void main(String[] args){
        int count = 1;
        while (count < 10){
            System.out.println("While: " + count);
            count ++;
        }

        count = 1;
        do {
            System.out.println("Do while antes da condição: "+ count++);
        }
        while (count < 10);

        for(int i = 0; i < 10; i++){
            System.out.println("For:" + i);
        }

    }
}
