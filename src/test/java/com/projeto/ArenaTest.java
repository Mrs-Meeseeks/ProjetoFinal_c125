package com.projeto;

import com.projeto.equipamentos.armas.Cajado;
import com.projeto.equipamentos.armas.Katana;
import com.projeto.equipamentos.armas.Martelo;
import com.projeto.main.auxiliares.Arena;
import com.projeto.personagens.classes.Ferreiro;
import com.projeto.personagens.classes.Mago;
import com.projeto.personagens.classes.Samurai;
import com.projeto.personagens.Personagem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// teste para equilibrio das batalhas
public class ArenaTest {
    Personagem ferreiro;
    Personagem samurai;
    Personagem mago;

    @Before
    public void setUp() throws Exception {
        ferreiro = new Ferreiro("FerreiroDeAstora", 2000, 150, new Martelo());
        samurai = new Samurai("SamuraiX", 1500, 110, new Katana());
        mago = new Mago("Magician", 1300, 150, new Cajado());

    }

    @Test
    public void ferreiroXSamuraiTest(){
        Assert.assertEquals(ferreiro, Arena.batalhar(ferreiro, samurai));
    }

    @Test
    public void samuraiXFerreiroTest(){
        Assert.assertEquals(samurai, Arena.batalhar(samurai, ferreiro));
    }

    @Test
    public void samuraiXMagoTest(){
        Assert.assertEquals(samurai, Arena.batalhar(samurai, mago));
    }

    @Test
    public void magoXSamuraiTest(){
        Assert.assertEquals(mago, Arena.batalhar(mago, samurai));
    }

    @Test
    public void ferreiroXMagoTest(){
        Assert.assertEquals(ferreiro, Arena.batalhar(ferreiro, mago));
    }

    @Test
    public void magoXFerreiroTest(){
        Assert.assertEquals(mago, Arena.batalhar(mago, ferreiro));
    }

}