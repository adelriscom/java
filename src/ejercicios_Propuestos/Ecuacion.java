package ejercicios_Propuestos;

import java.util.*;

public class Ecuacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int raiz, raiz1, raiz2;
		int x1, x2;
		int radicando;
		
		Scanner param = new Scanner(System.in);
		
		System.out.print("Ingrese el parametro a: ");
		int a = param.nextInt();
		System.out.println("El parametro a es: " + a +"\n");
		
		System.out.print("Ingrese el parametro b: ");
		int b = param.nextInt();
		System.out.println("El parametro b es: " + b+"\n");
		
		System.out.print("Ingrese el parametro c: ");
		int c = param.nextInt();
		System.out.println("El parametro c es: " + c+"\n");
		
		
		radicando  = (int)Math.pow(b, 2) - 4*a*c;
		raiz = (int)Math.sqrt(radicando);
		System.out.println("La raiz es igual a: " + raiz + "\n");
		
		if(radicando < 0) {
			
			System.out.println("El radicando es negativo por lo tanto no hay raices en el conjunto de los reales. El radicando es: " + radicando + "\n");
		}
		
		else if(radicando > 0){
			
			x1 = (-b + raiz)/(2*a);
			raiz1 = x1;
			System.out.println("La primera raiz es igual a: " + raiz1 + "\n");
			
			x2 = (-b - raiz)/(2*a);
			raiz2 = x2;
			System.out.println("La segunda raiz es igual a: " + raiz2);
		}
		
		 
		
		
		
	}

}
