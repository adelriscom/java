package libro.cap01.cadenas;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Esta es mi cadena";
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(5));
		System.out.println(s.length());
		System.out.println(s.charAt(s.length()-1));
		
		char c;
		
		for(int i=0; i<s.length(); i++) {
			
			c = s.charAt(i);
			System.out.println(i + " -> " + c);
		}
		

	}

}
