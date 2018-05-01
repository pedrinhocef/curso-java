package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {

    public static void main(String[] args) {

        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22, 56);
        Conta cp = new ContaPoupanca(32, 44);

        guardador.adiciona(cc);
        guardador.adiciona(cp);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        //Realizando um cast pois ele devolve um Object
        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref.getAgencia());
    }
}
