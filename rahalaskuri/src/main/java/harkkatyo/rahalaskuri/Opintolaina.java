
package harkkatyo.rahalaskuri;

/** Opintolaina-luokka pitää kirjaa nostetusta lainoista ja nykyisestä noston 
 *  määrästä jota voi halutessaan muuttaa (oletus 400).
 * 
 * @author pzanni
 */
public class Opintolaina {
    private double nosto;
    private double arvo;
    
    public Opintolaina() {
        nosto = 400;
    }
    
    /**
     * Tämä metodi vaihtaa opintolainan.
     * @param uusiNosto 
     */
    public void vaihdaOpintolaina(double uusiNosto) {
        if (uusiNosto >= 0) {
            nosto = uusiNosto;
        } else {
            System.out.println("Et voi nostaa negatiivista lainaa");
        }
    }
    
    public void lisaaOpintolainaan() {
        arvo = arvo + nosto;
    }
    
    public void vahenna(double vahennys) {
        if(vahennys > 0) {
            arvo = arvo - vahennys;
        } else if (vahennys < 0) {
            arvo = arvo + vahennys;
        }
    }
    
    public String toString() {
        return "Yhteensä " + arvo;
    }
    
    public double getNosto() {
        return nosto;
    }
    
}
