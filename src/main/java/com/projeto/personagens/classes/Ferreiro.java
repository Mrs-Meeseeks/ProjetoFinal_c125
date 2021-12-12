package com.projeto.personagens.classes;

import com.projeto.equipamentos.Equipamento;
import com.projeto.personagens.Personagem;
import com.projeto.personagens.Status;
import com.projeto.equipamentos.armas.Cajado;
import com.projeto.equipamentos.armas.Katana;
import com.projeto.equipamentos.armas.Martelo;

//Classe que representa Personagem do tipo Ferreiro
public class Ferreiro extends Personagem {

    public Ferreiro(String nome, int vidaMax, int dano, Equipamento equipamento) {
        this.setNome(nome);
        this.setEquipamento(equipamento);
        this.setStatus(new Status(vidaMax, vidaMax, dano));
    }

    @Override
    public int getDanoPorSegundoTotal() {
        int dpsTotal = this.getStatus().getDano() + this.getEquipamento().getDanoBase();
        return dpsTotal;
    }

    // Ferreiro é responsável pela construção de equipamentos
    public static Equipamento construirEquipamento(String nome) {
        if (nome.equalsIgnoreCase("KATANA")) {
            return new Katana();
        }
        if (nome.equalsIgnoreCase("CAJADO")) {
            return new Cajado();
        }
        if (nome.equalsIgnoreCase("MARTELO")) {
            return new Martelo();
        }
        throw new RuntimeException("O ferreiro não sabe fazer equipamento do tipo: " + nome);
    }
}
