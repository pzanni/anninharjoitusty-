/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testit;

import harkkatyo.rahalaskuri.Opintotuki;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pzanni
 */
public class OpintotukiTest {
    Opintotuki optuki;
    private static final double PIENILUKU = Double.MIN_VALUE;
    
    @Before
    public void setUp() {
        optuki = new Opintotuki();
    }
    
    @Test
    public void tukikuukaudenLisaaminenSummaanOnnistuu() {
        optuki.lisaaTukikuukausi(350);
        assertEquals(350, optuki.getYhteensa(), PIENILUKU);
    }
    
    @Test 
    public void negatiivinenTukituloEiMuutaSummaa() {
        optuki.lisaaTukikuukausi(-30);
        assertEquals(0, optuki.getYhteensa(), PIENILUKU);
    }
    
    @Test
    public void lisaaTukikuukausiKorottaaKuukausienArvoa() {
        optuki.lisaaTukikuukausi(364);
        assertEquals(1, optuki.getTukikuukaudet());
    }
    
    @Test
    public void toStringPalauttaaOikein() {
        optuki.lisaaTukikuukausi(400);
        optuki.lisaaTukikuukausi(400);
        assertEquals("800.0 2kk", optuki.toString());
    }

    
}
