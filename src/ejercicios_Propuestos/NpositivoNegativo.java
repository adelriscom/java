package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class NpositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		
		 do{
			
			numero = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese un numero por favor "));
									
			if(numero > 0) {
				System.out.println("El numero ingresado es positivo: " + numero);
			}
			else if(numero < 0) {
				System.out.println("El numero ingresado es negativo: " + numero);
			}
			
		}while(numero > 0 || numero < 0);
		
		System.out.println("El numero ingresado es cero: " + numero + " Adios!!!");

	}

}
