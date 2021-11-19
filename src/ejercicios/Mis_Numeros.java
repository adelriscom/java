package ejercicios;

import javax.swing.JOptionPane;

public class Mis_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
		
		Numeros numbers=new Numeros();
		
		numbers.numeros(num1, num2);
		System.out.println("Los numeros ingresados son: " + num1 +";"+ num2);
		
		
		System.out.println(numbers.comparar_numeros());
		
		

	}

}
