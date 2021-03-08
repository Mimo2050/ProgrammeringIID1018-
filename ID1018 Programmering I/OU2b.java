//package för Triangel
package OU2;
//class name
public class Triangel
{
    //Metod för att beeräkninga Trianglesomkrets
    public static double omkrets (double length1, double length2, double length3)
    {
        double trianglesomkrets = length1 + length2 + length3;
        return trianglesomkrets;
    }
    //Metod för att beeräkninga bisektris
    public static double bisektris (double sidanA, double sidanB, double vinkelAlpha)
    {
        double bis = 2 * sidanA * sidanB * Math.cos(vinkelAlpha / 2);
        double bis1 = bis / (sidanA + sidanB);
        return bis1;
    }
    //Metod för att beeräkninga median1
    public static double median (double sidanA, double sidanB, double sidanC)
    {
        double median = Math.sqrt((2 * sidanA * sidanA) + (2 * sidanB * sidanB) - (sidanC * sidanC));
        double median1 = median / (2);
        return median1;
    }
    //Metod för att beeräkninga area (omskrivna cirkeln) 
    public static double area3sidor (double sidanA, double sidanB, double sidanC)
    {
        double s = (sidanA + sidanB + sidanC)/2;
        double area  = Math.sqrt(s * (s - sidanA) * (s - sidanB) * (s - sidanC));
        return area;
    }
    //Metod för att beeräkninga area1 (inskrivna cirkeln)     
    public static double area (double bas, double höjden)
    {
        double area1 = (bas * höjden) / 2;
        return area1;
    }
    //Metod för att beeräkninga radien (omskrivna cirkeln)   
    public static double omskrivnaCirkeln (double sidanA, double sidanB, double sidanC)
    {
        double s = (sidanA + sidanB + sidanC) / 2;
        double radien1 = (sidanA * sidanB * sidanC);
        double radien = 4*(Math.sqrt((s *  (s - sidanA) * (s - sidanB) * (s - sidanC))));
        double r = radien1/ radien;
        return r;
    }
    //Metod för att beeräkninga radien1 (inskrivna cirkeln)   
    public static double inskrivnaCirkeln (double sidanA, double sidanB, double sidanC)
    {
        double s = (sidanA + sidanB + sidanC)/2 ;
        double radien1 = Math.sqrt(( (s - sidanA) * (s - sidanB) * (s - sidanC))/s);
        return radien1;
    }
}
