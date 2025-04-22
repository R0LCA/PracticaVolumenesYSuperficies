package clases;
/**
 *  Clase Cubo
 */
public class Cubo {
	private int lado;
	
	/**
	 * Constructor para crear un cubo de un lado especifico
	 * @param lado especificado en metros
	 */
	public Cubo(int lado){
		this.lado = lado;
	}
	
	/**
	 * Constructor para crear un cubo de un lado predeterminado de 1 metro
	 */
	public Cubo(){
		this.lado = 1;
	}
	
	/**
	 * Metodo para obtener la superficie de un cubo
	 * @return la superficie del cubo en metros cuadrados
	 */
	public double superficie() {
		return 6*(this.lado * this.lado);
	}
	
	/**
	 * Metodo para obtener el volumen de un cubo
	 * @return el volumen del cubo en metros cubicos
	 */
	public double volumen() {
		return this.lado * this.lado * this.lado;
	}
	
	
}
