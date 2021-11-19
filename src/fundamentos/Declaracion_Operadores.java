package fundamentos;


public class Declaracion_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c, resultado;
		final double apulgadas = 2.54;
		
		a = 8;
		b = 20;
		c = 7;
		
		resultado = a * b + c;
		
		System.out.println("el valor inicial de a es: " +a);
		System.out.println("el valor inicial de b es: " +b);
		System.out.println("el valor inicial de c es: " +c+"\n");
		
		
		System.out.println("Resultado con valores iniciales: "+resultado+"\n");
		
		a+= 3;
		b-= 4;
		c-= 2;
		
		resultado = a * b + c;
		
		System.out.println("el valor de a es: " +a);
		System.out.println("el valor de b es: " +b);
		System.out.println("el valor de c es: " +c+"\n");
		
		System.out.println("El resultado despues de modificar os valores es: "+resultado+"\n");
		
		System.out.println("Conversion de pulgadas a centimetros"+"\n");
		
		double cm = 6;
		double cresultado = cm/apulgadas;
		
		System.out.println(cresultado);
	}

}
