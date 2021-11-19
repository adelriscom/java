package poo;

public class Numero_Maximo {
	
	private int num1, num2;
	
	public Numero_Maximo() {
		
		num1=0;
		num2=0;
	}
	
	//Metodo Setter
	public void asignar_numeros(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//Metodo Getter
	public int numero_mayor() {
		
		if(num1 > num2) {
			
			return num1;
		}
		else {
			return num2;
		}
	}

}
