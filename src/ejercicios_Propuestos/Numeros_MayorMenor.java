package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Numeros_MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1 = JOptionPane.showInputDialog("Por favor ingrese el primer numero");
		int a = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog("Por favor ingrese el segundo numero");
		int b = Integer.parseInt(num2);
		
		if(a > b) {
			
			System.out.println("El numero " + a + " es mayor que el numero " + b);
			System.out.println(a+ ","+ b);
		}
		else if(b > a) {
			
			System.out.println("El numero " + b + " es mayor que el numero " + a);
			System.out.println(b+ ","+ a);
		}
		else {
			
			System.out.println("El numero " + a + " es igual al numero " + b);
			System.out.println(a+ ","+ b);
		}
		
		

	}

}
