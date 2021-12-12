package com.projeto.personagens.classes;

import com.projeto.equipamentos.Equipamento;
import com.projeto.personagens.Personagem;
import com.projeto.personagens.Status;

//Classe que representa Personagem do tipo Mago
public class Mago extends Personagem {

    public Mago(String nome, int vidaMax, int dano, Equipamento equipamento) {
        this.setNome(nome);
        this.setEquipamento(equipamento);
        this.setStatus(new Status(vidaMax, vidaMax, dano));
    }

    @Override
    public int getDanoPorSegundoTotal() {
        int dpsTotal = this.getStatus().getDano() + this.getEquipamento().getDanoBase();
        return (int) Math.floor(dpsTotal * 1.5);
    }
}
