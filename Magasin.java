public class Magasin {
    private int id;
    private String adresse;
    private int capacite = 50;
    private produit[] tab = new produit[capacite];
    private int num = 0;

    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        if (capacite > 0) {
            this.capacite = capacite;
            this.tab = new produit[capacite];
        }
    }

    public Magasin() {
    }

    public void afficherMagasin() {
        System.out.println("ID: " + this.id);
        System.out.println("Adresse: " + this.adresse);
        System.out.println("Capacité: " + this.capacite);
        System.out.println("Produits:");
        for (int i = 0; i < num; i++) {
            System.out.println("Libellé: " + tab[i].getLibelle());
            System.out.println("Prix: " + tab[i].getPrix());
        }
    }

    public void ajouterProduit(produit p) {
        if (num < capacite) {
            tab[num] = p;
            num++;
        } else {
            System.out.println("La quantité a dépassé la capacité maximale de produits.");
        }
    }
}
