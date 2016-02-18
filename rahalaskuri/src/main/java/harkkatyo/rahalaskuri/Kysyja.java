package harkkatyo.rahalaskuri;

import java.util.Scanner;

/**
 * Kysyja-luokka sisältää Scanner-olion jota hyödynnetään pääasiassa komentoihin
 * liittyvissä luokissa LisaaMeno, LisaaTulo sekä Hallinnoi ja myös pienesti
 * luokassa Tulot
 *
 * @author pzanni
 */
public class Kysyja {

    private Scanner lukija;

    public Kysyja() {
        lukija = new Scanner(System.in);
    }

    public Scanner getLukija() {
        return lukija;
    }

    /**
     * Metodi palauttaa käyttäjän syöttämän merkkijonon.
     *
     */
    public String merkkijono() {
        return lukija.nextLine();
    }

    /**
     * metodi palauttaa käyttäjän syöttämän kokonaisluvun.
     *
     * @return
     */
    public int kokonaisluku() {
        return Integer.parseInt(lukija.nextLine());
    }

    /**
     * metodi palauttaa käyttäjän syöttämän liukuluvun,
     *
     * @return
     */
    public double liukuluku() {
        return Double.parseDouble(lukija.nextLine());
    }

}
