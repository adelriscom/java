package poo;

import javax.swing.JOptionPane;

public class Mi_Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejercicio1 mensaje = new Ejercicio1();
		
		int mveces = Integer.parseInt(JOptionPane.showInputDialog("Cuantas veces quiere mostrar el mensaje"));
		mensaje.establece_veces_mensaje(mveces);
		mensaje.dime_mensaje();
		
		System.out.println(" ");
		System.out.println("Se va a seleccionar el numero mayor de entre dos");
		Numero_Maximo mayor = new Numero_Maximo();
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		mayor.asignar_numeros(n1, n2);
		
		System.out.println("El numero mayor es: " + mayor.numero_mayor());
		
		System.out.println(" ");
		
		System.out.println("Se calculara el mayor de tres numeros");
		
		Maximo_DeTres elmayor = new Maximo_DeTres();
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));
		
		elmayor.asignar_3numeros(numero1, numero2, numero3);
		System.out.println(numero1 + " " + numero2 + " " + numero3);
		System.out.println("El numero mayor es: " + elmayor.numero_mayor_de_3());
		
		
	
	}

}
