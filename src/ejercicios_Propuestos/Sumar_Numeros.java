package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Sumar_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma, num;
		suma = 0;
	
		
		do {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			
			suma = suma + num;
			
		}while(num != 0);
		
		System.out.println("La suma de los numeros ingresados es: " + suma);
		System.out.println("Ud. ha ingresado el numero: " + num + " el juego ha terminado!!");

	}

}
