package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class TabMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mult=0;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		
		if(num > 0 && num <= 10)  {
			
			System.out.println("La tabla de multiplicar del numero " + num + " es: ");
				
			for(int i=1; i<=10; i++){
				
				mult = num*i;
				
				System.out.println(num + " * " + i + " =" + " " +mult);
			}
											
		}
		else{
			
			System.out.println("Ingreso un numero que no esta entre 0 y 10");
		}
			
			
	}
		
}


