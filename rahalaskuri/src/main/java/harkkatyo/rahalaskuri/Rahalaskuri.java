
package harkkatyo.rahalaskuri;

import java.util.Scanner;


public class Rahalaskuri {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("--Rahalaskuri--");
        
        Menot menot = new Menot();
        Tulot tulot = new Tulot();
        Opintotuki opintotuki = new Opintotuki();
        
        double tili = 0.0;
        
        while(true) {
            System.out.println("");
            System.out.println("Valitse toiminto: ");
            System.out.println("[1] lisää meno");
            System.out.println("[2] lisää tulo");
            System.out.println("[3] tulosta menot");
            System.out.println("[4] tulosta tulot");
            System.out.println("[5] hallinnoi");
            System.out.println("[x] poistu");
            System.out.println("Tili: " + tili);
            
            String komento = lukija.nextLine();
            
            if(komento.equals("x")) {
                break;
            }
            
            if(komento.equals("1")) {
                System.out.println("Anna kategoria");
                String kategoria = lukija.nextLine();
                System.out.println("Anna arvo");
                double arvo = Double.parseDouble(lukija.nextLine());
                
                menot.lisaaMeno(kategoria, arvo);
                tili = tili - arvo;
            }
            
            if (komento.equals("2")) {
                System.out.println("[1] Opintotuki");
                System.out.println("[2] Opintolaina");
                System.out.println("[3] Palkka");
                System.out.println("[4] Muu tulo");
                
                String syote = lukija.nextLine();
                
                if (syote.equals("1")) {
                    tulot.lisaaTukikuukausi();
                    tili = tili + tulot.getOpintotuki().getNosto();
                } else if (syote.equals("2")) {
                    tulot.lisaaOpintolainaan();
                    tili = tili + tulot.getOpintolaina().getNosto();
                } else if (syote.equals("3")) {
                    System.out.println("Anna arvo: ");
                    double palkka = Double.parseDouble(lukija.nextLine());
                    tulot.lisaaPalkanmaksu(palkka);
                    tili = tili + palkka;
                } else if (syote.equals("4")) {
                    System.out.println("Anna kategoria: ");
                    String kategoria = lukija.nextLine();
                    System.out.println("Anna arvo: ");
                    double muuarvo = Double.parseDouble(lukija.nextLine());
                    tulot.lisaaMuuTulo(kategoria, muuarvo);
                    tili = tili + muuarvo;
                }
            }
            
            if(komento.equals("3")) {
                System.out.println(menot.toString());
            }
            
            if(komento.equals("4")) {
                System.out.println(tulot.toString());
            }
        }
    }
}
