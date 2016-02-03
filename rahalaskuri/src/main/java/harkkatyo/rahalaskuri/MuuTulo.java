
package harkkatyo.rahalaskuri;


public class MuuTulo {
    private double yhteensa;
    private String kategoria;
    
    public MuuTulo(String nimi, double arvo) {
        kategoria = nimi;
        yhteensa = yhteensa + yhteensa;
    }
    
    public void lisaaArvoon(double arvo) {
        if(arvo > 0) {
            yhteensa = yhteensa + yhteensa;
        }
    }
    
    public String toString() {
        return kategoria + " " + yhteensa;
    }
}
