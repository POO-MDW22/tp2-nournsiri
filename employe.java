public class employe {
    protected int identifiant;
    protected String nom;
    protected String adresse;
    protected int nbrheure;

    public employe() {
    }

    public employe(int identifiant, String nom, String adresse, int nbrheure) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrheure = nbrheure;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbrheure() {
        return nbrheure;
    }

    public void setNbrheure(int nbrheure) {
        this.nbrheure = nbrheure;
    }

    public float calculSalaire() {
        return 0.0f;
    }
}
