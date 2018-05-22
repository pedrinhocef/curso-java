package br.com.bytebank.banco.java_io;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);

            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String valor = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();

            System.out.println(valor + valor2 + valor3 + valor4 + valor5);

            linhaScanner.close();
        }

        scanner.close();

    }
}
