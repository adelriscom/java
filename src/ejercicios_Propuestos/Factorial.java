package ejercicios_Propuestos;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f = 1; //almacena el factorial
		int i=1; //contador
		
		Scanner num = new Scanner(System.in);//se crea un objeto tipo Scannen num
		System.out.println("Ingrese el numero al que quiera calcular su factorial");
		int x = num.nextInt();// lee el numero ingresado por consola
		
		//System.out.println("En este ejercicio se calculara el factorial del numero: " + x);
		
		while(i <= x) {
			
			System.out.print(" " + i + " " );
			
			f = f*i;
			i++;
			
			//System.out.print(" " + i + " " + "\n");
		}
		
		System.out.println("\n" + "El factorial de " + x + " es: " + f);

	}

}
