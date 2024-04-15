package ar.edu.unju.fi.ejercicio03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int numero = 0;   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un número entero:");

        if (scanner.hasNextInt()) {           
            numero = scanner.nextInt();          
            if (numero % 2 != 0) {               
                int resultado = numero * 2;
                System.out.println("Número impar: " + resultado);
            } else {               
                int resultado = numero * 3;
                System.out.println("Número par:" + resultado);
            }
        } else {
            
            System.out.println("El dato ingresado es incorrecto, ingrese un número entero.");
        }        
        scanner.close();

	}

}
