package nivell1exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;


public class Serialización {

	public static void main(String[] args) {
		/*
		 * Serializaré el array de Alumne[]
		 * Primero hay que mirar el tipo de objeto que queremos serializar e ir a la clase
		 * y poner implements serializable.
		 * Lo siguiente será llamar ObjectOutputStream. Como lanza una exception lo metemos en un try catch
		 */
		Alumne[] alumnat= new Alumne[3];
		alumnat[0]=new Alumne("Toni ", 9.4,2008,07,19);
		alumnat[1]=new Alumne("Nil ", 6.6,2008,07,20);
		alumnat[2]=new Alumne("Laila ", 8.9,2008,07,22);
		
		
		try {
			/*
			 * Este es el flujo de datos por el que viajarán los objetos
			 * 
			 */
			ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("/Users/julio/Desktop/alumne.ser"));
			
			/*
			 * Ahora debo escribir el objeto con el método writeObject y con parámetro
			 * del objeto que quiero escribir. después cerramos el flujo.
			 */
			escribiendo_fichero.writeObject(alumnat);
			
			escribiendo_fichero.close();
			
			ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("/Users/julio/Desktop/alumne.ser"));
			/*
			 * Después delObjectInputStream, devuelve un object, por eso deberemos castearlo a array
			 * 
			 */
			Alumne[] alumnat_recuperat = (Alumne[]) recuperando_fichero.readObject();
			
			recuperando_fichero.close();
			/*
			 * Como lo que tengo es un array, debo recorrerlo con un bucle para presentar los datos
			 * del objeto que se he deserializado.
			 */
			for(Alumne a: alumnat_recuperat) {
				System.out.println(a);
			}
		}catch(Exception e) {
			
		}
		
	}
}	
	class Alumne implements Serializable {
		
		private String nombre;
		private double nota;
		private Date fechaExamen;
		
		public Alumne(String n, double s, int agno, int mes, int dia) {
			
			nombre=n;
			
			nota=s;
			
			GregorianCalendar calendario = new GregorianCalendar(agno, mes-1,dia);
			fechaExamen=calendario.getTime();
			
		}
		
		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public double getNota() {
			return nota;
		}



		public void setNota(double nota) {
			this.nota = nota;
		}



		public Date getFechaExamen() {
			return fechaExamen;
		}



		public void setFechaExamen(Date fechaExamen) {
			this.fechaExamen = fechaExamen;
		}



		public String toString() {
			return "Nombre: " + nombre + "Nota: " + nota + "Fecha de examen: " + fechaExamen;
		}
	

}
