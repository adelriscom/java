package ejercicios_Propuestos;

import java.util.*;

public class Mostrar_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		
		int x = num.nextInt();
		System.out.println("El numero ingresado es: " + x);
		
		for(int i=1; i<=x; i++) {
			
			System.out.print(" "+ i +" ");
			
			
		}

	}

}
