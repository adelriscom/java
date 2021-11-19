package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Despalzar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, ultimo, desplazar;
		int num[]= new int[10];
		
		int mover = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de desplazamiento: "));
		
		for(int i=0; i<10; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: " + i));
			num[i]=numero;
		}
		
		System.out.println(" ");
		
		for(int vector:num) {
			System.out.print(vector + " ");
		}
		// guardamos el último elemento de la tabla
		
		for(int vueltas = 1; vueltas<=mover; vueltas++) {
			
			ultimo=num[9];
			
			for(int i=8; i>=0; i--) {
			num[i+1] = num[i];
							
			}
			// el ultimo valor pasa a ser el primero
			num[0]=ultimo;
		}
		
		System.out.println(" ");
		
		for(int vector:num) {
			System.out.print(vector + " ");
		}
		

	}

}
