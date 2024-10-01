
//jeg har satt inn print på hver oppgave for å se selv hva som skrives ut

package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabellS) {

		String su = "";

		for (int i = 0; i < tabellS.length; i++) {
			su = su + Integer.toString(tabellS[i]) + ", ";
		}

		System.out.print("Oppgave a)" + "\n" + su + "\n");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String s = "[";
		

		for (int i = 0; i < tabell.length; i++) {

			int tall = tabell[i];

			if (i == 0) {
				s = s + tall+",";
				
			} else if (i < tabell.length - 1) {
				s = s + tall+",";
			} else {
				s = s + tall;
			}
		}
		s = s+"]";
		if (tabell.length==1) {
			s ="["+tabell[0]+"]";
		}
		
		System.out.println("Oppgave b)" + "\n" + "Tallene er: " + s);
		return s;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {

			sum = sum + tabell[i];
		}

		System.out.println("\n" + "Oppgave c) \n" + sum + "\n");
		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean sant = false;
		System.out.print("Oppgave d) \n");

		for (int i = 0; i < tabell.length; i++) {

			if (tabell[i] == tall) {
				sant = true;
			}

		}
		System.out.print("Eksisterer " + tall + "? " + sant + "\n");

		return sant;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int posisjon = -1;
		int g = 0;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall&& g==0) {
				posisjon = i;
				g=1;
			}

		}
		if (posisjon == -1) {
			System.out.print(
					"\n Oppgave e) \n" + posisjon + " Det betyr at " + tall + " ikke " + "eksisterer i tabellen\n \n");
		} else {
			System.out.print("\n Oppgave e) \n" + tall + " ligger i plass nummer " + posisjon + " i tabellen\n \n");
		}

		return posisjon;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int TabellR[] = new int[tabell.length];

		int r = tabell.length;

		System.out.print("Oppgave f) \n");

		for (int i = 0; i < r; i++) {
			TabellR[i] = tabell[r - i - 1];

			System.out.print(TabellR[i] + ", ");
		}
		System.out.print("\n");

		return TabellR;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean erStigende = false;
		int tall = 0;
		int g = 0;

		for (int i = 0; i < tabell.length; i++) {

			if (tabell[i] > 0 && g==0) {
				if (i==0) {
				 tall = tabell[i];
				}
				else {
					tall = tabell[i-1];
				}
				
				g=1;
			}
			
			if (tabell[i] > 0 && tabell[i] >= tall) {
				erStigende = true;
				g=0;
			} else {
				erStigende = false;
			}

		}
		if (tabell.length == 0) {
			erStigende = true;
		}

		System.out.print("\n Oppgave g) \n er tabellen sortert stigende? \n" + erStigende);
		return erStigende;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int lengde1 = tabell1.length;
		int lengde2 = tabell2.length;

		System.out.print("Oppgave h) \n");

		int tabell1x2[] = new int[lengde1 + lengde2];

		for (int i = 0; i < tabell1x2.length; i++) {
			if (i < lengde1) {
				tabell1x2[i] = tabell1[i];
			} else {
				tabell1x2[i] = tabell2[i - lengde1];
			}
		}

		System.out.print("Når du legger sammen tabellene får du tabellen: \n");
		for (int i = 0; i < tabell1x2.length; i++) {
			System.out.print(tabell1x2[i]);
		}
		System.out.print("\n");
		return tabell1x2;

	}

}