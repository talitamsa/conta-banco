public class Poupanca extends Conta {
    private double saldo;
    private double taxaDeJuros;

    public Poupanca(){

    }
    public Poupanca(Cliente cliente, double saldo, double taxaDeJuros){
        this.saldo = saldo;
        this.taxaDeJuros = taxaDeJuros;
    }

    public void recolheJuros(){
        if (this.saldo >= 0){
            this.saldo = taxaDeJuros*saldo+saldo;
            System.out.println("Seu saldo é: " + saldo);
        } else {
            System.out.println("Não possui juros a recolher!");
        }
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
}
