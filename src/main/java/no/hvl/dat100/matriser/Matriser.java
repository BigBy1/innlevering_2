
//jeg har satt inn print på hver oppgave for å se selv hva som skrives ut


package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		System.out.print("\nOppgave a) \n");
		
		String MatriseS = "";
		
		for (int i = 0; i<matrise.length; i++) {
			for (int l = 0; l<matrise[0].length; l++) {
				String s = Integer.toString(matrise[i][l]);
				MatriseS = MatriseS +s+" ";
			}
			MatriseS = MatriseS+("\n");
			System.out.print(MatriseS);
	}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		System.out.print("Oppgave b) \n");

		String s = "";
		
		for (int k=0; k<matrise.length; k++) {
			for (int l=0; l<matrise[k].length; l++) {
				s = s+Integer.toString(matrise[k][l])+ " ";
			}
			s= s + "\n";
			System.out.print(s);
		}
		
		
		return s;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [] [] grunn = matrise;
		
		int [] [] gange = new int[matrise.length][matrise[0].length] ;
		
		System.out.print("\nOppgave c) \n");
		
		//ganger med grunn tabellen og gir gange tabellen de nye verdiene
		for (int i = 0; i<gange.length; i++) {
			for (int l = 0; l<gange[i].length; l++) {
				gange[i] [l] = grunn[i][l]*tall;
			}
			
		}
		
		//Skriver ut grunn tabellen
		System.out.print("Grunn tabellen \n");
		for (int i = 0; i<grunn.length; i++) {
			for (int l = 0; l<grunn[i].length; l++) {
				System.out.print(grunn[i][l]+", ");
			}
			
		System.out.print("\n");
		}
		
		//skriver ut gange tabellen
		System.out.print("Gange tabellen når vi ganger det med "+tall+"\n");
		for (int i = 0; i<gange.length; i++) {
			for (int l = 0; l<gange[i].length; l++) {
				System.out.print(gange[i][l]+", ");
			}
		System.out.print("\n");
		}
		
		return gange;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		boolean erLik = false;
		if (a.length==b.length) {
			erLik=true;
		}
		else {
			erLik=false;
			
			System.out.print("\nOppgave d) \nEr tabellene like? "+erLik+"\n");
			return erLik;
		}
		for (int i = 0; i<a.length; i++) {
			for (int l = 0; l<a[0].length; l++) {
				if(a[i][l]==b[i][l]) {
					erLik =true;
				}
				else {
					erLik = false;
				}
			}
		}
		
		
		
		System.out.print("\nOppgave d) \nEr tabellene like? "+erLik+"\n");
		
		return erLik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
