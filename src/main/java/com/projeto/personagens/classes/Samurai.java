package com.projeto.personagens.classes;

import com.projeto.equipamentos.Equipamento;
import com.projeto.personagens.Personagem;
import com.projeto.personagens.Status;

//Classe que representa Personagem do tipo Samurai
public class Samurai extends Personagem {

    public Samurai(String nome, int vidaMax, int dano, Equipamento equipamento) {
        this.setNome(nome);
        this.setEquipamento(equipamento);
        this.setStatus(new Status(vidaMax, vidaMax, dano));
    }

    @Override
    public int getDanoPorSegundoTotal() {
        int dpsTotal = this.getStatus().getDano() + this.getEquipamento().getDanoBase();
        //Samurais são mais rápidos que Ferreiros e Magos
        return dpsTotal * 2;
    }
}
