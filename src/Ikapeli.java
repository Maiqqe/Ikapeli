	import java.util.Scanner;
public class Ikapeli {


	public static void main(String[] args) {
		/* 
Tehtävä 1: Laajenna ohjelmaa siten, että ohjelma osaa kertoa 16-17-vuotiaille, että he voivat ajaa kevaria.
Tehtävä 2: Laajenna ohjelmaa niin, että se kertoo 18-vuotiaalle, että hän on juuri tullut täysi-ikäiseksi ja saa ajaa autoa. 
Tehtävä 3: Laajenna tehtävää niin, että aikuisille ilmoitetaan tasavuosikymmenistä onnentoivotus. 
Tehtävä 4: jos ikä on 100, tulosta 3-rivinen onnentoivotus. 
Tehtävä 5: Tarkenna eläkeasioita siten, että yli 58-vuotiaille kerro, että he voivat mennä varhaiseläkkeelle. 
Tehtävä 6: Toivota 65-vuotiaille hyviä eläkepäiviä.

Tehtävä 7: 40–50 -vuotiaille toivota parasta keski-ikää.*/
Scanner in = new Scanner(System.in);
		
		int ika = 0;
		
		System.out.println("Kirjoita ikäsi numeroina");
		ika = in.nextInt();


		if (ika > 0 && ika < 18) //Alaikäiset
			{
				if (ika > 0 && ika <15)
				{System.out.println("Olet alaikäinen.");}
				
				if (ika == 15) //alaikäiset mopoilijat
				{ System.out.println("Saat ajaa mopoa."); }
				
				if (ika >= 16)  //Tehtävä 1: alaikäiset mopoilijat ja kevarikuskit 
				{System.out.println("Saat ajaa kevaria."); }
			}
	}

}
