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
     * käyttäjä syöttää merkkijonon josta metodi poistaa whitespacet ja muuttaa
     * kaikki kirjaimet pieniksi ja palauttaa muunnellun merkkijonon.
     * @return 
     */
    
    public String trimmattuMerkkijono() {
        String jono = lukija.nextLine();
        jono.trim().toLowerCase();
        return jono;
    }
    
     /**
     * Metodi palauttaa käyttäjän syöttämän merkkijonon.
     *
     */
    
    public String merkkijono() {
        return lukija.nextLine();
    }

    /**
     * metodi palauttaa käyttäjän syöttämän liukuluvun,
     *
     * @return
     */
    public double liukuluku() {

        Double luku = 0.0;
        try {
            luku = Double.parseDouble(lukija.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Annoit epäkelvollisen liukuluvun!");
        }

        return luku;
    }

}
