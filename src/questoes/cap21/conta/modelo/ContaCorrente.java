/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes.cap21.conta.modelo;

/**
 *
 * @author nanson
 */
public class ContaCorrente extends Conta{
    
    private double credito;

    public ContaCorrente(Cliente cliente, double saldo, double credito) {
        super(cliente, saldo);
        this.credito = credito;
    }
    
    @Override
    public void depositar(double valor) {
        if(valor > 0){
            super.setSaldo(valor +super.getSaldo());
        }
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= super.getSaldo()){
            super.setSaldo(super.getSaldo() - valor);
            return true;
        }
        
        if(valor <= credito){
            super.setSaldo(super.getSaldo() - valor);
            return true;
        }
        
        return false;
    }

    @Override
    public void saldo() {
        System.out.println("Saldo : "+super.getSaldo());
    }

    public double getCredito() {
        return credito;
    }    
       
}
