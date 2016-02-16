package harkkatyo.rahalaskuri;

/**
 * LisaaMeno-luokka vastaa menoihin liittyvien komentojen tarkentamisesta ja välittämisestä eteenpäin menot-luokalle.
 * @author pzanni
 */

public class LisaaMeno {

    private Menot menot;
    private Kysyja kysyja;

    public LisaaMeno() {
        menot = new Menot();
        kysyja = new Kysyja();
    }

    public void suorita() {
        System.out.println("Anna kategoria");
        String kategoria = kysyja.merkkijono();
        System.out.println("Anna arvo");
        double arvo = kysyja.liukuluku();

        menot.lisaaMeno(kategoria, arvo);
    }
    
    public String toString() {
        return menot.toString();
    }
    
    public Menot getMenot() {
        return menot;
    }
}
