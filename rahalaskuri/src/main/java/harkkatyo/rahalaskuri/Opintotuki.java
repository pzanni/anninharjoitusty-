
package harkkatyo.rahalaskuri;


public class Opintotuki {
    private double yhteensa;
    private double nosto;
    private int tukikuukaudet;
    
    public void lisaaTukikuukausi() {
        if(nosto > 0) {
            yhteensa = yhteensa + nosto;
            tukikuukaudet++;
        }
    }
    
    public void asetaOpintotuenMaara(double maara) {
        if(maara >= 0) {
            nosto = maara;
        }
    }
    
    public double getNosto() {
        return nosto;
    }
    
    public String toString() {
        return yhteensa + " " + tukikuukaudet + "kk";
    }
}
