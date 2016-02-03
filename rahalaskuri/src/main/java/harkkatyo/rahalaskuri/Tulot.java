
package harkkatyo.rahalaskuri;

import java.util.HashMap;
import java.util.Scanner;


public class Tulot {
    private Opintotuki opintotuki;
    private Opintolaina opintolaina;
    private Palkka palkka;
    private double yhteensa;
    private Scanner lukija;
    private HashMap<String, MuuTulo> muut;
    
    
    public Tulot() {
        opintotuki = null;
        opintolaina = null;
        palkka = null;
        lukija = new Scanner(System.in);
        muut = new HashMap<>();
    }
    
    public void lisaaTukikuukausi() {
        if (opintotuki == null) {
            opintotuki = new Opintotuki();
            System.out.println("Kuukausittainen opintotuen määrä: ");
            Double maara = Double.parseDouble(lukija.nextLine());
            opintotuki.asetaOpintotuenMaara(maara);
        }
        opintotuki.lisaaTukikuukausi();
    }
 
    public void vaihdaOpintotuenMaara(double arvo) {
        if(opintotuki == null) {
            opintotuki = new Opintotuki();
        }
        opintotuki.asetaOpintotuenMaara(arvo);
    }
    
    public void lisaaOpintolainaan() {
        if(opintolaina == null) {
            opintolaina = new Opintolaina();
            System.out.println("Oletus: laina 400/kk");
        }
        opintolaina.lisaaOpintolainaan();
    }
    
    public void vaihdaOpintolaina(double arvo) {
        if(opintolaina == null) {
            opintolaina = new Opintolaina();
        }
        opintolaina.vaihdaOpintolaina(arvo);
    }
    
    public void lisaaPalkanmaksu(double arvo) {
        if(palkka == null) {
            palkka = new Palkka();            
        }    
        palkka.lisaaPalkanmaksu(arvo);
    }
    
    public void lisaaTuloraja(double arvo) {
        if(palkka == null) {
            palkka = new Palkka();
        }
        palkka.lisaaTuloraja(arvo);
    }
    
    public void lisaaMuuTulo(String kategoria, double arvo) {
        if(muut.containsKey(kategoria)) {
            muut.get(kategoria).lisaaArvoon(arvo);
        } else {
            muut.put(kategoria, new MuuTulo(kategoria, arvo));
        }
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
    
}
