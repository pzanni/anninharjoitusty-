
package harkkatyo.rahalaskuri;

import java.util.HashMap;

/**
 * Tulot-luokka vastaa kaikista tuloista ja niihin liittyvistä olioista eli kaikki
 * tuloihin liittyvät toiminnot menevät tulot-luokan kautta, tulot-luokka myös 
 * vastaa käyttäjän merkitsemien tulojen yhteenvedosta.
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
    
    public void lisaaTukikuukausi() {
        if (opintotuki.getNosto() == 0) {
            System.out.println("Kuukausittainen opintotuen määrä: ");
            Double maara = kysyja.liukuluku();
            opintotuki.asetaOpintotuenMaara(maara);
        }
        opintotuki.lisaaTukikuukausi();
        yhteensa = yhteensa + opintotuki.getNosto();
    }
 
    public void vaihdaOpintotuenMaara(double arvo) {
        if(opintotuki == null) {
            opintotuki = new Opintotuki();
        }
        opintotuki.asetaOpintotuenMaara(arvo);
    }
    
    public void nollaaTukienArvo() {
        opintotuki.nollaaArvo();
    }
    
    public void nollaaTukikuukaudet() {
        opintotuki.nollaaKuukaudet();
    }
    
    public void lisaaOpintolainaan() {
        opintolaina.lisaaOpintolainaan();
        yhteensa = yhteensa + opintolaina.getNosto();
    }
    
    public void vaihdaOpintolaina(double arvo) {
        opintolaina.vaihdaOpintolaina(arvo);
    }
    
    public void vahennaOpintolainaa(double arvo) {
        opintolaina.vahenna(arvo);
    }
    
    public void lisaaPalkanmaksu(double arvo) {  
        palkka.lisaaPalkanmaksu(arvo);
        yhteensa = yhteensa + arvo;
    }
    
    public void lisaaTuloraja(double arvo) {
        palkka.lisaaTuloraja(arvo);
    }
    
    public void nollaaPalkanArvo() {
        palkka.nollaaArvo();
    }
    
    
    public void lisaaMuuTulo(String kategoria, double arvo) {
        if(muut.containsKey(kategoria)) {
            muut.get(kategoria).lisaaArvoon(arvo);
        } else {
            muut.put(kategoria, new MuuTulo(kategoria, arvo));
        }
        yhteensa = yhteensa + arvo;
    }
    
    public String MuutTulotString() {
        String palautus = "";
        int i = 0;
        for(String nimi : muut.keySet()) {
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
        return "Opintotuki: " + opintotuki.toString() + "\nOpintolaina: " + opintolaina.toString() + "\nPalkka: " + palkka.toString() + "\n" + this.MuutTulotString() + "\nYhteensä: " + yhteensa;
    }
    
}
