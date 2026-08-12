package fundamentos.arrays;

public class Arrays02 {
    public static  void main(String[] args){
        //Iterando
        String[] nomes = new String[3];
        nomes[0] = "nome-1";
        nomes[1] = "nome-2";
        nomes[2] = "nome-3";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
