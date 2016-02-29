package harkkatyo.rahalaskuri.tulot;

import harkkatyo.rahalaskuri.Kysyja;
import java.util.HashMap;

/**
 * Tulot-luokka vastaa kaikista tuloista ja niihin liittyvistä olioista eli
 * kaikki tuloihin liittyvät toiminnot menevät tulot-luokan kautta, tulot-luokka
 * myös vastaa käyttäjän merkitsemien tulojen yhteenvedosta.
 *
 * @author pzanni
 */
public class Tulot {

    private Opintotuki opintotuki;
    private Opintolaina opintolaina;
    private Palkka palkka;
    private double yhteensa;
    private HashMap<String, MuuTulo> muut;
    private Kysyja kysyja;

    public Tulot() {
        opintotuki = new Opintotuki();
        opintolaina = new Opintolaina();
        palkka = new Palkka();
        muut = new HashMap<>();
        kysyja = new Kysyja();
    }

    /**
     * metodi tarkastaa ensin onko opintotukea lisätty aiemmin, jos ei ole se
     * kysyy opintotuen määrää ja asettaa sen pysyväksi opintotuen määräksi sekä
     * kutsuu myös opintotuki-luokan metodia ja kastattaa oman luokan
     * yhteensa-muuttujan arvoa annetun noston määrällä.
     */
    public void lisaaTukikuukausi() {
        if (opintotuki.getNosto() == 0) {
            System.out.println("Kuukausittainen opintotuen määrä: ");
            Double maara = kysyja.liukuluku();
            opintotuki.asetaOpintotuenMaara(maara);
        }
        opintotuki.lisaaTukikuukausi();
        yhteensa = yhteensa + opintotuki.getNosto();
    }

    /**
     * metodi asettaa opintotuki-olion luokan muuttujan arvoksi parametrinä
     * saadun arvon.
     *
     * @param arvo
     */
    public void vaihdaOpintotuenMaara(double arvo) {
        opintotuki.asetaOpintotuenMaara(arvo);
    }

    /**
     * metodi kutsuu opintotuki-olion metodia ja nollaa sen arvo-muuttujan
     * arvon.
     */
    public void nollaaTukienArvo() {
        opintotuki.nollaaArvo();
    }

    /**
     * metodi kutsuu opintotuki-olion metodia ja nollaa sen
     * tukikuukaudet-muuttujan arvon.
     */
    public void nollaaTukikuukaudet() {
        opintotuki.nollaaKuukaudet();
    }

    /**
     * metodi kutsuu opintolaina-olion metodia ja sen jälkeen lisää oman luokan
     * yhteensä- muuttujaan opintolaina-oliosta saadun noston arvon.
     */
    public void lisaaOpintolainaan() {
        opintolaina.lisaaOpintolainaan();
        yhteensa = yhteensa + opintolaina.getNosto();
    }

    /**
     * metodi kutsuu opintolaina-olion metodia saadulla parametrin arvolla.
     *
     * @param arvo
     */
    public void vaihdaOpintolaina(double arvo) {
        opintolaina.vaihdaOpintolaina(arvo);
    }

    /**
     * metodi kutsuu opintolaina-olion metodia saadulla parametrin arvolla.
     *
     * @param arvo
     */
    public void vahennaOpintolainaa(double arvo) {
        opintolaina.vahenna(arvo);
    }

    /**
     * metodi kutsuu palkka-olion metodia saadulla parametrin arvolla.
     *
     * @param arvo
     */
    public void lisaaPalkanmaksu(double arvo) {
        palkka.lisaaPalkanmaksu(arvo);
        yhteensa = yhteensa + arvo;
    }

    /**
     * metodi kutsuu palkka-olion metodia saadulla parametrin arvolla.
     *
     * @param arvo
     */
    public void lisaaTuloraja(double arvo) {
        palkka.lisaaTuloraja(arvo);
    }

    /**
     * metodi kutsuu palkka-olion metodia saadulla parametrin arvolla.
     */
    public void nollaaPalkanArvo() {
        palkka.nollaaArvo();
    }

    /**
     * metodi katsoo onko saatu kategorian nimi jo hashmapissa avaimena, jos on
     * se lisää kyseisen avaimen arvon olioon parametrinä saadun arvon, jos ei
     * se laittaa hashmappiin uuden kategoriaa vastaavan avaimen ja luo sille
     * uuden muutulo-olion.
     *
     * @param kategoria
     * @param arvo
     */
    public void lisaaMuuTulo(String kategoria, double arvo) {
        if (muut.containsKey(kategoria) && arvo > 0) {
            muut.get(kategoria).lisaaArvoon(arvo);
        } else if (arvo > 0) {
            muut.put(kategoria, new MuuTulo(kategoria, arvo));
        }
        yhteensa = yhteensa + arvo;

    }

    /**
     * metodi tarkastaa ensin onko muut-hashmapissa parametrina saatua
     * merkkijonoa avaimena, jos on niin se laittaa kys avaimen kohdalle uuden
     * muutulo-olion jonka arvo on 0.
     *
     * @param kategoria
     */
    public void nollaaKategoria(String kategoria) {
        if (muut.containsKey(kategoria)) {
            muut.put(kategoria, new MuuTulo(kategoria, 0));
        }
    }

    /**
     * metodi tarkastaa ensin onko hashmapissä parametrina saatua avainta, jos
     * on niin metodi poistaa kyseisen avaimen ja sen arvon.
     *
     * @param kategoria
     */
    public void poistaKategoria(String kategoria) {
        if (muut.containsKey(kategoria)) {
            muut.remove(kategoria);
        }
    }

    /**
     * metodi tyhjentää muut-hashmapin kokonaan.
     */
    public void poistaKaikki() {
        muut.clear();
    }

    /**
     * metodi tulostaa muut-hashmapin siisteinä riveinä jossa näkyy kategoria ja
     * sitä vastaava arvo.
     *
     * @return
     */
    public String muutTulotString() {
        String palautus = "";
        int i = 0;
        for (String nimi : muut.keySet()) {
            i++;

            if (i < muut.keySet().size()) {
                palautus = palautus + muut.get(nimi).toString() + "\n";
            } else {
                palautus = palautus + muut.get(nimi).toString();
            }
        }
        return palautus;
    }

    public Opintotuki getOpintotuki() {
        return opintotuki;
    }

    public Opintolaina getOpintolaina() {
        return opintolaina;
    }

    public Palkka getPalkka() {
        return palkka;
    }

    public Double getYhteensa() {
        return yhteensa;
    }

    public String toString() {
        return "Opintotuki: " + opintotuki.toString() + "\nOpintolaina: " + opintolaina.toString() + "\nPalkka: " + palkka.toString() + "\n" + this.muutTulotString() + "\nYhteensä: " + yhteensa;
    }

}
