
package harkkatyo.rahalaskuri;
import java.util.Collections;
/**
 * Meno-luokkaan käyttäjä voi tallentaa itse nimeämänsä rahamenon ja 
 * kasvattaa sen arvoa halutessaan.
 * @author pzanni
 */

public class Meno {
    private String nimi;
    private double arvo;
    
    public Meno(String nimi, double arvo) {
        this.nimi = nimi;
        
        if(arvo > 0) {
            this.arvo = arvo;
        } else {
            this.arvo = 0;
        }
        
    }
    
    public void lisaaArvoon(double maara) {
        if(maara > 0) {
            arvo = arvo + maara;
        }          
    }
    
    public String getNimi() {
        return nimi;
    }
    
    public double getArvo() {
        return arvo;
    }
    
    public String toString() {
        return nimi + " " + arvo;
    }
    
    
   
}
