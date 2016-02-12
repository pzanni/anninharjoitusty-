
package harkkatyo.rahalaskuri;


import harkkatyo.rahalaskuri.Meno;
import java.util.HashMap;
import java.util.Collections;

/**
 * Menot-luokkaan on säilötty kaikki meno-oliot ja niitä pystyy menot-luokasta 
 * säätelemään, kuten tulostamaan ja lisäämään uuden meno-olion tai kohottamaan vanhan arvoa.
 * @author pzanni
 */

public class Menot {
    private HashMap<String, Meno> menot;
    
    public Menot () {
        menot = new HashMap<>();
    }
    
    public void lisaaMeno(String nimi, double arvo) {
        if(menot.keySet().contains(nimi)) {
            menot.get(nimi).lisaaArvoon(arvo);
        } else {
            menot.put(nimi, new Meno(nimi, arvo));
        }
    }
    
    public String toString() {
        String palautus = "";
        
        int i = 0;
        for(String nimi : menot.keySet()) {
            i++;
            
            if (i < menot.keySet().size()) {
                palautus = palautus + menot.get(nimi).toString() + "\n";
            } else {
                palautus = palautus + menot.get(nimi).toString();
            }  
        }
        return palautus;
    }
}
