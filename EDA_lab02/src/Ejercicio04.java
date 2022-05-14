import java.util.*;
public class Ejercicio04 {
	public static void main(String[] args) {
		//Ingresaremos los datos
		ArrayList<String> alumnos = new ArrayList<String>();
		ArrayList<Integer> notas = new ArrayList<Integer>();
		ArrayList<String> animal = new ArrayList<String>();
		alumnos.add("Aguado López, Mayra");
		alumnos.add("Alberola Robles, Rafael");
		alumnos.add("Alcusón Marco, Guillermo");
		alumnos.add("Alonso López, Francisca ");
		alumnos.add("Álvaro Martínez-Carrasco, Juan");
		alumnos.add("Apariecido dos Santos, Jaime ");
		alumnos.add("Arias Brenes, Guido");
		alumnos.add("Bariain Carrasco, Nekane");
		alumnos.add("Barriobero Olarte, Jorge");
		notas.add(0);
		notas.add(1); 
		notas.add(2); 
		notas.add(3); 
		notas.add(4); 
		notas.add(5); 
		notas.add(6); 
		notas.add(7); 
		notas.add(8); 
		notas.add(9); 
		//Metodo add
		alumnos.add(2,"Frank's Vilca Quispe");
		//Metodo clear
		notas.clear();
	}
	

}
