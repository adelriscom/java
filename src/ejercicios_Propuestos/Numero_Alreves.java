package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Numero_Alreves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int numero;
		 int dm, um, c, d, u;
		 // 9 9 . 9 9 9 a cada guarismo lo llamaremos:
		 //dm um c d u: dm (decenas de millar), um:(unidades de millar)
		 // c: (centenas), d: (decenas), u: (unidades)
		 
		 int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 99.999"));
		 System.out.print("El numero ingresado es: " + numero + "\n");
		 
		 // unidad
		 u = numero % 10;
		 System.out.print("Las unidades del numero son : " + u + "\n");
		 numero = numero / 10;
		 System.out.print("El numero dividido en 10 es: " + numero + "\n");
		 
		 // decenas
		 d = numero % 10;
		 System.out.print("Las decenas del numero son : " + d + "\n");
		 numero = numero / 10;
		 System.out.print("El numero dividido en 10 es: " + numero + "\n");
		 
		 // centenas
		 c = numero % 10;
		 System.out.print("Las centenas del numero son : " + c + "\n");
		 numero = numero / 10;
		 System.out.print("El numero dividido en 10 es: " + numero + "\n");
		
		 // unidades de millar
		 um = numero % 10;
		 System.out.print("Los millares del numero son : " + um + "\n");
		 numero = numero / 10;
		 System.out.print("El numero dividido en 10 es: " + numero + "\n");
		 
		 // decenas de millar
		 dm = numero;
		 // lo imprimimos al revés:
		 System.out.println (u + " " + d + " " + c + " " + um + " " + dm);
		 // otra forma de hacerlo es
		// numero = 10000*u + 1000*d + 100*c + 10*um + dm;
		 System.out.println (numero);
		
	
			
			
		
	}

}
