
public class Ejercicio01 {

	public static void main(String[] args) {
		//Ingresaremos los datos
		int[] Matriz = {1,2,3,4,5,6};
		Imprimir(Matriz);
		System.out.println("Matriz volteada: ");
		Imprimir(Revertir(Matriz));
	}
	//Este metodo se encargara de revertir la matriz
	public static int[] Revertir(int[] a) {
		int[] volteada = new int[a.length];
		int c=0;
		for(int i=a.length-1;i>=0.;i--) {
			volteada[c]=a[i];
			c++;
		}
		return volteada;
	}
	// Este metodo nos servira para imprimir las matrices
	public static void Imprimir(int[] a) {
		System.out.print("A = [ ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println("");
	}

}
