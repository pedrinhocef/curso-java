package br.com.bytebank.banco.interfaces;

public interface Autenticavel {

    void setSenha(int senha);
    boolean autentica(int senha);
}
