package poo.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //Ordem de execução
    /*
        1- Alocado espaço na memoria para objeto
        2- Cada atributo de classe é criado e inicializado com valore default ou o que for passado
        3- Bloco de inicialização é executado
        4- Construtor é executado
     */


    //Bloco de inicialização
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];

        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] =  i + 1;
        }
    }

    public Anime(){

        for (int episodios : this.episodios){
            System.out.println(episodios + " ");
        }
    }
}
