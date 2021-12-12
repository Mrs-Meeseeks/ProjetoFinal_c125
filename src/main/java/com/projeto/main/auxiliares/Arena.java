package com.projeto.main.auxiliares;

import com.projeto.personagens.Personagem;

// Onde serão feitas as batalhas entres os personagens
public class Arena {

    public static Personagem batalhar(Personagem p1, Personagem p2) {
        while(true) {
            // player 1 ataca o 2, se fatal, retorna player 1 como vencedor
            if(p1.atacar(p2)) {
                return p1;
            }
            // player 2 ataca o 1, se fatal, retorna player 2 como vencedor
            if(p2.atacar(p1)) {
                return p2;
            }
        }
    }

    public static void mostrarVencedor(Personagem p1, Personagem p2) {
        System.out.println(p1.getNome() + " X " + p2.getNome());
        System.out.println("===============================\nVencedor:\n");
        System.out.println(batalhar(p1,p2));
    }
}
