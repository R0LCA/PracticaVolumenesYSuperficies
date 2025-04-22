package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cilindro;

class TestCilindro {

	@Test
	void testSuperficie() {
		Cilindro c = new Cilindro(2, 2);
		
		// Calculamos la superficie que nos da el metodo
		double superficieObtenida = Math.round(c.superficie() * 100) / 100;
		//"Hardcodeamos" la superficie que sabemos que deberia dar
		double superficieEsperada = Math.round(50.27 * 100) / 100;
		
		assertEquals(superficieEsperada, superficieObtenida, 0.01);
	}
	
	@Test
	void testVolumen() {
		Cilindro c = new Cilindro(2, 2);
		
		// Calculamos la superficie que nos da el metodo
		double volumenObtenido = Math.round(c.volumen() * 100) / 100;
		//"Hardcodeamos" la superficie que sabemos que deberia dar
		double volumenEsperado = Math.round(25.13 * 100) / 100;
		
		assertEquals(volumenEsperado, volumenObtenido, 0.01);
	}

}
