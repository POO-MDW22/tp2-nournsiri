import java.time.LocalDate;
public class Ustensile {
    private int anneefabrication;
    int anneeactuel;
    public Ustensile(){}
    public Ustensile(int anneefabrication) {
        this.anneefabrication = anneefabrication;

    }
    public void set_anneefabrication(int anneefabrication){
        this.anneefabrication=anneefabrication;
    }
    public int get_annneefabrication(){
        return anneefabrication;
    }

    public double calculevaleur (int anneeactuel){
        int age=LocalDate.now().getYear()-get_annneefabrication();
        double valeur=0;
        if (age>50){
            valeur=age-50;
        }
        return valeur;

    }


}