/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes.cap21.conta.modelo;

/**
 *
 * @author nanson
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            super.setSaldo(valor + super.getSaldo());
        }
    }

    @Override
    public boolean sacar(double valor) {
        if(valor > super.getSaldo()){
            return false;
        }
        
        super.setSaldo(super.getSaldo() - valor);
        return true;
    }

    @Override
    public void saldo() {
        System.out.println("Saldo : "+super.getSaldo());
    }
}
