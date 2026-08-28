package poo.construtores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //Construtor
    //Aqui obrigamos que na criação do objeto precisa passar os atributos
    public  Anime(String nome, String tipo, int episodios, String genero){
        this.nome =      nome;
        this.tipo =      tipo;
        this.episodios = episodios;
        this.genero    = genero;
    }


    //Construtor vazio, não precisa passar atributos na criação do objeto
    //Sobre carga de construtor
    public Anime(){}


    public void imprimir(){
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println(episodios);
        System.out.println(genero);
    }
}
