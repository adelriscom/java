package ejercicios;

import javax.swing.JOptionPane;

public class CalcularEcuacion {
	
	private int a;
	private int b;
	private int c;
	private int radicando;
	private int raiz_cuadrada;
	private double raiz1;
	private double raiz2;
	
	
	public CalcularEcuacion() {
		
		a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el termino A "));
		b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el termino B "));
		c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el termino C "));
	
				
	}
	
	public int calcula_radicando() {
		
		radicando=(int) Math.pow(b, 2) - 4*a*c;
		
		if(radicando < 0) {
			
			System.out.println("El radicando es menor que cero, debe calcular la raiz cuadrada de: " + radicando + "\n");
			
		}
		return radicando;
	}
	
	public int calcula_raiz() {
		
		if(radicando >= 0) {
			
			raiz_cuadrada=(int)Math.sqrt(radicando);
		
		}else {
			
			System.out.println("Debe calcular las raices imaginarias \n");
		}
		
		return raiz_cuadrada;
		
	}
	
	public String Raiz_1() {
		
		if(radicando< 0) {
			
			return("X1 es una raiz imaginaria \n");
			
		}else {
			
			raiz1= (-b+raiz_cuadrada)/2*a;
			
			return "La raiz X1 es: " + raiz1;
		}
		
		
	}
	
	public String Raiz_2() {
		
		if(radicando< 0) {
			
			return ("X2 es una raiz imaginaria");
			
		}else {
			
			raiz2=(-b -( raiz_cuadrada))/2*a;
			
			return "La raiz X2 es: " + raiz2;
		}
				
	}

}
