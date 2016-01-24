/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testit;

import harkkatyo.rahalaskuri.Menot;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MenotTest {
    
    Menot menot;
    
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
    public void yhdenMenonLisays() {
        menot.lisaaMeno("juusto", 60);
        assertEquals("juusto 60", menot.toString());
    }
    
    @Test
    public void UseammanMenonLisays() {
        menot.lisaaMeno("ruoka", 20);
        menot.lisaaMeno("juoma", 30);
        assertEquals("ruoka 20\njuoma 30", menot.toString());
    }
    
    
    
}
