package harkkatyo.rahalaskuri.menotestit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import harkkatyo.rahalaskuri.menot.Meno;
import harkkatyo.rahalaskuri.menot.Meno;
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
public class MenoTest {

    Meno meno;
    private static final double PIENILUKU = Double.MIN_VALUE;

    public MenoTest() {
    }

    @Before
    public void setUp() {
        meno = new Meno("meno", 5);
    }

    @Test
    public void getNimiPalauttaaOikein() {
        assertEquals("meno", meno.getNimi());
    }

    @Test
    public void getArvoPalauttaaOikein() {
        assertEquals(5.0, meno.getArvo(), PIENILUKU);
    }

    @Test
    public void toStringPalauttaaOikein() {
        assertEquals("meno 5.0", meno.toString());
    }

    @Test
    public void arvoonLisaysOnnistuu() {
        meno.lisaaArvoon(5);
        assertEquals(10.0, meno.getArvo(), PIENILUKU);
    }

    @Test
    public void negatiivisenArvonLisays() {
        meno.lisaaArvoon(-3);
        assertEquals(5, meno.getArvo(), PIENILUKU);
    }

    @Test
    public void negatiivinenArvoNollaantuu() {
        Meno meno2 = new Meno("meno", -3);
        assertEquals(0, meno2.getArvo(), PIENILUKU);
    }

    @Test
    public void nollausToimii() {
        meno.nollaaArvo();
        assertEquals(0, meno.getArvo(), PIENILUKU);
    }
}
