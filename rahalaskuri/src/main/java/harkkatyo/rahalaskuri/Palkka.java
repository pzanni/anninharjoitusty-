
package harkkatyo.rahalaskuri;

/** Palkka-luokka muistaa käyttäjän tienaamat palkat summattuna yhteensä-lukuna 
 * ja käyttäjä voi halutessaan asettaa tulorajan joka ilmoittaa täyttyessään 
 * (mahd tulevaisuudessa myös hieman ennen kuin täyttyy).
 * 
 * @author pzanni
 */
public class Palkka {
    private double arvo;
    private double tuloraja;
    
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
    
    public void nollaaArvo() {
        arvo = 0;
    }
    
    public String toString() {
        if(tuloraja != Double.MAX_VALUE) {
            return "Yhteensä " + arvo + "/" + tuloraja;
        } else {
            return "Yhteensä " + arvo;
        }
    }
    

}
