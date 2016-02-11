
package harkkatyo.rahalaskuri;

/** Tämä luokka mallintaa palkkatulon.
 * 
 * @author pzanni
 */
public class Palkka {
    private double arvo;
    private double tuloraja;
    private double kausi;
    
    public Palkka() {
        tuloraja = Double.MAX_VALUE;
    }
    
    public void lisaaPalkanmaksu(double palkka) {
        if(palkka > 0) {
            arvo = arvo + palkka;
        }
        
        if(tuloraja <= arvo) {
            System.out.println("Tuloraja täynnä");
        }      
        this.toString();
    }
    
    public void lisaaTuloraja(double raja) {
        if(raja > 0) {
            tuloraja = raja;
        }
    }
    
    public String toString() {
        if(tuloraja != Double.MAX_VALUE) {
            return "Yhteensä " + arvo + "/" + tuloraja;
        } else {
            return "Yhteensä " + arvo;
        }
    }
    

}
