import modelo.Conta;

public class TestaExceptions {

    public static void main (String[] args){
        Conta conta = new ContaCorrente(212, 211);
        conta.deposita(200);

        conta.saca(198);

        System.out.println("Saldo da conta após concluir saque : "
                + conta.getSaldo());
    }
}
