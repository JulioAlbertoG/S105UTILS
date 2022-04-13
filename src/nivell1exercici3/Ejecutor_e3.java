package nivell1exercici3;

import java.util.*;

public class Ejecutor_e3 {

	public static void main(String[] args) {
	try {
			ArrayList<String> contingut = new ArrayList<String>();
			
			contingut=Llistar3.fer("/Users/julio/Desktop");
			
			Llistar3.escriureFitxer("/Users/julio/Desktop", "prova.txt", contingut);
			
		}catch(NullPointerException npe){
			
			System.err.println("L'element especificat no existeix");
			
		}catch(Exception e) {
			
			System.err.println("Hi ha un problema al programa");
			
		}

	}

}
