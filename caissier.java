public class caissier extends employe {
    private int numeroDeCaisse;

    public caissier(int identifiant, String nom, String adresse, int nbrheure, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbrheure);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public float calculSalaire() {
        return super.getNbrheure() > 180 ? (super.getNbrheure() * 5 + (super.getNbrheure() - 180) * 5.75f) : (super.getNbrheure() * 5);
    }
}
