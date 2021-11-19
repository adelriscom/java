package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Numero_Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero2;
		 int dm, um, c, d, u;
		 // 9 9 . 9 9 9 a cada guarismo lo llamaremos:
		 //dm um c d u: dm (decenas de millar), um:(unidades de millar)
		 // c: (centenas), d: (decenas), u: (unidades)
		 
		 int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 99.999"));
		 System.out.print("El numero ingresado es: " + numero + "\n");
		 
		 numero2 = numero;
		 
		 // unidad
		 u = numero % 10;
		 numero = numero / 10;
		  
		 if(numero!= 0) {
			 
			 			 
			 System.out.print("Las unidades del numero son : " + u + "\n");
			 System.out.print("El numero dividido en 10 es: " + numero + "\n");
			 
			 
		 }
		  
		 // decenas
		 d = numero % 10;
		 numero = numero / 10;
		 
		 if(numero != 0) {
			 				 
			 System.out.print("Las decenas del numero son : " + d + "\n");
			 System.out.print("El numero dividido en 10 es: " + numero + "\n");
			 
			 
		 }
				 		 
		 // centenas
		 c = numero % 10;
		 numero = numero / 10;
		 
		 if(numero != 0) {
						 
			 System.out.print("Las centenas del numero son : " + c + "\n");
			 System.out.print("El numero dividido en 10 es: " + numero + "\n");
			 
			 
		 }
		 		
		 // unidades de millar
		 um = numero % 10;
		 numero = numero / 10;
		 
		 if(numero != 0) {
			 
			 System.out.print("Los millares del numero son : " + um + "\n");
			 System.out.print("El numero dividido en 10 es: " + numero + "\n");
			 
			 
		 }	 
		 
		 // decenas de millar
		 dm = numero;
		 // lo imprimimos al revés:
		 if( numero2 < 10) {
			 System.out.println(u);
		 }
		 else if( numero2 > 10 && numero2 <= 100) {
			 System.out.println(u + " " + d);
			 if(u==d) {
				 System.out.println("El numero es capicua");
			}
		 }
		 else if(numero2 > 100 && numero2 <= 1000) {
			 System.out.println(u + " " + d + " " + c);
			 if(u==c) {
				 System.out.println("El numero es capicua");
			 }
		 }
		 else if( numero2 > 1000 && numero2 <= 10000) {
			 System.out.println(u + " " + d + " " + c + " " + um);
			 if(u==um && d==c) {
				 System.out.println("El numero es capicua");
			 }
		 }
		 else {
			 System.out.println(u + " " + d + " " + c + " " + um + " " + dm);
			 if(u==dm && d == um) {
				 System.out.println("El numero es capicua");
			 }
		 }
		 
		 // otra forma de hacerlo es
		 //numero = 10000*u + 1000*d + 100*c + 10*um + dm;
		 //System.out.println (numero);
		
		
	}

}
