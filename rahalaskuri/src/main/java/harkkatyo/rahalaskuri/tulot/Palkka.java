package harkkatyo.rahalaskuri.tulot;

/**
 * Palkka-luokka muistaa käyttäjän tienaamat palkat summattuna yhteensä-lukuna
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

    /**
     * Metodi tarkastaa onko annettu palkan arvo postitiivinen ja jos on niin,
     * se lisää palkan yhteisarvoon ja sen jälkeen vertaa yhteisarvoa
     * mahdolliseen asetettuun tulorajaan.
     *
     * @param palkka
     */
    public void lisaaPalkanmaksu(double palkka) {
        if (palkka > 0) {
            arvo = arvo + palkka;
        }

        if (tuloraja <= arvo) {
            System.out.println("Tuloraja täynnä.");
        }
    }

    /**
     * Metodi lisaaTuloraja tarkastaa onko annettu tuloraja positiivinen, jos on
     * se asettaa luokan tuloraja-muuttujan arvoksi annetun arvon.
     *
     * @param raja
     */
    public void lisaaTuloraja(double raja) {
        if (raja > 0) {
            tuloraja = raja;
        }
    }

    /**
     * nollaaArvo-metodi asettaa luokan arvo-muuttujan arvoksi 0.
     */
    public void nollaaArvo() {
        arvo = 0;
    }

    public String toString() {
        if (tuloraja != Double.MAX_VALUE) {
            return "Yhteensä " + arvo + "/" + tuloraja;
        } else {
            return "Yhteensä " + arvo;
        }
    }

}
