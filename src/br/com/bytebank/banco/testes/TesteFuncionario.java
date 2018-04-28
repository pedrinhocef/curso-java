package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.*;

public class TesteFuncionario {

    public static void main(String[] args) {


        Gerente g = new Gerente();
        g.setSenha(2222);
        Desenvolvedor dev = new Desenvolvedor();
        dev.setSenha(2212);

        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");
        pedro.setProfissao("Dev");

        ContaPoupanca cp = new ContaPoupanca(222,2222);
        cp.deposita(5000);
        cp.setTitular(pedro);

        ContaCorrente cc = new ContaCorrente(221, 2342);
        cc.deposita(200);

        cp.transfere(200, cc);

        System.out.println("Saldo CC " + cc.getSaldo());
        System.out.println("Saldo CP " + cp.getSaldo());






    }
}
