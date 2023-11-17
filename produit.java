import java.time.LocalDate;

public class produit {
    private LocalDate dateExp;
    private int identifier;
    private String libelle;
    private String marque;
    private double prix;

    public produit() {

    }

    public produit(int identifier, String libelle, String marque, double prix, LocalDate dateExp) {
        this.identifier = identifier;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.dateExp = dateExp;
    }

    public void affiche() {
        System.out.println("le identifier " + identifier + " le libelle " + libelle + " le marque " + marque + " le prix " + prix + " la date est " + dateExp);
        System.out.println(dateExp);
    }

    public String toString() {
        return "identifier: " + this.identifier + ", libelle: " + this.libelle + ", marque: " + this.marque + ", prix: " + this.prix;
    }

    public LocalDate getDateExp() {
        return dateExp;
    }

    public void setDateExp(LocalDate dateExp) {
        this.dateExp = dateExp;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getidentifier() {
        return this.identifier;
    }
    public void setidentifier(int identifier) {
        this.identifier = identifier;
    }


    public boolean comparer1(produit prod) {
        return this.libelle.equals(prod.getLibelle()) && this.getPrix() == prod.getPrix() && this.identifier == prod.getidentifier();
    }

    public boolean comparer2(produit prod1, produit prod2) {
        return this.libelle.equals(prod1.getLibelle()) && this.getPrix() == prod1.getPrix() && this.identifier == prod1.getidentifier()
                && this.libelle.equals(prod2.getLibelle()) && this.getPrix() == prod2.getPrix() && this.identifier == prod2.getidentifier();
    }


}
