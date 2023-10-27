import java.time.LocalDate;

public class produit {
    LocalDate date_exp;
    int identifier;
    String libelle;
    String marque;
    double prix;

    public produit() {

    }

    public produit(int identifier, String libelle, String marque, double prix, LocalDate date_exp) {
        this.identifier = identifier;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.date_exp = date_exp;
    }

    void affiche() {
        System.out.println("le identifier " + identifier + " le libelle " + libelle + " le marque " + marque + " le prix " + prix + " la date est " + date_exp);
        System.out.println(date_exp);
    }

    public String toString() {
        return "identifier: " + this.identifier + ", libelle: " + this.libelle + ", marque: " + this.marque + ", prix: " + this.prix;
    }

    public void setDate_ex(LocalDate date_exp) {
        this.date_exp = date_exp;
    }
}
