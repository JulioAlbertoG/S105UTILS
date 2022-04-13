package nivell1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Llistar3 {

	public static ArrayList<String> fer(String ruta) {
		File dir = new File(ruta);
		List<String> ordenat = new ArrayList<String>();
		String[] fitxers = dir.list();
		ArrayList<String> novaLlista = new ArrayList<String>();
	
	
		ordenat.addAll(Arrays.asList(fitxers));
		
		Collections.sort(ordenat);
	
		for(String paraula: ordenat) {
		
	
			File dirOrFit = new File(dir,paraula);
			
			Date data = new Date( dirOrFit.lastModified());
			
			if(dirOrFit.isDirectory()) {
				
				novaLlista.add("D \n" + paraula + "\n" + "Última modificació "+ data + "\n");
				/*
				System.out.println(" D ");
				System.out.println (paraula);
				System.out.println(" Ultima modificació " + data);
				*/
				fer(dirOrFit.getAbsolutePath());
	
				
			}else if(dirOrFit.isFile()) {
				
				novaLlista.add("F \n" + paraula + "\n" + "Última modificació "+ data + "\n");
				/*
				System.out.println(" F ");
				System.out.println (paraula);
				System.out.println(" Ultima modificació " + data);
				*/
			}
		
		}
		
		return novaLlista;
		
	}
	
	public static void crearFitxer(String ruta, String nomFitxer) {
		
		File nouFitxer = new File(ruta,nomFitxer);
		
		try {
			nouFitxer.createNewFile();
			
			System.out.println("S'ha creat un nou fitxer");
			
		}
		catch(FileAlreadyExistsException fae) {
			
			System.err.println("El fitxer ja existeix");
			
		}
		catch(IOException io) {
			System.err.println("Hem tingut problemes amb els permissos per crear el fitxer");
		}
	}
	
	public static void escriureFitxer(String ruta, String nomFitxer, ArrayList<String> contingut) {
		
		FileWriter fw;
		BufferedWriter bw;
		crearFitxer(ruta,nomFitxer);
		
		

		try {
			fw = new FileWriter(ruta + nomFitxer, true);
			
			bw = new BufferedWriter(fw);	
			
			
			for(String line: contingut) 
			{
				
				bw.write(line);
				
				bw.newLine();
			}
		
			bw.close();
			
			fw.close();
		
			
		}
	
	
		catch(IOException io) {
			System.err.println("Hem tingut problemes amb els permissos per escriure");
		
		}
		
	}
}
