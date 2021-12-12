package com.projeto.equipamentos.armas;

import com.projeto.equipamentos.Equipamento;
import com.projeto.equipamentos.TipoEquipamento;

// Classe que representa o equipamento do tipo KATANA
public class Katana implements Equipamento {
    @Override
    public int getDanoBase() {
        return 20;
    }

    @Override
    public TipoEquipamento getTipoEquipamento() {
        return TipoEquipamento.KATANA;
    }
}
