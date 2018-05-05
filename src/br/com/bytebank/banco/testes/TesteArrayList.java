package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;

public class TesteArrayList {

    public static void main(String[] args) {
        //utilizando <generics>
        ArrayList<Conta> lista = new ArrayList<>();
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println(lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

//        for (int i = 0; i < lista.size() ; i++) {
//            Object oRef = lista.get(i);
//            System.out.println(oRef);
//        }

//        lista.remove(0);
//        System.out.println("Tamanho: " + lista.size());
//
//        System.out.println("----------");
//
//        for(Conta conta : lista) {
//            System.out.println(conta);
//        }


        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        TitularDaContaComparator nomeComparator = new TitularDaContaComparator();

//        boolean existe = lista.contains(cp2);
//        System.out.println("Exite conta ? " + existe);

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }
        System.out.println("---------------------");

        lista.sort(nomeComparator);

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

    }
}
class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        if (c1.getNumero() < c2.getNumero()) {
            return -1;
        }
        if (c1.getNumero() > c2.getNumero()) {
            return 1;
        }
        return 0;
    }
}

class TitularDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        String nomec1 = c1.getTitular().getNome();
        String nomec2 = c2.getTitular().getNome();
        return nomec1.compareTo(nomec2);
    }
}
