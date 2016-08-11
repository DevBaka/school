package rechner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;

public class rechner {
	public static void main(String[] args){
		String eingabe = "";
		String zahl = "";
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		while(!eingabe.contains("quit") && !eingabe.contains("exit") && !zahl.contains("quit") && !zahl.contains("exit")){
			try {
				System.out.println("Zahlensystem|stellenwert angeben: ");
				eingabe = console.readLine();
				System.out.println("Zahl angeben: ");
				zahl = console.readLine();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Ergebnis: " +  rechner(Integer.parseInt(eingabe), Integer.parseInt(zahl)));
			
		}
		
	}
	
	public static String rechner(int zahlensystem, int zahl){
		
		long ergebnis = zahl;
		long ergebnis2 = 0;
		boolean done = false;
		String endsumme = "";
		
		while(done == false){
			ergebnis2 = ergebnis % zahlensystem;
			ergebnis = ergebnis / zahlensystem;
			endsumme = endsumme + ergebnis2;
			
			if(ergebnis / zahlensystem == 0.0){
				ergebnis2 = ergebnis % zahlensystem;
				endsumme = endsumme + ergebnis2;
				done = true;
			}
			
		}
		return stringdreher(endsumme);
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
