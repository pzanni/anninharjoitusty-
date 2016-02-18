/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harkkatyo.rahalaskuri;

import harkkatyo.rahalaskuri.Palkka;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PalkkaTest {
    Palkka palkka;
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    @Before
    public void setUp() {
        palkka = new Palkka();
        
        System.setOut(new PrintStream(outContent));
        
    }
    
    @After
    public void cleanUpStreams(){
        System.setOut(null);
        
    }
    
    @Test
    public void palkanLisaysOnnistuu() {
        palkka.lisaaPalkanmaksu(200);
        assertEquals("Yhteensä 200.0", palkka.toString());
    }
    
    @Test
    public void tulorajanLisaysOnnistuu() {
        palkka.lisaaTuloraja(15000);
        assertEquals("Yhteensä 0.0/15000.0", palkka.toString());
    }
    
    @Test
    public void eiNegatiivistaPalkkaa() {
        palkka.lisaaTuloraja(1000);
        palkka.lisaaPalkanmaksu(300);
        palkka.lisaaPalkanmaksu(600);
        palkka.lisaaPalkanmaksu(-400);
        assertEquals("Yhteensä 900.0/1000.0", palkka.toString());
    }
     
    @Test
    public void tulorajanVaihtoOnnistuu() {
        palkka.lisaaTuloraja(300);
        palkka.lisaaPalkanmaksu(300);
        palkka.lisaaTuloraja(1000);
        assertEquals("Yhteensä 300.0/1000.0", palkka.toString());
    }
    
    @Test 
    public void eiNegatiivistaTulorajaa() {
        palkka.lisaaTuloraja(-30);
        palkka.lisaaPalkanmaksu(50);
        assertEquals("Yhteensä 50.0", palkka.toString());
    }
    
    @Test
    public void tulorajanTayttymisestaIlmoitetaan() {
        palkka.lisaaTuloraja(100);
        palkka.lisaaPalkanmaksu(120);
        assertEquals("Tuloraja täynnä.\n", outContent.toString());
    }
    
    
}
