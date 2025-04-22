package clases;

/**
 * Clase Cilindro
 */
public class Cilindro {
	private int radio;
	private int altura;
	
	/**
	 * Constructor para crear un cilindro de radio y alturas especificos
	 * @param radio especificado en metros
	 * @param altura especficada en metros
	 */
	public Cilindro(int radio, int altura) {
		this.radio = radio;
		this.altura = altura;
	}
	
	/**
	 * Constructor para crear un cilindro de radio y altura predeterminados de 1 metro respectivamente
	 */
	public Cilindro() {
		this.radio = 1;
		this.altura = 1;
	}
	
	/**
	 * Metodo para obtener la superficie de un cilindro
	 * @return la superficie del cilindro en metros cuadrados
	 */
	public double superficie() {
		return (2 * 3.14 * (this.radio * this.radio)) + (2 * 3.14 * this.radio * this.altura);
	}
	
	/**
	 * Metodo para obtener el volumen de un cilindro
	 * @return el volumen del cilindro en metros cubicos
	 */
	public double volumen() {
		return (3.14 * (this.radio * this.radio)) * this.altura;
	}
}
