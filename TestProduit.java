import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestProduit {
    public static void main(String[] args) {

        produit p = new produit();
        LocalDate d3 = LocalDate.of(2023, 3, 30);
        LocalDate d = LocalDate.of(2021, 10, 23);
        LocalDate d2 = LocalDate.now();
        produit p1 = new produit(1021, "lait", "delice", 0, d2);
        produit p2 = new produit(2510, "yaourt", "vitalait", 0, d);
        produit p3 = new produit(3250, "tomate", "sicam", 1.200, d);
        System.out.println("donner l'identifier de produit");
        p1.affiche();
        p2.affiche();
        p3.affiche();
        p.affiche();

        p2.prix = 700;
        System.out.println("le prix du produit modifié : " + p2.prix);
        System.out.println(p.toString());
        p.setDate_ex(d);
        p2.setDate_ex(d3);
        p.affiche();
        p2.affiche();
        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);
    }
}