package tp8;

public class Villa extends ProprietePrivee {
    private boolean avecPiscine;

    public Villa(int id,Personne responsable,String adresse,double surface,int nbPieces, boolean avecPiscine) {
        super(id,responsable,adresse,surface,nbPieces);
        this.avecPiscine=avecPiscine;
    }

    public double calculImpot() {
        double impot=super.calculImpot();
        if (avecPiscine) impot+=200;
        return impot;
    }

    
    public String toString() {
        return super.toString()+",Avec piscine:"+avecPiscine;
    }
}


