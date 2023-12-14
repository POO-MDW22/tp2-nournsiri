public class AssietteRonde extends Assiette{
    private double rayon;
    public AssietteRonde(int anneefabrication,double rayon) {
        super(anneefabrication);
        this.rayon = rayon;
    }
    public double getrayon(){
        return rayon;
    }
    public double calculesurface(){
        return 3.14*getrayon()*getrayon();
    }











}