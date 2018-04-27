package modelo;

import interfaces.Autenticavel;
import modelo.Funcionario;
import util.AutenticacaoUtil;

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
