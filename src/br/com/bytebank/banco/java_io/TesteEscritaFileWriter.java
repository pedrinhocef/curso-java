package br.com.bytebank.banco.java_io;

import java.io.*;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {


//        FileWriter fw = new FileWriter("comandos2.txt");
        BufferedWriter fw = new BufferedWriter(new FileWriter("comandos2.txt"));

        fw.write("Testando escrita ......");
        fw.newLine();
        fw.newLine();
        fw.write("Segund linha do teste");

        fw.close();
    }
}
