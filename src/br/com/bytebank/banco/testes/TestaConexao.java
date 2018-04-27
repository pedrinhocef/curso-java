package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conexao;

public class TestaConexao {

    public static void main(String[] args) {


        /* Try with resources a partir do java 1.7
        implements AutoCloseable
        atomaticamente é criado um bloco finally.
        Nele é chamado o método close() do recurso.
        */
        try (Conexao con = new Conexao()) {
            con.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro");
        }

        /* Bloco try/catch antigo
         */
        Conexao conexao = null;
        try {
            conexao = new Conexao();
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu Erro");
        } finally {
            if (conexao != null) {
                conexao.close();
            }
        }
    }
}


