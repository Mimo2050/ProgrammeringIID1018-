//den för matningen ska inte repteras
import java.util.*; // Scanner, Locale

//Namn för hela övning
class Temperaturer
{
	//Namn för class till övning
	 public static void main (String[] args)
	 {
			 System.out.println ("TEMPERATURER\n");
			
			 	// inmatningsverktyg
			 	Scanner in = new Scanner (System.in);
				in.useLocale (Locale.US);

				 // mata in uppgifter om antalet veckor och antalet mätningar
				 System.out.print ("antalet veckor: ");
				 int antalVeckor = in.nextInt ();
				 System.out.print ("antalet mätningar per vecka: ");
				 int antalMatningarPerVecka = in.nextInt ();
				 
				 // plats att lagra temperaturer
				 double[][] t = new double[antalVeckor + 1][antalMatningarPerVecka + 1];
				 
				 // mata in temperaturerna
				 //for loop för den första lista (antal veckor)
				 for (int vecka = 1; vecka <= antalVeckor; vecka++)
				 {
					 System.out.println ("temperaturer - vecka " + vecka + ":");
					 //for loop för den andra lista (antal matning i veckan)
					 for (int matning = 1; matning <= antalMatningarPerVecka; matning++)	 
					 t[vecka][matning] = in.nextDouble ();
				 }
				 System.out.println ();
				 
				 // visa temperaturerna
				System.out.println ("temperaturerna:");
				for (int vecka = 1; vecka <= antalVeckor; vecka++)
				{
					 for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
					 System.out.print (t[vecka][matning] + " ");
					 System.out.println ();
				}
				 System.out.println ();
				 
				 // den minsta, den största och medeltemperaturen – veckovis
				 double[] minT = new double[antalVeckor + 1];
				 double[] maxT = new double[antalVeckor + 1];
				 double[] sumT = new double[antalVeckor + 1];
				 double[] medelT = new double[antalVeckor + 1];
				 
				 // visa den minsta, den största och medeltemperaturen för varje vecka
				 
				 // Minsta värde							
				 System.out.println("Min temperaturen: ");
				 
				 for (int i = 1; i < t.length; i ++)
				 {
					minT[i] = t[i][1]; 
						for (int a = 1 ; a < t [i].length; a++)
						{
							if (t[i][a] < minT[i])
							{
							minT[i] = t [i][a];
							}
						}
					
				 }
				 for (int b = 1; b <= antalVeckor; b++)
				 {
				 System.out.println(minT[b]);
				 }
				 
				 //Största
				 System.out.println("Max temperaturen: ");
				
				 for (int i = 0; i < t.length; i ++)
				 {
					maxT[i] = t[i][0]; 
						for (int a=1 ; a < t [i].length; a++)
						{
							if (t[i][a] > maxT[i])
							{
							maxT[i] = t [i][a];
							}
						}
				 }
				 for (int b = 1; b<=antalVeckor; b++)
				 {
				 System.out.println(maxT[b]);
				 }
				 
				 //Summa
				 System.out.println ("Summa: ");
				 for (int i = 1; i < t.length; i ++)
				 {
				 	for (int a = 1; a < t[i].length; a ++)
				 	{
					      sumT[i] = sumT[i] + t[i][a]; 
				 	}
				 }
				 
				 for (int i = 1; i <= antalVeckor; i ++)
				 {
					 System.out.println(sumT[i]);
				 }
				 
				 //Medeltemperaturen
				 System.out.println ("Medelvärde: ");
				 for (int i = 1; i <= antalVeckor; i ++)
				 {
					 medelT [i]= sumT[i] / antalMatningarPerVecka;
					 System.out.println(medelT [i]);
				 }
				 
				 System.out.println ();
				 System.out.println ();
					
				 // den minsta, den största och medeltemperaturen - hela mätperioden
				 double minTemp = minT[1];
				 double maxTemp = maxT[1];
				 double sumTemp = sumT[0];
				 double medelTemp = 0;

				 // Minsta temperaturen för hela mätperioden 							
				 System.out.println("Minsta temperaturen för hela mätperioden: ");
				 for (int i = 1; i < t.length; i ++)
				 {
						for (int a = 1 ; a < t [i].length; a++)
						{
							if (minTemp > minT[i])
							{
								minTemp = minT[i];
							}
						}
				 }
				 System.out.println(minTemp);

				 //Minsta temperaturen för hela mätperioden 
				 System.out.println("temperaturen för hela mätperioden: ");
				 for (int i=1 ; i < maxT.length; i++)
				 {
					 if (maxTemp < maxT[i])
					 {
					   maxTemp = maxT[i];
				     }
				  }
				 System.out.println(maxTemp);

				 // Summa temperaturen för hela mätperioden 
				 System.out.println("Summa för hela mätperioden är: ");
				 for (int i = 1; i < maxT.length; i ++)
				 {
					 sumTemp = sumTemp + sumT [i];
				 }
				 System.out.println(sumTemp);
				 
				 // Medel temperaturen för hela mätperioden
				 System.out.println("Medel temperaturen för hela mätperioden: ");
				 medelTemp = sumTemp / (antalMatningarPerVecka * antalVeckor);
				 System.out.println(medelTemp);

	 	}
 }
 
 
 /*
-----------------------------------------------------------------------------------------------------------------------     
Uppgifter i samband med temperaturmätningar

1. Skapa en tabell som innehåller möjliga temperaturer, både de som erhålls genom mätningarna och de som beräknas.
     
2. Komplettera programmet Temperaturer: lägg till den kod som bestämmer och visar de minsta, största och medeltemperaturerna. 
    Kör programmet flera gånger med olika data, och kontrollera om de erhållna resultaten är riktiga.
     
3. Rita den vektor där de temperaturer som erhålls genom mätningarna lagras. 
     Hur kommer man åt en viss uppgift i denna vektor? 
     Rita även de vektorer och variabler där de erhållna resultaten lagras.
När en vektor ritas ska både dess referenser, minnesceller och de lagrade uppgifterna finnas med. 
     Det ska framgå vad de enskilda referenserna heter. När en variabel ritas ska den data som lagras och variabelns namn finnas med.
     
4. Vilken strategi använder man för att bestämma den minsta temperaturen? 
     Illustrera denna strategi: rita en serie bilder som visar hur man kommer fram till den minsta temperaturen.
-----------------------------------------------------------------------------------------------------------------------  
 */