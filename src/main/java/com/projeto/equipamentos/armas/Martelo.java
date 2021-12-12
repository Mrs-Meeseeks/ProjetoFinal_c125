package com.projeto.equipamentos.armas;

import com.projeto.equipamentos.Equipamento;
import com.projeto.equipamentos.TipoEquipamento;

// Classe que representa o equipamento do tipo MARTELO
public class Martelo implements Equipamento {
    @Override
    public int getDanoBase() {
        return 60;
    }

    @Override
    public TipoEquipamento getTipoEquipamento() {
        return TipoEquipamento.MARTELO;
    }
}
