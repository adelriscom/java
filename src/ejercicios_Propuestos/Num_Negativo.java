package ejercicios_Propuestos;

import java.util.*;

public class Num_Negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, y=0;
		Scanner num = new Scanner(System.in);
		
		
		for(i=1; i<=10; i++) {
			
			System.out.println("Ingrese el numero: " + i);
			int numeros = num.nextInt();
			
			if(numeros < 0) {
				y++;
			}
			
		}
		System.out.println("Ud. ha introducido " + y + " numeros negativos");

	}

}
