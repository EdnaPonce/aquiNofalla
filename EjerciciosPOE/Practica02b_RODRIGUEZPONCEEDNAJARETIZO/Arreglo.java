package EjerciciosPOE.Practica02b_RODRIGUEZPONCEEDNAJARETIZO;
import java.util.Scanner;
public class Arreglo {
 
	static double[] arreglo;
 
	public static void main(String[] args) {
		arreglo = new double[10];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = i;
			System.out.print(arreglo[i] +"  ");
		}
		System.out.println( arreglo.length );
 
		System.out.print("\nElija una posicion a eliminar  ");
		Scanner teclado = new Scanner(System.in);
		int pos = teclado.nextInt();
		teclado.close();
		//Eliminamos posicion
		eliminarPosicion(pos);
 
		System.out.println("\nAhora el arreglo tiene " + arreglo.length + " posiciones.");
		for (int i = 0; i < arreglo.length; i++)
			System.out.print(arreglo[i] +"  ");
	}
	static void eliminarPosicion(int pos) {
 
		double[] temp = new double[arreglo.length - 1];
		int indTemp = 0, indArreglo = 0;
		while (indTemp < temp.length && indArreglo < arreglo.length) {
			if (indArreglo == pos) //Esta posicion NO la copiamos, la saltamos.
				indArreglo++; //Para saltarla, solo aumenta el indice del arreglo principal
			else {
				temp[indTemp] = arreglo[indArreglo];

				indTemp++;
				indArreglo++;
			}
		}
		arreglo = temp;
	}
 
}
