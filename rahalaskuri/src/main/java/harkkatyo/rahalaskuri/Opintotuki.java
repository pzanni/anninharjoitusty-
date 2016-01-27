
package harkkatyo.rahalaskuri;


public class Opintotuki {
    private double yhteensa;
    private int tukikuukaudet;
    
    public void lisaaTukikuukausi(double tuet) {
        
        if(tuet > 0) {
            yhteensa = yhteensa + tuet;
            tukikuukaudet++;    
        }
    }
    
    public double getYhteensa() {
        return yhteensa;
    }
    
    public int getTukikuukaudet() {
        return tukikuukaudet;
    }
    
    public String toString() {
        return yhteensa + " " + tukikuukaudet + "kk";
    }
}
