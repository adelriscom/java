package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Longitud_Circunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radio;
		double longitud;
		
		String r = JOptionPane.showInputDialog("Ingrese el radio de la circunferencia");
		radio = Double.parseDouble(r);
		
		System.out.println("El radio de la circunferencia que ha ingresado es: " + radio);
		
		longitud = 2*Math.PI*radio;
		
		System.out.print("La longutid de la circunferencia es: ");
		System.out.printf(" %1.2f",+ longitud);
		
	}

}
