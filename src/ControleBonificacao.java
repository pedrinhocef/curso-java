import modelo.Funcionario;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f) {
        double bonificacao = f.getBonificao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
