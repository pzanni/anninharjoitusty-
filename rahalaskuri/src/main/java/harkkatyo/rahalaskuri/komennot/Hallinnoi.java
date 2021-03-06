package harkkatyo.rahalaskuri.komennot;

import harkkatyo.rahalaskuri.Kysyja;
import harkkatyo.rahalaskuri.komennot.LisaaTulo;
import harkkatyo.rahalaskuri.komennot.LisaaMeno;

/**
 * Hallinnoi-luokka vastaa tietojen hallinnointiin liittyvistä komennoista ja on
 * yhteydessä lisaameno ja lisaatulo-luokkiin sekä niiden kautta myös
 * tulot-luokkaan.
 *
 * @author pzanni
 */
public class Hallinnoi {

    private LisaaMeno lisaameno;
    private LisaaTulo lisaatulo;
    private Kysyja kysyja;

    public Hallinnoi(LisaaMeno lisaameno, LisaaTulo lisaatulo) {
        this.lisaameno = lisaameno;
        this.lisaatulo = lisaatulo;
        kysyja = new Kysyja();
    }

    /**
     * suorita-metodi tulostaa komentovaihtoehdot ja kysyy käyttäjältä komentoa.
     */
    public void suorita() {
        System.out.println("[1] Opintotuen hallinta");
        System.out.println("[2] Opintolainan hallinta");
        System.out.println("[3] Palkan hallinta");
        System.out.println("[4] Muiden tulojen hallinta");
        System.out.println("[5] Menojen hallinta");
        String komento = kysyja.merkkijono();

        if (komento.equals("1")) {
            this.opintotuki();
        }
        if (komento.equals("2")) {
            this.opintolaina();
        }
        if (komento.equals("3")) {
            this.palkka();
        }
        if (komento.equals("4")) {
            this.muutulo();
        }
    }

    /**
     * opintotuki-metodi tulostaa opintotuen hallintaan liittyvät metodit ja
     * kysyy niihin liittyvän komennon ja toimii sen mukaan.
     */
    public void opintotuki() {
        System.out.println("[1] Muuta opintotuen määrää");
        System.out.println("[2] Tyhjennä arvo");
        System.out.println("[3] Tyhjennä kuukausilaskenta");
        String komento = kysyja.merkkijono();

        if (komento.equals("1")) {
            System.out.println("Uusi opintotuki");
            double arvo = kysyja.liukuluku();
            lisaatulo.getTulot().vaihdaOpintotuenMaara(arvo);
        }

        if (komento.equals("2")) {
            lisaatulo.getTulot().nollaaTukienArvo();
            System.out.println("Tukien yhteisarvo nollattu");
        }

        if (komento.equals("3")) {
            lisaatulo.getTulot().nollaaTukikuukaudet();
            System.out.println("Tukikuukaudet nollattu");
        }
    }

    /**
     * opintolaina-metodi tulostaa komennot, kysyy komentoa käyttäjältä ja
     * toimii komennon mukaan.
     */
    public void opintolaina() {
        System.out.println("[1] Muuta lainan määrää");
        System.out.println("[2] Vähennä opintolainaa");
        String komento = kysyja.merkkijono();

        if (komento.equals("1")) {
            System.out.println("Uusi laina");
            double arvo = kysyja.liukuluku();
            lisaatulo.getTulot().vaihdaOpintolaina(arvo);
        }
        if (komento.equals("2")) {
            System.out.println("Vähennys");
            double arvo = kysyja.liukuluku();
            lisaatulo.getTulot().vahennaOpintolainaa(arvo);
        }

    }

    /**
     * palkka-metodi tulostaa palkkaan liittyvät hallintavaihtoehdot ja kysyy
     * käyttäjältä komentoa ja toimii sen mukaan.
     */
    public void palkka() {
        System.out.println("[1] Muuta tulorajaa");
        System.out.println("[2] Nollaa yhteisarvo");
        System.out.println("[3] Poista tuloraja");
        String komento = kysyja.merkkijono();

        if (komento.equals("1")) {
            System.out.println("Uusi tuloraja");
            double tuloraja = kysyja.liukuluku();
            lisaatulo.getTulot().lisaaTuloraja(tuloraja);
        }
        if (komento.equals("2")) {
            lisaatulo.getTulot().nollaaPalkanArvo();
            System.out.println("Palkan yhteisarvo nollattu");
        }
        if (komento.equals("3")) {
            lisaatulo.getTulot().lisaaTuloraja(Double.MAX_VALUE);
            System.out.println("Tuloraja poistettu");
        }
    }

    /**
     * muutulo-metodi tulostaa muiden tulojen hallintaan littyvät vaihtoehdot,
     * kysyy käyttäjältä komentoa ja toimii sen mukaan.
     */
    public void muutulo() {
        System.out.println("[1] Poista kategoria");
        System.out.println("[2] Nollaa kategorian arvo");
        System.out.println("[3] Poista kaikki");
        String komento = kysyja.merkkijono();

        if (komento.equals("1")) {
            lisaatulo.poistaKategoria();
        }

        if (komento.equals("2")) {
            lisaatulo.nollaaKategoria();
        }

        if (komento.equals("3")) {
            lisaatulo.poistaKaikki();
        }
    }

    /**
     * menot-metodi tulostaa menoihin liittyvät hallintavaihtoehdot ja toimii
     * käyttäjän antaman komennon mukaan.
     */
    public void menot() {
        System.out.println("[1] Poista kategoria");
        System.out.println("[2] Nollaa kategorian arvo");
        System.out.println("[3] Poista kaikki");
        String komento = kysyja.merkkijono();

        if (komento.equals("1")) {
            lisaameno.poistaMeno();
        }
        if (komento.equals("2")) {
            lisaameno.nollaaKategorianArvo();
        }
        if (komento.equals("3")) {
            lisaameno.poistaKaikki();
        }
    }
}
