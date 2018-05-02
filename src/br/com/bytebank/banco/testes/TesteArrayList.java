package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {
        //utilizando <generics>
        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(22, 33);
        Conta cp = new ContaPoupanca(33, 45);

        lista.add(cc);
        lista.add(cp);

        System.out.println(lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        for (int i = 0; i < lista.size() ; i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        System.out.println("----------");

        for(Conta conta : lista) {
            System.out.println(conta);
        }
        Conta cp2 = new ContaPoupanca(33, 45);

        boolean existe = lista.contains(cp2);
        System.out.println("Exite conta ? " + existe);

    }
}
