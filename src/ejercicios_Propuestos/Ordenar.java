package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, j, i, y;
		int num[] = new int[10]; 
		int n[] = new int[10];
		int pares[], impares[];
		

		for(i=0; i<10; i++) {

			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: " + i));
			num[i] = numero;
		}

		for(int k:num) {
			System.out.print(k);
		}

		System.out.println();
		
		
		j=0;
		y=0;

		for(i=0; i<10; i++) {
			if(num[i]%2==0) {
				n[j]=num[i];
				j++;
			}
			else {
				n[y]=num[i];
				y++;
			}

		}
		
		System.out.println("El valor de j es: " + j);
		System.out.println("El valor de y es: " + y);
		
		
		pares = new int[j];
		impares = new int[y];
		
		j=0;
		y=0;
		
		for(i=0; i<10; i++) {
			if(num[i]%2==0) {
				pares[j]=num[i];
				j++;
			}
			else {
				impares[y]=num[i];
				y++;
			}
		}

		

		System.out.println();

		for(int z:n) {
			System.out.print(z);
		}
		System.out.println();
		for(int vpares:pares) {
			System.out.print(vpares);
		}
		System.out.println();
		for(int vimpares:impares) {
			System.out.print(vimpares);
		}
	}

}
