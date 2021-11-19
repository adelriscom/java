package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Contar_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, i=0;
		
		do {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			
			if(num >= 0) {
				
				System.out.println("El numero ingresado es: " + num);
			}
			
			i++;
			
		}while(num >= 0);
		
		System.out.println("El numero ingresado es: " + num);
		System.out.println("Ud ingreso: " + i + " numeros" + "\n" + "Ha ingresado un numero negativo: " + num + " el juego ha terminado!!");
		//System.out.println("Ud ingreso: " + i + " numeros");
		

	}

}
