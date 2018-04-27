package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.exception.SaldoInsuficienteException;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaExceptions {

    public static void main (String[] args){
        Conta conta = new ContaCorrente(212, 211);
        conta.deposita(200);

        try {
            conta.saca(201);
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println("Saldo da conta : "
                + conta.getSaldo());
    }
}
