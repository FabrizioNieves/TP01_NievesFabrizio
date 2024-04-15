package ar.edu.unju.fi.ejercicio05;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int numero = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingresar un número entero entre 1 y 9:");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero >= 1 && numero <= 9) {
                    break;
                } else {
                    System.out.println("Número fuera de rango, ingrese nuevamente el valor:");
                }
            } else {
                System.out.println("Dato incorrecto, ingresar un número entero:");
                scanner.next(); 
            }
        }
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();

	}

}
