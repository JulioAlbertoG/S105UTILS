package nivell1exercici2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Llistar2 {

	public static void fer(String ruta) {
		File dir = new File(ruta);
		List<String> ordenat = new ArrayList<String>();
		String[] fitxers = dir.list();
	
	
		ordenat.addAll(Arrays.asList(fitxers));
		
		Collections.sort(ordenat);
	
		for(String paraula: ordenat) {
		
	
			File dirOrFit = new File(dir,paraula);
			
			Date data = new Date( dirOrFit.lastModified());
			
			if(dirOrFit.isDirectory()) {
				
				System.out.println(" D ");
				System.out.println (paraula);
				System.out.println(" Ultima modificació " + data);
				fer(dirOrFit.getAbsolutePath());
	
				
			}else if(dirOrFit.isFile()) {
				
				System.out.println(" F ");
				System.out.println (paraula);
				System.out.println(" Ultima modificació " + data);
				
			}
		
		
		}
	}
}