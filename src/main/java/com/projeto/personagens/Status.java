package com.projeto.personagens;
// Classe para guardar os Status de um personagem
public class Status {
    private int vidaMax;
    private int vidaAtual;
    private int dano;

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Status(int vidaMax, int vidaAtual, int dano) {
        this.vidaMax = vidaMax;
        this.vidaAtual = vidaAtual;
        this.dano = dano;
    }

}
