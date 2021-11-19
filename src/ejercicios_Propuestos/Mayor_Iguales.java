package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Mayor_Iguales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 = JOptionPane.showInputDialog("Por favor ingrese un numero");
		int a = Integer.parseInt(num1);
		
		String num2=JOptionPane.showInputDialog("Por favor ingrese otro numero");
		int b = Integer.parseInt(num2);
		
		if(a > b) {
			
			System.out.println("El numero " + a + " es mayor que " + b);
		}
		else if(b > a) {
			
			System.out.println("El numero " + b + " es mayor que " + a);
		}
		else {
			
			System.out.println("Los numeros " + a + " y " + b + " son iguales ");
		}
		
		
	}

}
