package poo;

public interface Jefes extends Trabajadores {
	/*los modificadordes de de acceso para un metodo declarado
	 * en una interfaz son
	 * public abstract TIPO DE DATO Y NOMBRE DEL METODO
	 * No es necesario poner public abstract
	 * por defecto java entiende que dentro de una interfaz
	 * esos son los modificadores*/
	
	
	String tomar_decisiones(String decision);

}
