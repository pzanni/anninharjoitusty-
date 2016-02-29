/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harkkatyo.rahalaskuri.tulotestit;

import harkkatyo.rahalaskuri.tulot.Opintolaina;
import harkkatyo.rahalaskuri.tulot.Opintolaina;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
public class OpintolainaTest {

    Opintolaina laina;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        laina = new Opintolaina();
        System.setOut(new PrintStream(outContent));
    }
    
    @After
    public void cleanUpStreams() {
        System.setOut(null);

    }

    @Test
    public void oletusLainaOn400() {
        laina.lisaaOpintolainaan();
        assertEquals("Yhteensä 400.0", laina.toString());
    }

    @Test
    public void lainanVaihtoOnnistuu() {
        laina.vaihdaOpintolaina(600);
        laina.lisaaOpintolainaan();
        assertEquals("Yhteensä 600.0", laina.toString());
    }
    
    @Test
    public void ilmoittaaNegatiivisestaLainasta() {
        laina.vaihdaOpintolaina(-300);
        assertEquals("Lainan tulee olla positiivinen luku.\n", outContent.toString());
    }

    @Test
    public void montaLisaystaSummaantuu() {
        laina.lisaaOpintolainaan();
        laina.lisaaOpintolainaan();
        laina.vaihdaOpintolaina(200);
        laina.lisaaOpintolainaan();
        assertEquals("Yhteensä 1000.0", laina.toString());
    }

    @Test
    public void lainanVahennysOnnistuuPositiivisella() {
        laina.lisaaOpintolainaan();
        laina.vahenna(100);
        assertEquals("Yhteensä 300.0", laina.toString());
    }

    @Test
    public void lainanVahennysOnnistuuNegatiivisella() {
        laina.lisaaOpintolainaan();
        laina.vahenna(-100);
        assertEquals("Yhteensä 300.0", laina.toString());
    }

}
