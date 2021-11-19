package ejercicios_Propuestos;

import javax.swing.*;

public class Positivo_Negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero = JOptionPane.showInputDialog("Por favor ingrese un numero");
		int num = Integer.parseInt(numero);
		System.out.println("El numero ingresado es: " + num);
		
		if(num < 0 ) {
			
			System.out.println("El numero ingresado es un numero negativo: " + num);
		}
		else {
			
			System.out.println("El numero ingresado es un numero positivo: " + num);
		}
		

	}

}
