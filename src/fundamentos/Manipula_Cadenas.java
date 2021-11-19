package fundamentos;


public class Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Alexnder";
		
		System.out.println("Mi nombre es "+nombre);
		System.out.println("Mi nombre tiene "+ nombre.length() + " letras.");
		System.out.println("La primera letra de "+ nombre + " es " + nombre.charAt(0));
		
		int ultima_letra;
		ultima_letra=nombre.length();
		System.out.println("La ultima letra es la "+ nombre.charAt(ultima_letra-1) + "\n");
		
		//El objetivo es seguir practicando. Actualizado 25 de Marzo 2020
		
		String miNombre = "Marcela";
		
		System.out.println("el nombre de mi esposa es: " +miNombre+"\n");
		System.out.println("Este nombre tiene: " +miNombre.length() + " letras");
		System.out.println("La primera letra de " +miNombre +" es: " + miNombre.charAt(0));
		
		int ultimaLetra2;
		
		ultimaLetra2 = miNombre.length();
		
		System.out.println("El numero de letras son: " + ultimaLetra2);		
		System.out.println("Y la ultima letra es la: " + miNombre.charAt(ultimaLetra2-1));

	}

}
