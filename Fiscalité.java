package tp8;

public class Fiscalité {

    public static void main(String[] args) {
        Personne p1=new Personne(1,"Samir","Loussif");
        Personne p2=new Personne(2,"Lotfi","Jormana");
        Personne p3=new Personne(3,"Nabil","Louhichi");
        Lotissement l = new Lotissement(10);
        l.ajouter(new ProprietePrivee(1,p1,"Majdoub",350,4));
        l.ajouter(new Villa(2,p2,"Dar Chaabane",400,6,true));
        l.ajouter(new Appartement(3,p2,"Hammamet",1200,8,3));
        l.ajouter(new ProprieteProfessionnelle(4,p3,"7abacha",1000,50,true));
        l.ajouter(new ProprieteProfessionnelle(5,p1,"Yathrib",2500,400,false));
        l.afficherProprietes();
        int tr=l.getnbPieces();
        System.out.println("Total number of rooms in all private properties: " + tr);
        
        double lowestTax=0;
        ProprietePrivee lowestTaxProperty=null;

        for (Propriete prop : l.getAllProperties()) {
            if (prop instanceof ProprietePrivee) {
                lowestTaxProperty=(ProprietePrivee) prop;
                lowestTax=prop.calculImpot();
                break;
            }
        }

        for (Propriete prop : l.getAllProperties()) {
            if (prop instanceof ProprietePrivee) {
                double tax=prop.calculImpot();
                if (tax<lowestTax) {
                    lowestTax=tax;
                    lowestTaxProperty=(ProprietePrivee) prop;
                }
            }
        }

        System.out.println("Private property with the lowest tax: " + lowestTaxProperty);
        System.out.println("Tax amount: " + lowestTax);

        for (Propriete prop : l.getAllProperties()) {
            if (prop instanceof Appartement && "Hammamet".equals(prop.getAdresse())) {
                l.supprimer(prop);
                System.out.println("Apartment at Hammamet has been removed.");
                break;
            }
        }

        l.afficherProprietes();
    }
    
    
    
}
