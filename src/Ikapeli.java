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
		
	    else if (ika >= 18 && ika < 65) //Aikuiset
	    {
	        if (ika == 18) //Tehtävä 2:
	        	{System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa.");} 
	        
	        else if (ika % 10 == 0) //Tehtävä 3:
	        	{System.out.println("Onnittelut tasavuosikymmenestä!");}
	        
	        else if (ika >= 40 && ika < 50) 
	        	{System.out.println("Toivotan parasta keski-ikää!");} 
	        
	        else if (ika > 58) //Tehtävä 5:
	        {System.out.println("Voit mennä varhaiseläkkeelle.");}
	        
	        else 
	        	{System.out.println("Olet aikuinen");}
	    } 
		
	    else if (ika >= 65) //Eläkeläiset
	    {
	        if (ika == 65) 
	        { System.out.println("Hyviä eläkepäiviä!");}

	        
	        else if (ika == 100) //Tehtävä 4:
	        {System.out.println("Onnittelut 100-vuotiaalle!");
	         System.out.println("Onnea!");
	         System.out.println("Onnea!");}
	        
	        else if (ika % 10 == 0) //Tehtävä 3:
        	{System.out.println("Onnittelut tasavuosikymmenestä!");}
	        
	        else {System.out.println("Olet eläkeläinen");}
	        
	    } 
	}

}
