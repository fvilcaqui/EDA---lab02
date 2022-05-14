import java.util.*;
public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Ingresaremos la cantidad de veces que desea que se mueva
		System.out.println("Cantidad de veces que desea que se mueva para la izquierda:");
		int mov = sc.nextInt();
		int[] matriz = {1,2,3,4,5};
		Imprimir(matriz);
		System.out.println("Matriz rotada " + mov + " veces a la izquierda");
        Imprimir(RotarIzquierdaArray(matriz,mov));
	}
	//Este metodo nos servira para girar a la Izquierda
	public static int[] RotarIzquierdaArray(int[] a,int b) {
		int[] nueva=new int[a.length];
		int c= 0;
		for(int i=b;i<a.length;i++) {
			nueva[c] = a[i];
			c++;
		}
		for(int j=a.length-b;j<a.length;j++) {
			nueva[c] = a[j];
			c++;
		}
		return nueva; 
	}
	
	//Ingresaremos un metodo para imprimir las matricez
	public static void Imprimir(int[] a) {
		System.out.print("A = [ ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println("");
	}
}
