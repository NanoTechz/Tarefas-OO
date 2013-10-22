/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes.cap21.conta.modelo;

import java.util.Date;

/**
 *
 * @author nanson
 */
public abstract class Conta {
    private Cliente cliente;
    private Date criadaEm;
    private double saldo;

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    public abstract void depositar(double valor);
    public abstract boolean sacar(double valor);
    public abstract void saldo();
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getCriadaEm() {
        return criadaEm;
    }

    public void setCriadaEm(Date criadaEm) {
        this.criadaEm = criadaEm;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
