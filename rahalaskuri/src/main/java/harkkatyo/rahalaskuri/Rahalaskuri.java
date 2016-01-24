
package harkkatyo.rahalaskuri;

import java.util.Scanner;


public class Rahalaskuri {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("--Rahalaskuri--");
        
        Menot menot = new Menot();
        while(true) {
            System.out.println("Valitse toiminto: ");
            System.out.println("[1] lisää meno");
            System.out.println("[2] lisää tulo");
            System.out.println("[3] tulosta menot");
            System.out.println("[4] tulosta tulot");
            System.out.println("[x] poistu");
            
            String komento = lukija.nextLine();
            
            if(komento.equals("x")) {
                break;
            }
            
            if(komento.equals("1")) {
                System.out.println("Anna kategoria");
                String kategoria = lukija.nextLine();
                System.out.println("Anna arvo");
                int arvo = Integer.parseInt(lukija.nextLine());
                
                menot.lisaaMeno(kategoria, arvo);
            }
        }
    }
}
