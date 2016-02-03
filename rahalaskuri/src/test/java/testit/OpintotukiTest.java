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
    public void tuenMaaranAsettaminenToimii() {
        optuki.asetaOpintotuenMaara(300);
        assertEquals(300, optuki.getNosto(), PIENILUKU);
    }
    
    @Test 
    public void eiNegatiivistaTukea() {
        optuki.asetaOpintotuenMaara(-30);
        assertEquals(0, optuki.getNosto(), PIENILUKU);
    }
    
    @Test
    public void tukikuukaudenLisaysToimii() {
        optuki.asetaOpintotuenMaara(300);
        optuki.lisaaTukikuukausi();
        assertEquals("300.0 1kk", optuki.toString());
    }
    
    @Test
    public void useatLisayksetSummaantuvat() {
        optuki.asetaOpintotuenMaara(300);
        optuki.lisaaTukikuukausi();
        optuki.lisaaTukikuukausi();
        optuki.lisaaTukikuukausi();
        assertEquals("900.0 3kk", optuki.toString());
    }
    
    @Test
    public void kuukaudetEivatLisaannyIlmanTukea() {
        optuki.lisaaTukikuukausi();
        assertEquals("0.0 0kk", optuki.toString());
    }
    
    @Test
    public void tuenMaaranVaihtoOnnistuu() {
        optuki.asetaOpintotuenMaara(300);
        optuki.lisaaTukikuukausi();
        optuki.asetaOpintotuenMaara(500);
        optuki.lisaaTukikuukausi();
        assertEquals("800.0 2kk", optuki.toString());
    }

    
}
