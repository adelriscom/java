package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Impares_Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int impar=0;
		long prod=1;
		
		while(impar<10) {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			
			if((num % 2) != 0) {
				
				System.out.println("El numero ingresado es impar: " + num);
				prod=prod*num;
				impar++;
			}
			
					
		}
		
		System.out.println("Usted ingreso: " + impar + " numeros impares");
		System.out.println("El producto de estos numeros es: " + prod);

	}

}
