package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Calculadora;

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
		assertEquals(5, Calculadora.sumar(2, 3));
	}
	
	@Test
	void testResta() {
		assertEquals(5, Calculadora.restar(10, 5));
	}
	
	@Test
	void testMultiplicar() {
		assertEquals(6, Calculadora.multiplicar(3, 2));
	}
	
	@Test
	void testDivision() {
		assertEquals(3, Calculadora.dividir(6, 2));
	}
	
	@Test
	void testDivisionEntreCero() {
		assertThrows(IllegalArgumentException.class, () -> Calculadora.dividir(20, 0));
	}
	
	

}
