public class vendeur extends employe {
    double tauxDeVente;
    public  vendeur(int identifiant, String nom, String adresse, int nbr_heure,double tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heure);

        this.tauxDeVente = tauxDeVente;
    }
    public double calculsalaire() {
        return (tauxDeVente * 450);
    }
}