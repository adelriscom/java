package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Insertar_Dato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[] = new int[10];
		int posicion=0, elemento;
		
		for(int i=0; i<8; i++) {
			
			int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: " + i));
			numeros[i]=num;
		}
		for(int vector:numeros) {
			System.out.print(vector + " ");
		}
		
		elemento = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que quiere insertar"));
		posicion = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion en la que quiere insertar el numero"));
		
		for(int i=7; i>=posicion; i--) {
			
			numeros[i+1] = numeros[i];
			
		}
		
		numeros[posicion]=elemento;
		
		System.out.println(" ");
		
		for(int vector:numeros) {
			System.out.print(vector + " ");
		}
		
		System.out.println(" ");
		
		for(int i=0; i<10; i++) {
			
			System.out.print(numeros[i] + " ");
		}

	}

}
