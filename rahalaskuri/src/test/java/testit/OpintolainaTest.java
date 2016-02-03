/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testit;

import harkkatyo.rahalaskuri.Opintolaina;
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
    @Before
    public void setUp() {
        laina = new Opintolaina();
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
    public void montaLisaystaSummaantuu() {
        laina.lisaaOpintolainaan();
        laina.lisaaOpintolainaan();
        laina.vaihdaOpintolaina(200);
        laina.lisaaOpintolainaan();
        assertEquals("Yhteensä 1000.0", laina.toString());
    }
    
    @Test
    public void negatiivinenLainaEiMahdollinen() {
        laina.vaihdaOpintolaina(-300);
        laina.lisaaOpintolainaan();
        assertEquals("Yhteensä 400.0", laina.toString());
    }
   

    
}
