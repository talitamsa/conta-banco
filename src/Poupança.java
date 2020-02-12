public class Poupança extends Conta {
    private double saldo;
    private double taxaDeJuros;
    private Cliente cliente;

    public Poupança{

    }
    public Poupança(Cliente cliente, double saldo, double taxaDeJuros){
        this.cliente = cliente;
        this.saldo = saldo;
        this.taxaDeJuros = taxaDeJuros;
    }

    public double recolheJuros(double taxaDeJuros, double saldo){
        if (saldo >= 0){
            return
        }
    }
}
