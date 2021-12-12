package com.projeto.main.auxiliares;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import com.projeto.equipamentos.Equipamento;
import com.projeto.personagens.Personagem;
import com.projeto.equipamentos.TipoEquipamento;
import com.projeto.personagens.classes.Ferreiro;
import com.projeto.personagens.classes.Mago;
import com.projeto.personagens.classes.Samurai;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static com.projeto.equipamentos.TipoEquipamento.*;
import static com.projeto.personagens.classes.Ferreiro.construirEquipamento;

//Classe para ler os personagens
public class CarregadorPersonagens {
    public static List<Personagem> lerPersonagens() {
        List<Personagem> personagens = new ArrayList<>();
        try {
            Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/entrada/personagens.csv"));
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
            List<String[]> linhas = csvReader.readAll();
            for (String[] linha : linhas) {
                Personagem personagem = null;
                Equipamento equipamento = construirEquipamento(linha[3]);
                String nome = linha[0];
                int vida = Integer.parseInt(linha[1]);
                int dano = Integer.parseInt(linha[2]);
                TipoEquipamento tipoEquipamento = equipamento.getTipoEquipamento();
                if(tipoEquipamento == CAJADO) {
                    personagem = new Mago(nome, vida, dano, equipamento);
                } else if (tipoEquipamento == KATANA) {
                    personagem = new Samurai(nome, vida, dano, equipamento);
                } else if (tipoEquipamento == MARTELO) {
                    personagem = new Ferreiro(nome, vida, dano, equipamento);
                }
                personagens.add(personagem);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException e) {
            e.printStackTrace();
        }
        return personagens;
    }
}
