package rechner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import static java.lang.Math.toIntExact;

public class rechner {
	public static void main(String[] args){
		String ozahlensystem0 = "";
		String izahlensystem0 = "";
		String zahl = "";
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		while(!ozahlensystem0.contains("quit") && !ozahlensystem0.contains("exit") && !zahl.contains("quit") && !zahl.contains("exit") && !izahlensystem0.contains("quit") && !izahlensystem0.contains("exit")){
			try {
				System.out.println("Welches Zahlensystem soll ausgegeben werden? ");
				ozahlensystem0 = console.readLine();
				System.out.println("Welches Zahlensystem wurde eingegeben? ");
				izahlensystem0 = console.readLine();
				System.out.println("Zahl angeben: ");
				zahl = console.readLine();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int ozahlensystem = Integer.parseInt(ozahlensystem0);
			int izahlensystem = Integer.parseInt(izahlensystem0);
			
			if(ozahlensystem == 10 && izahlensystem == 2){
				System.out.println("Ergebnis: " +  rechner2(ozahlensystem, zahl, izahlensystem));
			}
			
			if(ozahlensystem == 2 && izahlensystem == 10){
				System.out.println("Ergebnis: " +  rechner(ozahlensystem, Integer.parseInt(zahl),izahlensystem));
			}
			if(ozahlensystem < izahlensystem)
			{
				String dezZahl = dezRechner(ozahlensystem, zahl,izahlensystem);
				//System.out.println(dezZahl);
				System.out.println("Ergebnis: " + endRechner(ozahlensystem, Integer.parseInt(dezZahl)));
			}
			if(ozahlensystem > izahlensystem)
			{
				String dezZahl = dezRechner(ozahlensystem, zahl, izahlensystem);
				System.out.println("Ergebnis" + endRechner(ozahlensystem, Integer.parseInt(dezZahl)));
			}
			
			else{
				System.out.println("hello world");
			}
		}
		
	}
	public static String endRechner(long ozahlensystem,long dezZahl)
	{
		
		String endergebnis = "";
		//dez in binär
		long ergebnis = dezZahl;
		long ergebnis2 = 0;
		boolean done = false;
		String endsumme = "";
		
		
		while(done == false){
			ergebnis2 = ergebnis % ozahlensystem;
			ergebnis = ergebnis / ozahlensystem;
			endsumme = endsumme + Converterback(Long.toString(ergebnis2));
			//System.out.println("baka" + Converterback(Long.toString(ergebnis2)));
			if(ergebnis / ozahlensystem == 0.0){
				ergebnis2 = ergebnis % ozahlensystem;
				endsumme = endsumme + Converterback(Long.toString(ergebnis2));
				done = true;
			}
				
			
			endergebnis =  stringdreher(endsumme);
		}
		
		
		
		return endergebnis;
		
	}
	
	public static String Converterback(String z)
	{
		//System.out.println("string: " + z);

		
		switch(z)
		{
		case "10":
			return "A";
		case "11":
			return "B";
		case "12":
			return "C";
		case "13":
			return "D";
		case "14":
			return "E";
		case "15":
			return "F";
		}
		return z;
	}
	
	public static int Converter(char c){
		char convert = c;
		
		switch(convert){
		case 'A':
		case 'a':
			return 10;
		case 'B':
		case 'b':
			return 11;
		case 'C':
		case 'c':
			return 12;
		case 'D':
		case 'd':
			return 13;
		case 'E':
		case 'e':
			return 14;
		case 'F':
		case 'f':
			return 15;
		}
		
		return Character.getNumericValue(convert);
	}
	
	public static String dezRechner(long ozahlensystem, String zahl, long izahlensystem){
		String endergebnis = "";
		long zähler = 1;
		long ergebnis = 0;
		for(int i = zahl.length() - 1; i>= 0; i = i -1)
		{
			int x = Converter(zahl.charAt(i));
			ergebnis = ergebnis + (x*zähler);
			zähler = zähler * izahlensystem;
		}
		endergebnis =  Long.toString(ergebnis);
		return endergebnis;
			
		
		
		
		//return "baka";
	}
	
	public static String rechner2(long ozahlensystem, String zahl, long izahlensystem){
		String endergebnis = "";
		if(ozahlensystem == 10 && izahlensystem == 2){
			//System.out.println("hello world");
			//String istring = Long.toString(zahl);
			String istring = zahl;
			//String istring = stringdreher(inputstring);
			int zähler = 1;
			int ergebnis = 0;
			//System.out.println("the string " + istring);
			for(int i=istring.length() - 1; i >= 0; i = i -1){
				
				//char sposition = istring.charAt(i);
				int x = Character.getNumericValue(istring.charAt(i));
				ergebnis = ergebnis + (x * zähler);
				zähler = zähler * 2;
			}
			endergebnis = Integer.toString(ergebnis);
		}
		System.out.println(endergebnis);
		return "hello world";
	}
	
	public static String rechner(int ozahlensystem, int zahl, int izahlensystem){
		
		String endergebnis = "";
		//dez in binär
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
				
			
			endergebnis =  stringdreher(endsumme);
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
