package ejercicios_Propuestos;

import java.util.*;

public class Numero_Mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		int num1 = numero.nextInt();
		
		System.out.print("Ingrese otro numero: ");
		int num2 = numero.nextInt();
		
		if(num1>num2) {
			
			System.out.println(num1 + " es mayor "+ " a " + num2);
		}
		else {
			System.out.println(num2 + " es mayor que " + num1);
		}
	}

}
