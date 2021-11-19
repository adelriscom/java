package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Par_Impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		do {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			
			if(num != 0 && num % 2 == 0) {
				System.out.println("El numero ingresado es PAR: " + num);
			}
			else if(num % 2 != 0) {
				System.out.println("El numero ingresado es IMPAR: " + num);
			}
		}while(num != 0);
		
		System.out.println("Ha ingresado el numero: " + num + " el juego ha terminado!!");

	}

}
