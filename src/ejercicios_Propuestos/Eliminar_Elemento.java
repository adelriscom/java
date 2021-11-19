package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Eliminar_Elemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, num;
		int n[] = new int[10];
		
		for(int i=0; i<10; i++) {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: " + i));
			n[i]=numero;
			
		}
		
		System.out.println();
		for(int vector:n)
			System.out.print(vector);
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar: " ));
		
		for(int i=num; i<9; i++) {
			
			n[i] = n[i+1];
		}
		System.out.println();
		
		for(int vector:n)
			System.out.print(vector);

	}

}
