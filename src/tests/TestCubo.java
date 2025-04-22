package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cubo;

class TestCubo {

	@Test
	void testSuperficie() {
		Cubo c = new Cubo(2);
		
		// Calculamos la superficie que nos da el metodo
		double superficiaObtenida = c.superficie();
		//"Hardcodeamos" la superficie que sabemos que deberia dar
		double superficieEsperada = 24;
		
		assertEquals(superficieEsperada, superficiaObtenida);
	}
	
	@Test
	void testVolumen() {
		Cubo c = new Cubo(2);
		
		// Calculamos la superficie que nos da el metodo
		double volumenObtenido = c.volumen();
		//"Hardcodeamos" la superficie que sabemos que deberia dar
		double volumenEsperado = 8;
		
		assertEquals(volumenEsperado, volumenObtenido);
	}

}
