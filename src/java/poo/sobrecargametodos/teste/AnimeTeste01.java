package poo.sobrecargametodos.teste;

import poo.sobrecargametodos.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime();

        anime.iniciar("Seila o nome", "TV", 20, "Aventura");
        anime.imprimir();
    }
}
