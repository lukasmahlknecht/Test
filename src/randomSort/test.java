package randomSort;

import java.util.ArrayList;

public class test {
	
			public static void main(String[] args){
				
				ArrayList<Integer> randomzahlen = new ArrayList<Integer>();
				
				
				for(int i = 0; i < 10; i++){
					int rnd;
	
					rnd = (int)(Math.random()*100);   				  				// es werden Zahlen zwischen 0 und 100 erstellt
				
					randomzahlen.add(rnd);											// hier der random zahlen arraylist hinzugefügt
				}
				System.out.println("Ausgabe von 10 Zufallszahlen:");
				System.out.println(randomzahlen);
				
				System.out.println("\nAusgabe der sortierten Zahlen:");
				System.out.println(Sortieren(randomzahlen));
				
			}
			
			public static ArrayList<Integer> Sortieren(ArrayList<Integer> random){
				
				ArrayList<Integer> sortiertezahlen = new ArrayList<Integer>();
				
				for(int s = 0; s < 101; s++){        								// es wird jede einzelne Zahl in randomzahlen nacheinander überprüft ob diese 0, 1, 2, ..100 hat
					for(int i = 0; i < 10; i++){
						if(random.get(i) == s){
							sortiertezahlen.add(random.get(i));						// die zahl wird der arraylist sortiertezahlen an der unterst möglichen stelle hinzugefügt
						}															//  = Sortierung der Größe nach															
					}
				}
				return sortiertezahlen;	
			}
}
