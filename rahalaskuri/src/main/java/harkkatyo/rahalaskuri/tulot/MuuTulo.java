package harkkatyo.rahalaskuri.tulot;

/**
 * MuuTulo-luokka vastaa tuloista jotka eivät sovi muihin tulo-luokkiin, luokka
 * tallentaa käyttäjän valitseman nimen oliolle sekä arvon ja arvoa voi aina
 * kohottaa.
 *
 * @author pzanni
 */
public class MuuTulo {

    private double yhteensa;
    private String kategoria;

    public MuuTulo(String nimi, double arvo) {
        kategoria = nimi;
        yhteensa = yhteensa + arvo;
    }

    /**
     * metodi tarkastaa onko parametrinä saatu arvo positiivinen, jos on se
     * lisätään luokan yhteensa-muuttujaan.
     *
     * @param arvo
     */
    public void lisaaArvoon(double arvo) {
        if (arvo > 0) {
            yhteensa = yhteensa + arvo;
        }
    }

    public String toString() {
        return kategoria + " " + yhteensa;
    }
}
