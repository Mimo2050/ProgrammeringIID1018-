//Att komma till classen(EnTriangelOchDessCirklar) i Package(OU2)
import OU2.Triangel;
//class name
public class EnTriangelOchDessCirklar
{	//Main metoden
	public static void main (String [ ] args ) 
	{
		//Den ska liten bok
        double trianglesomkrets = Triangel.omkrets(2, 4, 8);
        System.out.println(" Trianglesomkrets är :" + trianglesomkrets);

        double bis2 = Triangel.bisektris(1, 2, 0);
        System.out.println(" bisektris är :" + bis2);

        double median1 = Triangel.median(5, 3, 2);
        System.out.println(" median är :" + median1);

        double area = Triangel.area3sidor(6, 6, 4);
        System.out.println(" area är :" + area);

        double area1 = Triangel.area(2, 6);
        System.out.println(" area är :" + area1);

        double radien = Triangel.omskrivnaCirkeln(6, 6 ,6);
        System.out.println(" radien är :" + radien);

        double radien1 = Triangel.inskrivnaCirkeln(6, 6, 6);
        System.out.println(" radien1 är :" + radien1); 
	}
}
