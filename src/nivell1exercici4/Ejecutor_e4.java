package nivell1exercici4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejecutor_e4 {
	static FileReader entrada;
	public static void main(String[] args) {
		
		try {
			entrada = new FileReader("/Users/.../Desktop/...txt");
			
			BufferedReader miBuff = new BufferedReader(entrada);
			
			String linea="";
			
			while(linea!=null) {
				
				
				linea=miBuff.readLine();
				
				if(linea!=null) {
				System.out.println(linea);
				}
			}
			
		}catch(IOException exRead) {
			System.out.println("No s'ha trobat el fitxer");
		}finally {
			try {
				entrada.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
