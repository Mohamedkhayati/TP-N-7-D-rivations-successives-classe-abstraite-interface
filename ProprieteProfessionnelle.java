package tp8;

public class ProprieteProfessionnelle extends Propriete {
    private int nbEmployes;
    private boolean estEtatique;

    public ProprieteProfessionnelle(int id,Personne responsable,String adresse, double surface, int nbEmployes, boolean estEtatique) {
        super(id,responsable,adresse,surface);
        this.nbEmployes=nbEmployes;
        this.estEtatique=estEtatique;
    }

    
    public double calculImpot() {
        if (estEtatique) return 0;
        return (surface/100)*100+nbEmployes*30;
    }

    
    public String toString() {
        return super.toString()+",Nombre d'employes:"+nbEmployes+",Est etatique:"+estEtatique;
        
    }
}
