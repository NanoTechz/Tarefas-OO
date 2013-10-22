/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes.cap21.conta.modelo;

/**
 *
 * @author nanson
 */
public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
