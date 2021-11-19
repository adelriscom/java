package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Quince_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, sum=0;
		
		for(int i=1; i<=15; i++) {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero " + i));
			sum = sum + num;
			
			System.out.print("" + num + " ");
			
			
		}
		
		System.out.println("\n" + "La susma de los numeros es: " + sum);

	}

}
