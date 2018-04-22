import modelo.CalculadorDeImposto;

public class TesteTributaveis{

    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.registra(cc);

        System.out.println(calc.getTotalImposto());
    }
}