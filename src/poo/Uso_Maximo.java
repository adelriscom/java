package poo;

import javax.swing.JOptionPane;

public class Uso_Maximo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos del arreglo"));
		
		Numero_Mayor mayor = new Numero_Mayor(n);
				
		System.out.println(mayor.getMayor());
		
	}

}
