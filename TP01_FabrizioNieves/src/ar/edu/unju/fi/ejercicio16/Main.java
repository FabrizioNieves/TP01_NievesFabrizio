package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
    for (int i = 0; i < nombres.length; i++) {
        System.out.println("Ingresar nombre de la persona " + (i + 1) + ":");
        nombres[i] = scanner.nextLine();
        }

    int i = 0;
    while (i < nombres.length)	{
            System.out.println("Nombre " + (i + 1) + ": " + nombres[i]);
            i++;
        						}
        System.out.println("Tamaño del array : " + nombres.length);
     byte indiceEliminar;
      do{
    	  System.out.println("Ingresar indice del elemento a eliminar (0-" + (nombres.length - 1) + "):");
    	  indiceEliminar = scanner.nextByte();
        } 
      while (indiceEliminar < 0 || indiceEliminar >= nombres.length);
        if (indiceEliminar < nombres.length - 1)	{
            System.arraycopy(nombres, indiceEliminar + 1, nombres, indiceEliminar, nombres.length - indiceEliminar - 1);
        											}
        nombres[nombres.length - 1] = "";
        i = 0;
       while (i < nombres.length) {
            System.out.println("Nombre " + (i + 1) + ": " + nombres[i]);
            i++;
        }
	}

}