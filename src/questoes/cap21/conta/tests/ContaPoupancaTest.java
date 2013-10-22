/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes.cap21.conta.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import questoes.cap21.conta.modelo.Cliente;
import questoes.cap21.conta.modelo.ContaPoupanca;

public class ContaPoupancaTest {
    private static ContaPoupanca conta;
    private static final double MARGEM_ERRO = 1e-10;
    
    private static void  inicializarConta(){
        Cliente cliente = new Cliente("Fulano");
        conta = new ContaPoupanca(cliente, 15000.0);
    }
        
    
    @Test
    public void testSacarComSaldo(){
        conta.sacar(1500.00);
        assertEquals(13500.00, conta.getSaldo(), MARGEM_ERRO);
    }
}
