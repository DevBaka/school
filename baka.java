import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;

/*
 * Zahlensysteme konvertieren.
 * Benutzer soll angeben, welches Zahlensystem (2,8,10,15 etc...)
 * Benutzer soll Zahl angeben
 * Benutzer soll Zahl im anderen Zahlensystem zurückerhalten
 */


public class baka{
	public static void main(String[] args){
		String eingabe = "";
		String zahl = "";
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		while(!eingabe.contains("quit")){
			try {
				System.out.println("Zahlensystem|stellenwert angeben: ");
				eingabe = console.readLine();
				zahl = console.readLine()
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rechner(eingabe, zahl);
		}
		
	}
	
	public static void rechner(String zahlensystem, String zahl){
		System.out.println(zahlensystem):
		for(int i=0; i < zahl.length(); i++){
			
		}
		
	}
}
