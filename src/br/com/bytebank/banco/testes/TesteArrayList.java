package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        Conta cc = new ContaCorrente(22, 33);
        Conta cp = new ContaPoupanca(33, 45);

        lista.add(cc);
        lista.add(cp);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        for (int i = 0; i < lista.size() ; i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        System.out.println("----------");

        for(Object oRef : lista) {
            System.out.println(oRef);
        }

    }
}
