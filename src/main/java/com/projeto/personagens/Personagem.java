package com.projeto.personagens;

import com.projeto.equipamentos.Equipamento;

// Classe abstrata de Personagem
// Encapsula dados que serão reutilizados nos diferentes tipos de personagens
public abstract class Personagem {
    private Status status;
    private String nome;
    private Equipamento equipamento;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    // Reduz a vida atual do personagem passado usando o dano deste
    // retorna true se o ataque for fatal
    public boolean atacar(Personagem personagem) {
        Status status = personagem.getStatus();
        int vidaAtual = status.getVidaAtual();
        if(vidaAtual - this.getDanoPorSegundoTotal() <= 0) {
            status.setVidaAtual(0);
            return true;
        }
        status.setVidaAtual(vidaAtual - this.getDanoPorSegundoTotal());
        return false;
    }

    public abstract int getDanoPorSegundoTotal();

    @Override
    public String toString() {
        return
            "Nome: " + this.nome + "\n" +
            "Tipo: " + this.getClass().getSimpleName() + "\n" +
            "Vida: " + this.status.getVidaAtual() + "/" + this.status.getVidaMax() + "\n" +
            "Arma: " + this.equipamento.getTipoEquipamento() + " | DPS: " + this.equipamento.getDanoBase() + "\n" +
            "DPS Total: " + this.getDanoPorSegundoTotal();
    }
}
