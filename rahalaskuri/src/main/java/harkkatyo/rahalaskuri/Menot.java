
package harkkatyo.rahalaskuri;

import harkkatyo.rahalaskuri.Meno;
import java.util.HashMap;


public class Menot {
    private HashMap<String, Meno> menot;
    
    public Menot () {
        menot = new HashMap<>();
    }
    
    public void lisaaMeno(String nimi, int arvo) {
        if(menot.keySet().contains(nimi)) {
            menot.get(nimi).lisaaArvoon(arvo);
        } else {
            menot.put(nimi, new Meno(nimi, arvo));
        }
    }
}
