/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harkkatyo.rahalaskuri;

import harkkatyo.rahalaskuri.Menot;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MenotTest {
    
    Menot menot;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public MenotTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        menot = new Menot();
        System.setOut(new PrintStream(outContent));
    }
    
    @After
    public void cleanUpStreams(){
        System.setOut(null);
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void yhdenMenonLisays() {
        menot.lisaaMeno("juusto", 60);
        assertEquals("juusto 60.0", menot.toString());
    }
    
    @Test
    public void UseammanMenonLisays() {
        menot.lisaaMeno("ruoka", 20);
        menot.lisaaMeno("juoma", 30);
        assertEquals("juoma 30.0\nruoka 20.0", menot.toString());
    }
    
    @Test 
    public void arvonKorottaminenKategoriassa () {
        menot.lisaaMeno("juusto", 10);
        menot.lisaaMeno("juusto", 5);
        assertEquals("juusto 15.0", menot.toString());
    }
    
    @Test
    public void kategorianPoistoToimii() {
        menot.lisaaMeno("leipä", 5);
        menot.lisaaMeno("juusto", 10);
        menot.poistaKategoria("juusto");
        assertEquals("leipä 5.0", menot.toString());
    }
    
    @Test
    public void kategorianNollausToimii() {
        menot.lisaaMeno("unicafe", 2.60);
        menot.lisaaMeno("burger king", 7);
        menot.nollaaKategoria("unicafe");
        assertEquals("burger king 7.0\nunicafe 0.0", menot.toString());
    }
    
    @Test
    public void kaikkiPois() {
        menot.lisaaMeno("h&m", 25);
        menot.lisaaMeno("subi", 4.60);
        menot.poistaKaikki();
        assertEquals("", menot.toString());
    }
    
    @Test
    public void poistaKategoriaIlmoittaaVaarastaKategoriasta() {
        menot.poistaKategoria("juusto");
        assertEquals("Ei kategoriaa juusto\n", outContent.toString());
    }
    
    @Test
    public void nollaaKategoriaIlmoittaaVaarastaKategoriasta() {
        menot.nollaaKategoria("gigantti");
        assertEquals("Ei kategoriaa gigantti\n", outContent.toString());
    }
}
