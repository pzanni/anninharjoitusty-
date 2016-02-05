/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testit;

import harkkatyo.rahalaskuri.Tulot;
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
public class TulotTest {
    Tulot tulot;
    
    @Before
    public void setUp() {
        tulot = new Tulot();
    }
    
    @Test
    public void opintotuenAsetusToimii() {
        tulot.vaihdaOpintotuenMaara(300);
        tulot.lisaaTukikuukausi();
        assertEquals("300.0 1kk", tulot.getOpintotuki().toString());
    }
    
    @Test
    public void opintolainanNostoToimii() {
        tulot.lisaaOpintolainaan();
        assertEquals("Yhteensä 400.0", tulot.getOpintolaina().toString());
    }
    
    @Test 
    public void opintolainanMuutosToimii() {
        tulot.vaihdaOpintolaina(300);
        tulot.lisaaOpintolainaan();
        assertEquals("Yhteensä 300.0", tulot.getOpintolaina().toString());
    }
    
    @Test 
    public void palkanMaksuToimii() {
        tulot.lisaaPalkanmaksu(500);
        assertEquals("Yhteensä 500.0", tulot.getPalkka().toString());
    }
    
    @Test
    public void tulorajanAsetusToimii() {
        tulot.lisaaTuloraja(1000);
        assertEquals("Yhteensä 0.0/1000.0", tulot.getPalkka().toString());
    }
    
    @Test
    public void muunTulonLisaysOnnistuu() {
        tulot.lisaaMuuTulo("mummi", 50);
        assertEquals("mummi 50.0", tulot.MuutTulotString());
    }
    
    @Test
    public void useanMuunTulonLisaysOnnistuu() {
        Tulot tulot2 = new Tulot();
        tulot2.lisaaMuuTulo("mutsi", 100);
        tulot2.lisaaMuuTulo("sugardaddy", 500);
        System.out.println(tulot2.MuutTulotString());
        assertEquals("mutsi 100.0\nsugardaddy 500.0", tulot2.MuutTulotString());
    }
    
    
}
