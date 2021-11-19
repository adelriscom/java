package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Multiplos_de_Tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0, x=0, num;
		
		while(i<5) {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			
			if(num%3 == 0) {
				
				x++;
			}
			
			i++;
				
		}
		System.out.println("Hay " + x + " numeros multiplos de 3");

	}

}
