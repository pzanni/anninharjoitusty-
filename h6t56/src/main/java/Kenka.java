
public class Kenka {
    private int kenkaid;
    private Malli malli;
    
    public Kenka(int kenkaid, Malli malli) {
        this.kenkaid = kenkaid;
        this.malli = malli;
    }
    
    public int getKenkaid() {
        return kenkaid;
    }
    
    public Malli getMalli() {
        return malli;
    }
    
    public void setMalli(Malli malli) {
        this.malli = malli;
    }
    
    public void setKenkaid(int kenkaid) {
        this.kenkaid = kenkaid;
    }
}
