public class cuillere extends Ustensile{
    private double Longueur;
    public cuillere(int anneefabrication,double Longueur) {
        super(anneefabrication);
        this.Longueur = Longueur;
    }
    public double getLongueur() {
        return Longueur;
    }

}