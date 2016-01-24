package testit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import harkkatyo.rahalaskuri.Meno;
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
    
    public MenoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        meno = new Meno("meno", 5);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void getNimiPalauttaaOikein() {
        
        assertEquals("meno", meno.getNimi());
    }
    
    @Test
    public void getArvoPalauttaaOikein() {
        assertEquals(5, meno.getArvo());
    }
    
    @Test
    public void toStringPalauttaaOikein() {
        assertEquals("meno 5", meno.toString());
    }
    
    @Test public void arvoonLisaysOnnistuu() {
        meno.lisaaArvoon(5);
        assertEquals(10, meno.getArvo());
    }
    
}