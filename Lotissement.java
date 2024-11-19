package tp8;

import java.util.ArrayList;
import java.util.List;

public class Lotissement {
    protected Propriete[] tabProp;
    private int capacité;
    private int count;

    public Lotissement(int capacité) {
        this.capacité=capacité;
        this.tabProp=new Propriete[capacité];
        this.count=0;
    }

    public boolean ajouter(Propriete p) {
        if (count<capacité) {
            tabProp[count++]=p;
            return true;
        }
        return false;
    }

    public boolean supprimer(Propriete p) {
        for (int i=0;i<count;i++) {
            if (tabProp[i].equals(p)) {
                for (int j=i;j<count-1;j++) {
                    tabProp[j]=tabProp[j+1];
                }
                tabProp[--count]=null;
                return true;
            }
        }
        return false;
    }

    public List<Propriete> getAllProperties() {
        List<Propriete> properties=new ArrayList<>();
        for (int i=0;i<count;i++) {
            properties.add(tabProp[i]);
        }
        return properties;
    }

    public void afficherProprietes() {
        for (int i=0;i<count;i++) {
            System.out.println(tabProp[i].toString()+",Impôt:"+tabProp[i].calculImpot());
        }
    }

    public int getnbPieces() {
        int totalRooms=0;
        for (int i=0;i<count;i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                totalRooms+=((ProprietePrivee)tabProp[i]).getNbPieces();
            }
        }
        return totalRooms;
    }
}
