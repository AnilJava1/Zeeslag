package ZeeSlag;

import java.util.Scanner;

public class ZeeSlag {


	public static void main(String[] args) {
		System.out.println("Kies een waarde voor plek 1. 0 betekent dat er geen boot staat; 1 betekent dat er een boot staat.");					
		Scanner scanner = new Scanner(System.in);							
		String antwoord = scanner.nextLine();
		
		System.out.println("Kies een waarde voor plek 2. 0 betekent dat er geen boot staat; 1 betekent dat er een boot staat.");
		Scanner scanner1 = new Scanner (System.in);
		String antwoord1 = scanner.nextLine();	
		
		System.out.println("Kies een waarde voor plek 3. 0 betekent dat er geen boot staat; 1 betekent dat er een boot staat.");
		Scanner scanner2 = new Scanner (System.in);
		String antwoord2 = scanner.nextLine();	
		
		System.out.println("Kies een waarde voor plek 4. 0 betekent dat er geen boot staat; 1 betekent dat er een boot staat.");
		Scanner scanner3 = new Scanner (System.in);
		String antwoord3 = scanner.nextLine();	
		
		System.out.println("Kies een waarde voor plek 5. 0 betekent dat er geen boot staat; 1 betekent dat er een boot staat.");
		Scanner scanner4 = new Scanner (System.in);
		String antwoord4 = scanner.nextLine();	
		
		System.out.println("Kies een waarde voor plek 6. 0 betekent dat er geen boot staat; 1 betekent dat er een boot staat.");
		Scanner scanner5 = new Scanner (System.in);
		String antwoord5 = scanner.nextLine();	
		
		
		String zee = "001110";											
	//	System.out.println(zee.charAt(2));
		
		if(zee.charAt(0) == '1') {
			System.out.println(antwoord + " Boem");
		}else {
			System.out.println(antwoord + " Plons");
		
		if(zee.charAt(1) == '1') {
			System.out.println(antwoord1 + " Boem");
		}else {
			System.out.println(antwoord1 + " Plons");
		}
		
		if (zee.charAt(2) == '1') {
			System.out.println(antwoord2 + " Boem");
		}else {
			System.out.println(antwoord2 + " Plons");
		}
		
		if (zee.charAt(3) == '1') {
			System.out.println(antwoord3 + " Boem");
		}else {
			System.out.println(antwoord3 + " Plons");
		}
		
		if (zee.charAt(4) == '1') {
			System.out.println(antwoord4 + " Boem");
		}else {
			System.out.println(antwoord4 + " Plons");
		}
		
		if (zee.charAt(5) == '1') {
			System.out.println(antwoord5 + " Boem");
		}else {
			System.out.println(antwoord5 + " Plons");
		}
		
			
		/*boolean doorgaan = true;
		while (doorgaan) {
			String antwoord1 = scanner.nextLine();
			if (antwoord1.equals("Stop"));{
				doorgaan = false;
				}
			}
		*/
		//System.out.println(antwoord + " Dat is fout.");	
		

	}


	}
}

class boot{
	
}


/*1: Functionele doelstellingen: wat moet er gebeuren
-	Functionele doelstelling 1: Creëer een scanner waar in de console input gegeven kan worden --> Check
-	Funct. doel. 2: Creëer een string met karakters --> Check.
-	Funct. doel. 3: Controle moment: Controleer wat er geprint wordt als er in de console input gegeven word. Check: de tekst die ik heb opgegeven wordt geprint.
					Althans, de code werkt, de if en else statements werken. 0=plons, 1= boem. Hetgeen wat geprint wordt klopt voor de 'string'. 
-	Funct. doel. 4: Zorg dat er 6x input gegeven kan worden in de console. Check.
- 	Funct. doel. 5: Zorg dat het ingegeven antwoord terug gegeven wordt in de console nadat het 'spel' gegeven is. Dus het gegeven antwoord + het resultaat 
					(Plons of boem). Dit hoeft nog niet gelinkt te zijn, dus 1 kan ook aan plons gelinkt zijn en 0 aan boem. Check.
- 	Funct. doel. 6: link de gegeven antwoorden aan de string... In andere woorden, zorg ervoor 


-	Creëer een mogelijkheid om te controleren of de input die in de console gegeven is, correct is.

 * 
 * 
 * 
 */
