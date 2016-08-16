package rechner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;

public class rechner {
	public static void main(){
		String ozahlensystem = "";
		String izahlensystem = "";
		String zahl = "";
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		while(!ozahlensystem.contains("quit") && !ozahlensystem.contains("exit") && !zahl.contains("quit") && !zahl.contains("exit") && !izahlensystem.contains("quit") && !izahlensystem.contains("exit")){
			try {
				System.out.println("Welches Zahlensystem soll ausgegeben werden? ");
				ozahlensystem = console.readLine();
				System.out.println("Welches Zahlensystem wurde eingegeben? ");
				izahlensystem = console.readLine();
				System.out.println("Zahl angeben: ");
				zahl = console.readLine();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Ergebnis: " +  init(Integer.parseInt(ozahlensystem), Integer.parseInt(zahl), Integer.parseInt(izahlensystem)));
			
		}
	}
	public static String init(int ozahlensystem1, int zahl1, int izahlensystem1){
		if(ozahlensystem1 == 2 && izahlensystem1 == 10){
			return dezRechner(ozahlensystem1, zahl1, izahlensystem1);
		}
		if(ozahlensystem1 == 10 && izahlensystem1 == 2){
			return binRechner(ozahlensystem1, zahl1, izahlensystem1);
		}
		if(ozahlensystem1 <= izahlensystem1){
			
		}
		if(izahlensystem1 >= ozahlensystem1){
			
		}
		
		/*
		 * 
		 * if(ozahlensystem == 2 && izahlensystem == 10){
			long ergebnis = zahl;
			long ergebnis2 = 0;
			boolean done = false;
			String endsumme = "";
			
			while(done == false){
				ergebnis2 = ergebnis % ozahlensystem;
				ergebnis = ergebnis / ozahlensystem;
				endsumme = endsumme + ergebnis2;
				
				if(ergebnis / ozahlensystem == 0.0){
					ergebnis2 = ergebnis % ozahlensystem;
					endsumme = endsumme + ergebnis2;
					done = true;
				}
				
			}
endergebnis = stringdreher(endsumme);
		 */
		
		return "error";
	}
	
	
	
	public static String dezRechner (int ozahlensystem1, int zahl1, int izahlensystem){
		String endergebnis = "";
		String istring = Integer.toString(zahl1);
		//String istring = stringdreher(inputstring);
		int zähler = 1;
		int ergebnis = 0;
		System.out.println("the string " + istring);
		for(int i=istring.length() - 1; i >= 0; i = i -1){
			
			//char sposition = istring.charAt(i);
			int x = Character.getNumericValue(istring.charAt(i));
			System.out.println(x);
			ergebnis = ergebnis + (x * zähler);
			zähler = zähler * 2;
		}
		endergebnis = Integer.toString(ergebnis);
		return endergebnis;
	}
		
	public static String binRechner(int ozahlensystem1, int zahl1, int izahlensystem1){
		long ozahlensystem = ozahlensystem1;
		long izahlensystem = izahlensystem1;
		long zahl = zahl1;
		long ergebnis = 0;
		String endergebnis = "";
		String endsumme = "";
		boolean done = false;
		
		while(done == false){
			ergebnis = zahl % ozahlensystem;
			zahl = zahl / ozahlensystem;
			endsumme = endsumme + ergebnis;
			if(ergebnis / ozahlensystem == 0.0){
				zahl = ergebnis % ozahlensystem;
				endsumme = endsumme + ergebnis;
				done = true;
			}	
		}
		endergebnis = stringdreher(endsumme);
		
	
		return endergebnis;
	}
	
	public static String stringdreher(String s){
		String endergebnis = "";
		for(int i=s.length() -1; i >= 0; i = i - 1){
			char sposition = s.charAt(i);
			endergebnis = endergebnis + sposition;
		}
		return endergebnis;
}
}
