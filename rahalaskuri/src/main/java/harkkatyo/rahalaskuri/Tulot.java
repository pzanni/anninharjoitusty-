
package harkkatyo.rahalaskuri;

import java.util.Scanner;


public class Tulot {
    private Opintotuki opintotuki;
    private Opintolaina opintolaina;
    private Palkka palkka;
    private double yhteensa;
    private Scanner lukija;
    
    
    public Tulot() {
        opintotuki = null;
        opintolaina = null;
        palkka = null;
        lukija = new Scanner(System.in);
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
    
    public void lisaaOpintolainaan() {
        if(opintolaina == null) {
            opintolaina = new Opintolaina();
            System.out.println("Oletus: laina 400/kk");
        }
        opintolaina.lisaaOpintolainaan();
    }
    
    public void lisaaPalkanmaksu(double arvo) {
        if(palkka == null) {
            palkka = new Palkka();            
        }    
        palkka.lisaaPalkanmaksu(arvo);
    }
}
