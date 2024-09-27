//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main (String [] args)
    {
        Point p1=new Point (3, 5);
        Point p2 = new Point ("a");
        Point p3 = new Point ("b", 3,5);
        System.out.println("\n ---------------------------\n");
        System.out.println("les points créés sont :");
        p1.affiche();
        p2.affiche();
        p3.affiche();
        System.out.println("\n ---------------------------\n");
        System.out.println("translation des point ");
        p1.TranslHoriz (4);
        p2.TranslVert(3);
        p3.Translation(5,2);
        p1.affiche();
        p2.affiche();
        p3.affiche();
        System.out.println("\n ---------------------------\n");
        System.out.println("modification des attributs des points") ;
        p1.setNom("SRI21");
        p2.setAbscisse(25);
        p3.setOrdonnée(50);
        p1.affiche ();
        p2.affiche ();
        p3.affiche ();
        System.out.println("\n ---------------------------\n");
        System.out.println("utilisation des méthodes get");
        String x = p1.getNom();
        int y=p1.getAbscisse();
        int z=p1.getordonne();
        System.out.println(" le nom du point p1 est : " + x);
        System.out.println(" son abscisse est : " + y);
        System.out.println(" son ordonnée est : " + z);
        p3.setNom("tt");
        p3.setAbscisse(2);
        p3.setOrdonnée(4);
        p3.affiche();
        if (p1.Coincide(p3) == true)
            System.out.println("Les 2 points p1 et p3 coïncident");
        else
            System.out.println("Les 2 points ne coïncident pas");
    }
}