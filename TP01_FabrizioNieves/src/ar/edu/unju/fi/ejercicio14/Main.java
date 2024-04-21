package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		do {
			System.out.print("Ingresar un numero entero dentro de este rango [3, 10]: ");
			numero = scanner.nextInt();
			if( numero < 3 || numero > 10 ) {
			System.out.println("numero fuera del rango, ingresar de nuevo el numero");
										}
			}
		while(numero <= 2 || numero >= 11);
	int[] array = new int[numero];
	System.out.println("Ingresar numeros para el array de " +numero+ " posiciones: ");
	for(int i = 0; i < numero; i++)
		{
		array[i] = scanner.nextInt();
		}
	int suma = 0;
	for(int i = 0; i < numero; i++)
		{
		suma += array[i];
		}
		System.out.print("valores del array: \n");
	for(int i=0; i<numero; i++)
		{
		System.out.println("Posicion: " +i +"     Valor: "+array[i]);
		}
		System.out.print("La suma de los valores del array es: "+suma);
	}

}