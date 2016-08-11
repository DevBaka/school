package rechner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;

public class rechner {
	public static void main(String[] args){
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
			System.out.println("Ergebnis: " +  rechner(Integer.parseInt(ozahlensystem), Integer.parseInt(zahl), Integer.parseInt(izahlensystem)));
			
		}
		
	}
	
	public static String rechner(int ozahlensystem, int zahl, int izahlensystem){
		
		String endergebnis = "";
		//dez in binär
		if(ozahlensystem == 2 && izahlensystem == 10){
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
			endergebnis =  stringdreher(endsumme);
		}
		
		//binär in dez
		if(ozahlensystem == 10 && izahlensystem == 2){
			String istring = Integer.toString(izahlensystem);
			int zähler = 1;
			int ergebnis = 0;
			for(int i=istring.length() - 1; i >= 0; i = i -1){
				zähler = zähler * 2;
				char sposition = istring.charAt(i);
				ergebnis = ergebnis + ((int)sposition * zähler);
			}
			endergebnis = Integer.toString(ergebnis);
		}
		
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
