package ejercicios;

import javax.swing.JOptionPane;

public class CPCircunferencia {
	
	private int radio;
	private double perimetro;
	
	public CPCircunferencia() {
		
		radio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo "));
	}
	
	public double Calcular_Perimetro() {
		
		perimetro=2*Math.PI*radio;
		return perimetro;
	}

}
