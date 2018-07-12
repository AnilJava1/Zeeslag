package ZeeSlag;

import java.util.Scanner;

public class ZeeSlag {


	public static void main(String[] args) {
		System.out.println("Welkom bij zeeslag. Je krijgt 6 beurten om te raden waar mijn boten staan. Zes beurten omdat er 6 plekken zijn waar een boot zou kunnen staan.");
		System.out.println("Je kan hieronder dus 6x een antwoord ingeven maar na de 6e keer stopt het spel automatisch.");
		System.out.println("Als je op enter drukt begint het spel. Veel succes en plezier. \n");
		Scanner scanner0 = new Scanner(System.in);
		String antwoord0 = scanner0.nextLine();
		
		
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
		
		
		String zee = "001110";								//de string is gelinkt aan de if en else hieronder. Deze wijzigen ook als er geprint wordt.
															// maar.... als ik nu de eerste 0 in de 1 verander op regel, 41 vervolgens play, dan zie ik aan het einde
		if(zee.charAt(0) == '1') {							// alleen het eerste antwoord maar niet meer alle antwoorden. Waarom gaat het niet door? 
			System.out.println(antwoord + " Boem");			// Als ik 'nu' (zonder het te veranderen) 6x 0 ingeef in de console, gaat het spel door... 
		}else {												// Waarom niet als ik een 1 ingeef?
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
- 	Funct. doel. 6: link de gegeven antwoorden aan de string... In andere woorden, zorg ervoor dat wanneer de speler voor plek 1 een 0 ingeeft, en het een 0 is, er 
als resultaat: 'plons', komt te staan. Maar wanneer diegene een 1 ingeeft en het is een 1, dan moet er 'boem' komen te staan.


-	Creëer een mogelijkheid om te controleren of de input die in de console gegeven is, correct is.

 * 
 * 
 * 
 */
