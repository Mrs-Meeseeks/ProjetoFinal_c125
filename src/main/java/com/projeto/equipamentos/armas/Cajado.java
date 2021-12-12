package com.projeto.equipamentos.armas;

import com.projeto.equipamentos.Equipamento;
import com.projeto.equipamentos.TipoEquipamento;

// Classe que representa o equipamento do tipo CAJADO
public class Cajado implements Equipamento {
    @Override
    public int getDanoBase() {
        return 50;
    }

    @Override
    public TipoEquipamento getTipoEquipamento() {
        return TipoEquipamento.CAJADO;
    }
}
