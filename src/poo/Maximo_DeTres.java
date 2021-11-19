package poo;

public class Maximo_DeTres {
	
	
		
		private int num1, num2, num3;
		
		public Maximo_DeTres() {
			
			num1=0;
			num2=0;
			num3=0;
		}
		
		//Metodo Setter
		public void asignar_3numeros(int num1, int num2, int num3) {
			
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
		}
		
		//Metodo Getter
		public int numero_mayor_de_3() {
			
			if(num1 > num2 && num1 > num3) {
				
				return num1;
			}
			else if(num2 > num1 && num2 > num3 ){
				return num2;
			}
			else {
				return num3;
			}
		}
	
}
