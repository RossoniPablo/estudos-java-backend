package poo.construtores.teste;

import poo.construtores.dominio.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime("Pablo", "TV", 10, "ACAO");

        anime.imprimir();
    }
}
