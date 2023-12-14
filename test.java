public class test {
    public static void main (String[] args){
        AssietteRonde AR=new AssietteRonde(1199,4);
        System.out.println(AR.getrayon());
        AssietteCarree AC= new AssietteCarree(1955,9);
        System.out.println(AC.getcote());
        cuillere C1=new cuillere(2001,15);
        Ustensile[] ust=new Ustensile[5];
        ust[1]=new AssietteRonde(1970,7);
        ust[2]=new AssietteCarree(1960,13);
        ust[3]=new cuillere(1990,6);
        System.out.println(AR.getrayon());
        System.out.println(AC.getcote());
        System.out.println(C1.getLongueur());
        System.out.println(AR.calculevaleur(2023));
        System.out.println(AC.calculevaleur(2023));
        System.out.println(C1.calculevaleur(2023));
        System.out.println(AR.calculesurface());
        System.out.println(AC.calculesurface());










    }
}