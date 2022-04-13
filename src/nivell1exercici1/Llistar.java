package nivell1exercici1;

import java.io.File;
import java.util.*;

public class Llistar {
	
	//private static Path path = FileSystems.getDefault().getPath("/Users/.../Desktop/...");
	
	public static void fer(String ruta) {
		File dir = new File(ruta);
		String[] fitxers = dir.list();
		List<String> ordenat = new ArrayList<String>();
		
		
			ordenat.addAll(Arrays.asList(fitxers));
			/*
			 * Aquí tengo una duda CÓMO HAGO QUE IGNORE MAYÚSCULAS
			 */
			Collections.sort(ordenat);
		
			for(String paraula: ordenat) {
				System.out.println(paraula);
			}
			
		
		
	}
}
