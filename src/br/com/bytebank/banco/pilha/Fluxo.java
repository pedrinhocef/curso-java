package br.com.bytebank.banco.pilha;

import br.com.bytebank.banco.exception.MinhaException;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
            metodo1();
        } catch (NullPointerException | ArithmeticException | MinhaException ex) {
            String msg = ex.getMessage();
            System.out.println(msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
//            int a = 5;
//            int b = 0;
//            int result = a / b;
           // throw new ArithmeticException("Deu erro");
            throw new MinhaException("Deu erro");

        }
        System.out.println("Fim do metodo2");
    }
}