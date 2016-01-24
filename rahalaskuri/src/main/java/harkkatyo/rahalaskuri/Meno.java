
package harkkatyo.rahalaskuri;


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
}
