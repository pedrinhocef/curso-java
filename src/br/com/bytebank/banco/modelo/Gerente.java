package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.interfaces.Autenticavel;
import br.com.bytebank.banco.util.AutenticacaoUtil;

public class Gerente extends Funcionario implements Autenticavel {


    private final AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    public double getBonificao() {
        System.out.println("Aqui é gerente");
        return 150;
    }
}
