import exception.SaldoInsuficienteException;
import modelo.Conta;

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
