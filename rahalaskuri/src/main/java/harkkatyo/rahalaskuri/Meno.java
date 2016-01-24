
package harkkatyo.rahalaskuri;
import java.util.Collections;


public class Meno {
    private String nimi;
    private int arvo;
    
    public Meno(String nimi, int arvo) {
        this.nimi = nimi;
        this.arvo = arvo;
    }
    
    public void lisaaArvoon(int maara) {
        arvo = arvo + maara;
        
    }
    
    public String getNimi() {
        return nimi;
    }
    
    public int getArvo() {
        return arvo;
    }
    
    public String toString() {
        return nimi + " " + arvo;
    }
    
    
   
}
