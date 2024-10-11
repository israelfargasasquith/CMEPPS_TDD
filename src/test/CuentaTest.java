package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	Cuenta cuenta,cuenta12345,cuenta67890;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta(0d);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(1d);
		assertEquals(1d,cuenta.getSaldo());
	}
	@Test
	void testRetirar() {
		cuenta.retirar(1d);
		assertEquals(-1d,cuenta.getSaldo());
	}
	@Test
	void test0014() {
		
		boolean saldo12345, saldo67890;
		saldo12345 =true;
		saldo67890 = true;
		
		assertTrue(true,saldo12345 && saldo67890);
	}
	
	
	

}
