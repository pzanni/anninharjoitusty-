
package harkkatyo.rahalaskuri;


public class Opintolaina {
    private double nosto;
    private double arvo;
    
    public Opintolaina() {
        nosto = 400;
    }
    
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
    
    public String toString() {
        return "Yhteensä " + arvo;
    }
    
    
}
