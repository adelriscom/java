package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Desplazar2 {

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
					
		int copia[] = num.clone();
		
		for(int i=0; i<10; i++) {
			num[i] = copia[(i+mover)%10];
							
			}
			// el ultimo valor pasa a ser el primero
			
		
		
		System.out.println(" ");
		
		for(int vector:num) {
			System.out.print(vector + " ");
		}
		

	}

}
