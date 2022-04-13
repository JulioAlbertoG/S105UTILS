package nivell1exercici2;



public class Ejecutor_e2 {

	public static void main(String[] args) {
		
		try {
			
			Llistar2.fer("/Users/.../Desktop/...");
		}catch(NullPointerException npe){
			System.err.println("L'element especificat no existeix");
		}catch(Exception e) {
			System.err.println("No existeix aquest arxiu");
		}

	}


}
