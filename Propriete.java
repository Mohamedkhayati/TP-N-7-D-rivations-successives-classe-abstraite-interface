package tp8;

public abstract class Propriete {
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Personne getResponsable() {
		return responsable;
	}


	public void setResponsable(Personne responsable) {
		this.responsable = responsable;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public double getSurface() {
		return surface;
	}


	public void setSurface(double surface) {
		this.surface = surface;
	}

	private int id;
    private Personne responsable;
    private String adresse;
    protected double surface;
    public Propriete(int id,Personne responsable,String adresse,double surface) {
        this.id=id;
        this.responsable=responsable;
        this.adresse=adresse;
        this.surface=surface;
    }

    
    public String toString() {
        return "ID:"+id+",Responsable:"+responsable+",Adresse:"+adresse+",Surface:"+surface;
    }

    public abstract double calculImpot();
}