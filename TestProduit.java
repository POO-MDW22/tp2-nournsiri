import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TestProduit {
    public static void main(String[] args) {
        Date date = new Date("31/2/2024");
        LocalDate Date = null;
        produit product1 = new produit(1021, "Lait", "Delice", 0, Date);
        produit product2 = new produit(2510, "Yaourt", "Vitalait", 0, Date);
        produit product3 = new produit(3250, "Tomate", "Sicam", 1.200, Date);
        product1.affiche();
        product2.affiche();
        product3.affiche();
        product1.setPrix(0.700);
        product1.affiche();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of the product " + product2 + ":");
        double prix = scan.nextDouble();
        product2.setPrix(prix);
        product2.affiche();
        product1.toString();
        product1.toString();
        product1.toString();
        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);
        System.out.println("Enter the number of products in the Magasin: ");
        int nombreProduits = 0;
        do {
            nombreProduits = scan.nextInt();
        } while (nombreProduits > 50 || nombreProduits < 0);
        produit pr = new produit();
        produit[] TP = new produit[50];
        for (int i = 0; i < nombreProduits; i++) {
            System.out.println("Enter the id of the product: ");
            pr.setIdentifier(scan.nextInt());
            System.out.println("Enter the Libelle of the product: ");
            pr.setLibelle(scan.next());
            System.out.println("Enter the marque: ");
            pr.setMarque(scan.next());
            pr.setPrix(-0.1);
            while (pr.getPrix() <= 0) {
                System.out.println("Enter the price of the Product: ");
                pr.setPrix(scan.nextDouble());
            }
            TP[i] = pr;
        }
        employe[] es = new employe[20];
        Magasin mg = new Magasin(1, "Tunis", 50);
        for (int i = 0; i < nombreProduits; i++) {
            mg.ajouterProduit(TP[i]);
        }
        mg.afficherMagasin();
        for (int i = 0; i < nombreProduits; i++) {
            if (TP[i].comparer(product1) && (TP[i].comparer(product2)) && (TP[i].comparer(product3))) {
                System.out.println("These are the same existing products");
            } else {
                System.out.println("The product does not exist twice");
            }
            if (TP[i].comparer(product1, product2)) {
                System.out.println("These are the same existing products");
            } else {
                System.out.println("The product does not exist twice");
            }
        }

        employe[] er = new employe[20];
        Magasin carrefour = new Magasin("Centre-Ville", 1, 1, TP, er, "mmg");
        Magasin monoprix = new Magasin("Manzah 6", 2, 2, TP, es, "mgg");

        caissier caissier1 = new caissier(1, "ala", "Adresse1", 160, 1);
        caissier caissier12 = new caissier(1, "ala", "Adresse1", 160, 2);
        vendeur vendeur1 = new vendeur(2, "ahmed", "Adresse2", 160, 0.8);
        responsable responsable1 = new responsable(3, "amine", "Adresse3", 160, 200);
        carrefour.ajouterEmploye(caissier1);
        carrefour.ajouterEmploye(caissier12);
        carrefour.ajouterEmploye(vendeur1);
        carrefour.ajouterEmploye(responsable1);
        caissier caissier2 = new caissier(1, "ala", "Adresse1", 160, 3);
        vendeur vendeur2 = new vendeur(2, "ahmed", "Adresse2", 160, 0.8);
        vendeur vendeur21 = new vendeur(2, "ahmed", "Adresse2", 160, 0.8);
        vendeur vendeur22 = new vendeur(2, "ahmed", "Adresse2", 160, 0.8);
        responsable responsable2 = new responsable(3, "amine", "Adresse3", 160, 200);
        monoprix.ajouterEmploye(caissier2);
        monoprix.ajouterEmploye(vendeur2);
        monoprix.ajouterEmploye(vendeur21);
        monoprix.ajouterEmploye(vendeur22);
        monoprix.ajouterEmploye(responsable2);

        carrefour.afficherMagasinEmployee();
        monoprix.afficherMagasinEmployee();

        System.out.println("Salaries of employees at carrefour");
        System.out.println("Salary of caissier 1 at carrefour");
        System.out.println(caissier1.calculSalaire());
        System.out.println("Salary of vendeur 1 at carrefour");
        System.out.println(((vendeur) vendeur1).calculsalaire()); 
        System.out.println("Salary of responsable 1 at monoprix");
        System.out.println(responsable1.calculSalaire());

        System.out.println("Salaries of employees at monoprix");
        System.out.println("Salary of caissier at monoprix");
        System.out.println(caissier2.calculSalaire());
        System.out.println("Salary of vendeur 1 at monoprix");
        System.out.println(((vendeur) vendeur21).calculsalaire()); 
        System.out.println("Salary of vendeur 2 at monoprix");
        System.out.println(((vendeur) vendeur22).calculsalaire()); 
        System.out.println("Salary of responsable at monoprix");
        System.out.println(responsable2.calculSalaire());

    }
}
