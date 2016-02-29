package harkkatyo.rahalaskuri.tulot;

/**
 * Opintolaina-luokka pitää kirjaa nostetusta lainoista ja nykyisestä noston
 * määrästä jota voi halutessaan muuttaa (oletus 400).
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
     * Metodi tarkistaa onko parametrinä saatu arvo positiivinen, jos on se
     * laitetaan luokan nosto-muuttujan arvoksi, jos ei metodi kertoo
     * ongelmasta.
     *
     * @param uusiNosto
     */
    public void vaihdaOpintolaina(double uusiNosto) {
        if (uusiNosto >=0) {
            nosto = uusiNosto;
        } else {
            System.out.println("Lainan tulee olla positiivinen luku.");
        }
    }

    /**
     * metodi lisää luokan arvo-muuttujaan sen nosto-muuttujan arvon.
     */
    public void lisaaOpintolainaan() {
        arvo = arvo + nosto;
    }

    /**
     * metodi katsoo onko saatu parametrin arvo neg vai pos ja sen mukaan lisää
     * sen luokan arvo-muuttujan arvoon.
     *
     * @param vahennys
     */
    public void vahenna(double vahennys) {
        if (vahennys > 0) {
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
