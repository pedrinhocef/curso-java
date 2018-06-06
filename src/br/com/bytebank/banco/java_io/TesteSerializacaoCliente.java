package br.com.bytebank.banco.java_io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.*;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Pedro Soares");
        cliente.setCpf("11513960792");
        cliente.setProfissao("Dev");

        ContaCorrente cc = new ContaCorrente(222,0203);
        cc.setTitular(cliente);
        cc.deposita(300);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente corrente = (ContaCorrente) ois.readObject();
        ois.close();

        System.out.println(corrente.getSaldo());
        System.out.println(corrente.getTitular().getNome());
    }
}
