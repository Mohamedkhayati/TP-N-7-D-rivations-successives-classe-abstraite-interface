package tp8;

public class LotissementPrivée extends Lotissement {

    public LotissementPrivée(int capacité) {
        super(capacité);
    }

    
    public boolean ajouter(Propriete p) {
        if (p instanceof ProprietePrivee) {
            return super.ajouter(p);
        }
        return false;
    }

    
    public ProprietePrivee getpropriétéByIndex(int i) {
        if (tabProp[i] instanceof ProprietePrivee) {
            return (ProprietePrivee) tabProp[i];
        }
        return null;
    }
    public int getnbPieces() {
        int totalRooms=0;
        for (Propriete prop : tabProp) {
            if (prop instanceof ProprietePrivee) {
                totalRooms+=((ProprietePrivee)prop).getNbPieces();
            }
        }
        return totalRooms;
    }
}