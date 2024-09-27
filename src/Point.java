public class Point {
    private String nom;
    private int abs;
    private int ord;
    public Point(String n,int a,int o)
    {
         abs = a;
         ord = o;
         nom = n;
    }
    public Point(int a,int o)
    {
        ord = o;
        abs = a;
        nom = "";
    }
    public Point(String n)
    {
        nom = n;
        abs = 0;
        ord = 0;
    }
    void affiche()
    {
        System.out.println(nom+"("+abs+","+ord+")");
    }
    void TranslHoriz (int a)
    {
        abs = abs + a;
    }
    void TranslVert(int a)
    {
        ord +=a;
    }
    void Translation (int a, int b)
    {
        abs = abs + a;
        ord +=b;
    }
    void setNom(String ch)
    {
        nom = ch;
    }
    void setAbscisse(int a)
    {
        abs = a;
    }
    void setOrdonnée(int a)
    {
        ord = a;
    }
    String getNom()
    {
        return nom;
    }
    int getAbscisse()
    {
        return abs;
    }
    int getordonne()
    {
        return ord;
    }
    boolean Coincide (Point p)
    {
        return (p.abs==abs && p.ord==ord);
    }
}
