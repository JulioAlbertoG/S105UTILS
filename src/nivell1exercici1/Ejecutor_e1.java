package nivell1exercici1;

public class Ejecutor_e1 {

	public static void main(String[] args) {
		try {
			Llistar.fer("/Users/.../Desktop/...");
		}catch(NullPointerException npe){
			System.err.println("L'element especificat no existeix");
		}catch(Exception e) {
			System.err.println("Hi ha un error desconegut");
		}

	}

}
