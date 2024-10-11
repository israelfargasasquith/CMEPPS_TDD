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
		cuenta = new Cuenta(0d, "0", "test");
		cuenta12345 = new Cuenta(50d,"12345","pepe");
		cuenta67890 = new Cuenta(0d,"67890","antonio");
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
		
		cuenta12345.retirar(200d);
		cuenta67890.retirar(350d);
		
		cuenta12345.ingresar(100d);
		
		cuenta67890.retirar(200d);
		cuenta67890.retirar(150d);
		cuenta12345.retirar(200d);
		
		cuenta67890.ingresar(50d);
		
		cuenta67890.retirar(100d);
		
		boolean saldo12345, saldo67890;
		saldo12345 = cuenta12345.getSaldo() == -250d;
		saldo67890 = cuenta67890.getSaldo() == -450d;
		
		assertTrue(saldo12345 && saldo67890);
	}
	
	
	

}
