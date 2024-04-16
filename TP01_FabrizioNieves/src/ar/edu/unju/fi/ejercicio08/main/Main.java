package ar.edu.unju.fi.ejercicio08.main;

import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        CalculadoraEspecial calculadora = new CalculadoraEspecial();
        calculadora.setN(n);

        System.out.printf("Sumatoria : %.2f%n", calculadora.calcularSumatoria());
        System.out.printf("La productoria es: %.2f%n", calculadora.calcularProductoria());
	}

}