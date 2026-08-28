package poo.sobreCargaMetodos.teste;

import poo.sobreCargaMetodos.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime();

        anime.iniciar("Seila o nome", "TV", 20, "Aventura");
        anime.imprimir();
    }
}
