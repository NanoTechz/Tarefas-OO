/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes.cap21.conta.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import questoes.cap21.conta.modelo.Cliente;
import questoes.cap21.conta.modelo.ContaPoupanca;

public class ContaPoupancaTest {
    private static ContaPoupanca conta;
    private static final double MARGEM_ERRO = 1e-10;
    
    private static void  inicializarNovaConta(double valor){
        Cliente cliente = new Cliente("Fulano");
        conta = new ContaPoupanca(cliente, valor);
    }
        
    
    @Test
    public void testSacarComSaldo(){
    	inicializarNovaConta(15000);
        conta.sacar(1500.00);
        assertEquals(13500.00, conta.getSaldo(), MARGEM_ERRO);
    }
    
    @Test
    public void testSacarSemSaldo(){
    	inicializarNovaConta(0);
    	assertEquals(false, conta.sacar(1));
    	assertEquals(0, conta.getSaldo(), MARGEM_ERRO);
    }
    
    @Test 
    public void testDepositarNormal(){
    	inicializarNovaConta(0);
    	conta.depositar(5000.00);
    	assertEquals(5000.0, conta.getSaldo(), MARGEM_ERRO);
    }
    
    @Test
    public void testDepositoValorNegativo(){
    	inicializarNovaConta(1000);
    	conta.depositar(-500.00);
    	assertEquals(1000.0, conta.getSaldo(), MARGEM_ERRO);
    }
}
