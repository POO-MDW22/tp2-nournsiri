import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestProduit {
    public static void main(String[] args) {

        produit genericProduct = new produit();  
        LocalDate d3 = LocalDate.of(2023, 3, 30);
        LocalDate d = LocalDate.of(2021, 10, 23);
        LocalDate d2 = LocalDate.now();
        produit p1 = new produit(1021, "lait", "delice", 0, d2);
        produit p2 = new produit(2510, "yaourt", "vitalait", 0, d);
        produit p3 = new produit(3250, "tomate", "sicam", 1.200, d);

        System.out.println("Donner l'identifier de produit");
        p1.affiche();
        p2.affiche();
        p3.affiche();
        genericProduct.affiche();

        p2.setPrix(700);
        System.out.println("Le prix du produit modifié : " + p2.getPrix());
        System.out.println(p1.toString());

        p1.setDateExp(d);
        p2.setDateExp(d3);
        p1.affiche();
        p2.affiche();

        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);
        System.out.println("Comparaison avec produit p1: " + p1.comparer1(p2));

        System.out.println("Comparaison avec produits p1 et p2: " + p1.comparer2(p1, p2));
    }
}
