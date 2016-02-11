/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testit;

import harkkatyo.rahalaskuri.Palkka;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PalkkaTest {
    Palkka palkka;
    
    @Before
    public void setUp() {
        palkka = new Palkka();
    }
    
    @Test
    public void palkanLisaysOnnistuu() {
        palkka.lisaaPalkanmaksu(200);
        assertEquals("Kausi 200.0", palkka.toString());
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
    
    
}
