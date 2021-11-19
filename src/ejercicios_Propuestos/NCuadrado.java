package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class NCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;		
		
		
		do {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor Ingrese un numero"));
			System.out.println("El numero ingresado es: " + numero);
			int cnum = (int)Math.pow(numero, 2);
			System.out.println("El cuadrado de este nuemro es: " + cnum);
			
		}while(numero > 0);
		
		System.out.println("Ha ingresado un numero negativo, Adios!!");
	}

}
