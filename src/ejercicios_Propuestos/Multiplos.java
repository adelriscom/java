package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mod;
		
		String num1 = JOptionPane.showInputDialog("Ingrese el primer numero");
		int n = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog("Ingrese el segundo numero");
		int n2 = Integer.parseInt(num2);
		
		if (n > n2) {
			
			mod = n % n2;
			
			if(mod==0) {
				
				System.out.println("El numero " + n + " es multiplo de: " + n2);
			}
			else {
				
				System.out.println("No son multiplos");
			}
		}
		else if(n < n2) {
			
			mod = n2 % n;
			
			if(mod==0) {
				
				System.out.println("El numero " + n2 + " es multiplo de: " + n);
			}
			else {
				
				System.out.println("Aqui no son multiplos");
			}
		}
		else if(n==n2){
			
			System.out.println("El numero " + n + " y el numero " + n2 + " son iguales y por lo tanto son multiplos");
		}

	}

}
