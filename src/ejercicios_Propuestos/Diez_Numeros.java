package ejercicios_Propuestos;

import java.util.*;

public class Diez_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[10];
		int i, j, k, z;

		Scanner numeros = new Scanner(System.in);

		for(i=0; i<10; i++) {

			System.out.println("Por favor ingrese el numero: " + i);
			a[i] = numeros.nextInt();
		}
		
		System.out.println(" ");
		
		for(int vector:a) {
			System.out.print(vector + " ");
		}
		
		System.out.println(" ");
		
		i=0;
		j=0;
		k=0;
		z=0;
		
		while(z<10) {
						
			if(a[i] < a[i+1]) {

				//System.out.println("Los numeros estan en orden creciente");
				j++;
			}
			if(a[i] > a[i+1]){
				//System.out.println("Los numeros estan en orden decreciente");
				k++;
			}
			
			z++;
		}
			if(k==10 && j==0){
				
				System.out.println("Los numeros estan en orden decreciente");
				
				
			}
			else if(k==0 && j==10){
				
				System.out.println("Los numeros estan en orden creciente");
				
				
			}
			else {
				System.out.println("Los numeros no estan en orden");
			}
													
	}

}
