package fundamentos;

import java.util.*;
public class Uso_Tallas {
	
	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) { //constructor de enum, es privado por que no se puede crear una instancia de clase de un objeto enum.
			
			this.abreviatura=abreviatura;
		}
		
		//como se esta asignando el valor de abreviatura en el constructor, este hace las veces del Setter
		public String dameAbreviatura() {//Getter
			
			return abreviatura;
		}
		
		private String abreviatura;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Talla s=Talla.MINI;//opcion para el tipo de objeto enum
		//Talla m=Talla.MEDIANO;
		//Talla l=Talla.GRANDE;
		//Talla xl=Talla.MUY_GRANDE;
		
		Scanner  entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String entrada_datos = entrada.next().toUpperCase();
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla= " + la_talla);
		System.out.println("Abreviatura= " + la_talla.dameAbreviatura());
		
		

	}

}
