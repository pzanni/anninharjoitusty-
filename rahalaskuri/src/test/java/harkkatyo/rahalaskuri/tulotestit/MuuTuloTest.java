package harkkatyo.rahalaskuri.tulotestit;

import harkkatyo.rahalaskuri.tulot.MuuTulo;
import harkkatyo.rahalaskuri.tulot.MuuTulo;
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
public class MuuTuloTest {

    public MuuTuloTest() {
    }

    @Test
    public void toStringToimii() {
        MuuTulo muutulo = new MuuTulo("mummi", 50);
        assertEquals("mummi 50.0", muutulo.toString());
    }

    @Test
    public void arvoonLisaysToimii() {
        MuuTulo muutulo = new MuuTulo("vaari", 40);
        muutulo.lisaaArvoon(100);
        assertEquals("vaari 140.0", muutulo.toString());
    }

    @Test
    public void eiNegatiivistaTuloa() {
        MuuTulo muutulo = new MuuTulo("mutsi", 100);
        muutulo.lisaaArvoon(-40);
        assertEquals("mutsi 100.0", muutulo.toString());
    }

}
