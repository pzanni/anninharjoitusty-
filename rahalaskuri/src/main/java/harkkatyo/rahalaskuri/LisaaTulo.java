package harkkatyo.rahalaskuri;

/**
 * LisaaTulo-luokka vastaa tuloihin liittyvistä komentojen välittämisestä ja
 * tarkentamisesta.
 *
 * @author pzanni
 */
public class LisaaTulo {

    private Kysyja kysyja;
    private Tulot tulot;

    public LisaaTulo() {
        kysyja = new Kysyja();
        tulot = new Tulot();
    }

    /**
     * metodi tulostaa tulon lisäämiseen liittyvät komennot ja kysyy käyttäjältä
     * komentoa ja toimii sen mukaan.
     */
    public void suorita() {
        System.out.println("[1] Opintotuki");
        System.out.println("[2] Opintolaina");
        System.out.println("[3] Palkka");
        System.out.println("[4] Muu tulo");
        String komento = kysyja.merkkijono();

        if (komento.equals("1")) {
            tulot.lisaaTukikuukausi();
        } else if (komento.equals("2")) {
            tulot.lisaaOpintolainaan();
        } else if (komento.equals("3")) {
            this.palkka();
        } else if (komento.equals("4")) {
            this.muutulo();
        }
    }

    /**
     * metodi kysyy käyttäjältä palkan arvoa ja välittää arvon eteenpäin
     * tulot.luokkaan kutsuessaan sen metodia.
     */
    public void palkka() {
        System.out.println("Anna arvo: ");
        double arvo = kysyja.liukuluku();
        tulot.lisaaPalkanmaksu(arvo);
    }

    /**
     * metodi kysyy käyttäjältä muun tulon kategoriaa ja arvoa ja välittää
     * saadut arvot tulot-luokan metodille.
     */
    public void muutulo() {
        System.out.println("Anna kategoria");
        String kategoria = kysyja.merkkijono();
        System.out.println("Anna arvo");
        double arvo = kysyja.liukuluku();
        tulot.lisaaMuuTulo(kategoria, arvo);
    }

    public String toString() {
        return tulot.toString();
    }

    public Tulot getTulot() {
        return tulot;
    }
}
