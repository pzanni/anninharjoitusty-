
package harkkatyo.rahalaskuri;


public class Rahalaskuri {
    public static void main(String[] args) {
        System.out.println("--Rahalaskuri--");
        
        LisaaMeno lisaameno = new LisaaMeno();
        LisaaTulo lisaatulo = new LisaaTulo();
        Hallinnoi hallinnoi = new Hallinnoi(lisaameno, lisaatulo);
        Kysyja kysyja = new Kysyja();
        
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
            
            String komento = kysyja.merkkijono();
            
            if(komento.equals("x")) {
                break;
            }
            
            if(komento.equals("1")) {
                lisaameno.suorita();
            }
            
            if (komento.equals("2")) {
                lisaatulo.suorita();
            }
            
            if(komento.equals("3")) {
                System.out.println(lisaameno.toString());
            }
            
            if(komento.equals("4")) {
                System.out.println(lisaatulo.toString());
            }
            
            if(komento.equals("5")) {
                hallinnoi.suorita();
            }
        }
    }
}
