package br.com.bytebank.banco.java_io;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("comandos2.txt");

        PrintWriter pw = new PrintWriter("comandos2.txt");


        pw.println("Testando escrita com PrintWriter");
        pw.println();

        ps.println("Testando escrita ......");
        ps.println();
        ps.println();
        ps.println("Segund linha do teste");

        ps.close();
        pw.close();
    }
}
