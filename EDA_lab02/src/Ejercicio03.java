import java.util.*;
public class Ejercicio03 {

	public static void main(String[] args) {
		//Ingresar el tamaño del triangulo
		Scanner sc=new Scanner(System.in);
		System.out.println("De que tamaño desea el triangulo: ");
		int tam = sc.nextInt();
		Triangulo(tam);
 
	}
	//Este metodo me servira para imprimir el triangulo
	public static void Triangulo(int a) {
		int b=1;
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print("*");
			}
			b++;
			System.out.println("");
		}
	}

}
