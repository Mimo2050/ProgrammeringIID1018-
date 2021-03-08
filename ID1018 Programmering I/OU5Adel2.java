import static java.lang.System.out;

public class PunktTest
{
    public static void main (String [] args)
    {
        //testa en konstrukor och en transformator
        Punkt p1 = new Punkt ("A", 3, 3);
        Punkt p2 = new Punkt ("A", 3, 3);
        out.println (p1 + " " + p2);

        //testa inspektorer
        String n = p1.getNamn ();
        int x = p1.getX ();
        int y = p1.getY ();
        out.println (n + " " + x + " " + y);

        //test en kombinartor och en komparator

        double d = p1.avstand (p2);
        out.println (d);
        String s1 =  p1.toString();
        String s2 = p2.toString();
        boolean b = s1.equals(s2);
        out.println (b);

        //testa mutatorer
        p2.setX (1);
        p2.setY (2);
        out.print(p2);

        //testa en konstruktor till
        Punkt p = new Punkt (p1);
        out.print(p);
    }

}
