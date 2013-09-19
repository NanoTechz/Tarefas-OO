package questoes.cap4.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import questoes.cap4.Conta;
import questoes.cap4.ContasNaoConfiavel;

public class ContaNaoConfiavelTest {

	private Conta conta;
	private ContasNaoConfiavel contaTest;
	private final double MARGEM_ERRO = 1e-10; 
	
	@Before
	public void setUp() throws Exception {
		conta = new Conta();
		contaTest = new ContasNaoConfiavel();
	}

	@Test
	public void calcularQuadradoTest() {
		for(int i=0; i < 100; i++){
			double x = Math.pow(-1, i) * (Math.random()*50);
			assertEquals(conta.calcularQuadrado(x), contaTest.calcularQuadrado(x), MARGEM_ERRO);
		}
	}

	@Test
	public void calcularCuboTest() {
		for(int i=0; i < 100; i++){
			double x = Math.pow(-1, i) * (Math.random()*50);
			assertEquals(conta.calcularCubo(x), contaTest.calcularCubo(x), MARGEM_ERRO);
		}
	}

}
