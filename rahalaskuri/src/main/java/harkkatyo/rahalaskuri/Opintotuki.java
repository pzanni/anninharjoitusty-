package harkkatyo.rahalaskuri;

/**
 * Opintotuki-luokka pitää kirjaa nostetun opintotuen yhteissummasta sekä
 * käytetyistä tukikuukausista, luokka myös muistaa kuukausittaisen opintotuen
 * määrän ja sitä voi halutessaan vaihtaa.
 *
 * @author pzanni
 */
public class Opintotuki {

    private double yhteensa;
    private double nosto;
    private int tukikuukaudet;

    /**
     * metodi lisää luokan yhteensa-muuttujan arvoon sen nosto-muuttujan arvon,
     * sekä kasvattaa luokan tukikuukaudet-muuttujan arvoa yhdellä.
     */
    public void lisaaTukikuukausi() {
        if (nosto > 0) {
            yhteensa = yhteensa + nosto;
            tukikuukaudet++;
        }
    }

    /**
     * metodi tarkastaa onko saatu parametri positiivinen, jos on se asteteaan
     * luokan nosto-muuttujan arvoksi.
     *
     * @param maara
     */
    public void asetaOpintotuenMaara(double maara) {
        if (maara >= 0) {
            nosto = maara;
        }
    }

    public double getNosto() {
        return nosto;
    }

    public String toString() {
        return yhteensa + " " + tukikuukaudet + "kk";
    }

    public void nollaaArvo() {
        yhteensa = 0;
    }

    public void nollaaKuukaudet() {
        tukikuukaudet = 0;
    }
}
