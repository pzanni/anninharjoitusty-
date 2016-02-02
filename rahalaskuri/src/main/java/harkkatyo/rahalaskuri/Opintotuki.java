
package harkkatyo.rahalaskuri;


public class Opintotuki {
    private double yhteensa;
    private double nosto;
    private int tukikuukaudet;
    
    public void lisaaTukikuukausi() {
        yhteensa = yhteensa + nosto;
        tukikuukaudet++;
    }
    
    public void asetaOpintotuenMaara(double maara) {
        if(maara >= 0) {
            nosto = maara;
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
