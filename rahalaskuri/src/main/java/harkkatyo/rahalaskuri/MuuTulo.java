
package harkkatyo.rahalaskuri;


public class MuuTulo {
    private double yhteensa;
    private String kategoria;
    
    public MuuTulo(String nimi, double arvo) {
        kategoria = nimi;
        yhteensa = yhteensa + arvo;
    }
    
    public void lisaaArvoon(double arvo) {
        if(arvo > 0) {
            yhteensa = yhteensa + arvo;
        }
    }
    
    public String toString() {
        return kategoria + " " + yhteensa;
    }
}
