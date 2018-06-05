package br.com.bytebank.banco.java_io;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Transformando um objeto em fluxo de bytes
        String nome = "Pedro Soares";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oos.writeObject(nome);
        oos.close();
        //inverso de bytes para obejto
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String object = (String) ois.readObject();
        System.out.println(object);
        ois.close();
    }
}
