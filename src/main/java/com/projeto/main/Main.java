package com.projeto.main;

import com.projeto.main.auxiliares.Arena;
import com.projeto.personagens.Personagem;

import java.util.List;
import java.util.Scanner;

import static com.projeto.main.auxiliares.CarregadorPersonagens.lerPersonagens;

//classe principal, onde começa o código
public class Main {
    public static void main(String[] args) {
        List<Personagem> personagens = lerPersonagens();
        // mostrar os personagens disponiveis para batalha (MENU)
        System.out.println("Personagens: ");
        int i = 0;
        for (Personagem personagem : personagens) {
            System.out.println(i++ +": "+personagem.getNome());
        }
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Hora da batalha!!!");
        System.out.print("Digite o ID do 1º player:");
        int p1 = in.nextInt();
        System.out.print("Digite o ID do 2º player:");
        int p2 = in.nextInt();

        System.out.println();
        Arena.mostrarVencedor(personagens.get(p1),personagens.get(p2));
    }
}
