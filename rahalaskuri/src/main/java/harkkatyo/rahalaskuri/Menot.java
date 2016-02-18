package harkkatyo.rahalaskuri;

import harkkatyo.rahalaskuri.Meno;
import java.util.HashMap;
import java.util.Collections;

/**
 * Menot-luokkaan on säilötty kaikki meno-oliot ja niitä pystyy menot-luokasta
 * säätelemään, kuten tulostamaan ja lisäämään uuden meno-olion tai kohottamaan
 * vanhan arvoa.
 *
 * @author pzanni
 */
public class Menot {

    private HashMap<String, Meno> menot;

    public Menot() {
        menot = new HashMap<>();
    }

    /**
     * metodi tarkastaa onko annettu merkkijono jo hashmapin avaimena ja jos on,
     * metodi lisää sen meno-olion arvo-muuttujaan parametrinä saadun arvon, jos
     * ei ole niin metodi laittaa hashmappiin uuden kategorian ja luo uuden
     * meno-olion.
     *
     * @param nimi
     * @param arvo
     */
    public void lisaaMeno(String nimi, double arvo) {
        if (menot.keySet().contains(nimi)) {
            menot.get(nimi).lisaaArvoon(arvo);
        } else {
            menot.put(nimi, new Meno(nimi, arvo));
        }
    }

    /**
     * metodi tarkastaa onko annettu kategoria hashmapissä avaimena, jos on niin
     * metodi poistaa kyseisen avaimen ja sen arvon, jos ei ole niin metodi
     * kertoo asiasta.
     *
     * @param nimi
     */
    public void poistaKategoria(String nimi) {
        if (menot.containsKey(nimi)) {
            menot.remove(nimi);
        } else {
            System.out.println("Ei kategoriaa " + nimi);
        }
    }

    /**
     * metodi tarkastaa onko annettu kategoria hashmapissa, jos on metodi nollaa
     * kategoriaan liittyvän meno-olion arvo-muuttujan arvon, jos ei ole metodi
     * ilmoittaa asiasta.
     *
     * @param nimi
     */
    public void nollaaKategoria(String nimi) {
        if (menot.containsKey(nimi)) {
            Meno kopio = menot.get(nimi);
            kopio.nollaaArvo();
            menot.replace(nimi, kopio);
        } else {
            System.out.println("Ei kategoriaa " + nimi);
        }
    }

    /**
     * metodi tyhjentää luokan menot-hashmapin.
     */
    public void poistaKaikki() {
        menot.clear();
    }

    public String toString() {
        String palautus = "";

        int i = 0;
        for (String nimi : menot.keySet()) {
            i++;

            if (i < menot.keySet().size()) {
                palautus = palautus + menot.get(nimi).toString() + "\n";
            } else {
                palautus = palautus + menot.get(nimi).toString();
            }
        }
        return palautus;
    }
}
