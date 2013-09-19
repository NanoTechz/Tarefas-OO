package questoes.cap4.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import questoes.cap4.Conta;

public class ContaTest {
	
	private Conta conta;
	private final double MARGEM_ERRO = 1e-10; 
	
	@Before
	public void setUp() throws Exception {
		conta = new Conta();
	}

	@Test
	public void calcularQuadradoTest() {
		for(int i=0; i < 100; i++){
			double x = Math.pow(-1, i) * (Math.random()*50);
			assertEquals(Math.pow(x, 2), conta.calcularQuadrado(x), MARGEM_ERRO);
		}
	}

	@Test
	public void calcularCuboTest() {
		for(int i=0; i < 100; i++){
			double x = Math.pow(-1, i) * (Math.random()*50);
			assertEquals(Math.pow(x, 3), conta.calcularCubo(x), MARGEM_ERRO);
		}
	}
}
