public class Magasin {
    private int id;
    private String adresse;
    private int capacite = 50;
    private produit[] tabProduits = new produit[capacite];
    private employe[] tabEmployes = new employe[20];
    private int numProduits = 0;
    private int numEmployes = 0;

    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        if (capacite > 0) {
            this.capacite = capacite;
            this.tabProduits = new produit[capacite];
        }
    }

    public Magasin(String s, int i, int i1, produit[] TP, employe[] er, String mmg) {
    }

    public void afficherMagasin() {
        System.out.println("ID: " + this.id);
        System.out.println("Adresse: " + this.adresse);
        System.out.println("Capacité: " + this.capacite);
        System.out.println("Produits:");
        for (int i = 0; i < numProduits; i++) {
            System.out.println("Libellé: " + tabProduits[i].getLibelle());
            System.out.println("Prix: " + tabProduits[i].getPrix());
        }
    }

    public void ajouterProduit(produit p) {
        if (numProduits < capacite) {
            tabProduits[numProduits] = p;
            numProduits++;
        } else {
            System.out.println("La quantité a dépassé la capacité maximale de produits.");
        }
    }

    public void ajouterEmploye(employe emp) {
        if (numEmployes < tabEmployes.length) {
            tabEmployes[numEmployes] = emp;
            numEmployes++;
        } else {
            System.out.println("La quantité d'employés a dépassé la capacité maximale.");
        }
    }

    public void afficherMagasinEmployee() {
        System.out.println("Employés du Magasin:");
        for (int i = 0; i < numEmployes; i++) {
            System.out.println("Identifiant: " + tabEmployes[i].getIdentifiant());
            System.out.println("Nom: " + tabEmployes[i].getNom());
            System.out.println("Adresse: " + tabEmployes[i].getAdresse());
            System.out.println("Nombre d'heures: " + tabEmployes[i].getNbrheure());

            if (tabEmployes[i] instanceof vendeur) {
                System.out.println("Taux de Vente: " + ((vendeur) tabEmployes[i]).tauxDeVente);
            } else if (tabEmployes[i] instanceof caissier) {
                System.out.println("Numéro de Caisse: " + ((caissier) tabEmployes[i]).getNumeroDeCaisse());
            }

            System.out.println("Salaire: " + tabEmployes[i].calculSalaire());
            System.out.println("-----------");
        }
    }
}