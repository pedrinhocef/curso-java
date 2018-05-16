package br.com.bytebank.banco.java_io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("comandos.txt");
        InputStreamReader reader = new InputStreamReader(fis);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String readLine = bufferedReader.readLine();

        while(readLine != null){
            System.out.println(readLine);
            readLine = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
