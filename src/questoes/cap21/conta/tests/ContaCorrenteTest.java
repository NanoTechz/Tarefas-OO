package questoes.cap21.conta.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import questoes.cap21.conta.modelo.Cliente;
import questoes.cap21.conta.modelo.ContaCorrente;

public class ContaCorrenteTest {

    private static ContaCorrente conta;
    private static final double MARGEM_ERRO = 1e-10;
    
    private static void  inicializarNovaConta(double valor, double credito){
        Cliente cliente = new Cliente("Fulano");
        conta = new ContaCorrente(cliente, valor, credito);
    }
        
    
    @Test
    public void testSacarComSaldo(){
    	inicializarNovaConta(15000, 0);
        conta.sacar(1500.00);
        assertEquals(13500.00, conta.getSaldo(), MARGEM_ERRO);
    }
    
    @Test
    public void testSacarSemSaldoComCredito(){
    	inicializarNovaConta(0, 1230);
    	assertEquals(true, conta.sacar(230));
    	assertEquals(-230.0, conta.getSaldo(), MARGEM_ERRO);
    }
    
    @Test
    public void testSacarSemSaldoSemCredito(){
    	inicializarNovaConta(0, 527);
    	assertEquals(false, conta.sacar(528));
    	assertEquals(0, conta.getSaldo(), MARGEM_ERRO);
    }
    
    @Test 
    public void testDepositarNormal(){
    	inicializarNovaConta(0, 0);
    	conta.depositar(5000.00);
    	assertEquals(5000.0, conta.getSaldo(), MARGEM_ERRO);
    }
    
    @Test
    public void testDepositoValorNegativo(){
    	inicializarNovaConta(1000, 0);
    	conta.depositar(-500.00);
    	assertEquals(1000.0, conta.getSaldo(), MARGEM_ERRO);
    }
}
