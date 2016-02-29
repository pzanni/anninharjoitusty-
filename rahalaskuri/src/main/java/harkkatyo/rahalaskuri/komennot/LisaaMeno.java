package harkkatyo.rahalaskuri.komennot;

import harkkatyo.rahalaskuri.Kysyja;
import harkkatyo.rahalaskuri.menot.Menot;

/**
 * LisaaMeno-luokka vastaa menoihin liittyvien komentojen tarkentamisesta ja
 * välittämisestä eteenpäin menot-luokalle.
 *
 * @author pzanni
 */
public class LisaaMeno {

    private Menot menot;
    private Kysyja kysyja;

    public LisaaMeno() {
        menot = new Menot();
        kysyja = new Kysyja();
    }

    /**
     * suorita-metodia kutsutaan kun rahalaskuri-luokasta kutsutaan komentoa
     * "lisaa meno", siinä kysytään käyttäjältä menon kategoria ja arvo ja
     * annetaan ne eteenpäin menot-oliolle.
     */
    public void suorita() {
        System.out.println("Anna kategoria");
        String kategoria = kysyja.merkkijono();
        System.out.println("Anna arvo");
        double arvo = kysyja.liukuluku();

        menot.lisaaMeno(kategoria, arvo);
    }

    /**
     * poistaMeno kysyy käyttäjältä poistettavan kategorian ja antaa sen
     * eteenpäin menot-oliolle.
     */
    public void poistaMeno() {
        System.out.println("Anna poistettava kategoria");
        String nimi = kysyja.merkkijono();
        menot.poistaKategoria(nimi);
    }

    /**
     * nollaaKategorianArvo kysyy nollattavan kategorian nimeä ja antaa sen
     * menot- oliolle.
     */
    public void nollaaKategorianArvo() {
        System.out.println("Anna nollattava kategoria");
        String nimi = kysyja.merkkijono();
        menot.nollaaKategoria(nimi);
    }

    /**
     * poistaKaikki-metodia kutsuttaessa se kutsuu menot-luokan metodia
     * poistaKaikki.
     */
    public void poistaKaikki() {
        menot.poistaKaikki();
    }

    public String toString() {
        return menot.toString();
    }

    public Menot getMenot() {
        return menot;
    }
}
