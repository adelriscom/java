package ejercicios;

import javax.swing.JOptionPane;

public class CalcularAreaCirculo {
	
	private int radio;
	private double area;
	
	public CalcularAreaCirculo() {
		
		radio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo "));
	}
	
	public double calcular_area() {
		
		area=Math.PI*Math.pow(radio, 2);
		return area;
	}

}
