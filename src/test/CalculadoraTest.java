package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		assertEquals(5, Calculadora.suma(3,2));
	}
	@Test
	void testResta() {
		assertEquals(1, Calculadora.resta(3,2));
	}
	@Test
	void testMultiplicacion() {
		assertEquals(6, Calculadora.multiplicacion(3,2));
	}
	@Test
	void testDivision() {
		assertEquals(1, Calculadora.division(3,2));
	}

}
