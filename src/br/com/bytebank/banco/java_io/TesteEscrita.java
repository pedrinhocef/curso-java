package br.com.bytebank.banco.java_io;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("comandos2.txt");
        OutputStreamWriter writer = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(writer);

        bw.write("Testando escrita ......");
        bw.newLine();
        bw.write("Segund linha do teste");

        bw.close();
    }
}
