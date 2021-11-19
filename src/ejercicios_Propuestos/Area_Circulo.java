package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Area_Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double area;
		
		String numero = JOptionPane.showInputDialog("Ingrese el radio del circulo");
		
		double radio = Double.parseDouble(numero);
		
		System.out.println("El radio del circulo es: " + radio);
		
		area = Math.PI*Math.pow(radio, 2);
		
		System.out.print("El area del circulo es: " );
		System.out.printf(" %1.2f ", + area);
		
		
		

	}

}
