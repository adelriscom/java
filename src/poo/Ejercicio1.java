package poo;

public class Ejercicio1 {
	
	private int num;
	
	public Ejercicio1() {
		
		num=0;
	}
	
	//Metodo Setter
	public void establece_veces_mensaje(int nveces) {
		
		num = nveces; 
		
	}
	
	//Metodo Getter
	public String dime_mensaje() {
		
		for(int i=0; i< num; i++) {
			
			System.out.println("Modulo Ejecutandose");
			
		}
		 return "Se devuelve el mensaje establecido en el ciclo";
		
		
	}

}
