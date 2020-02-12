public class Poupanca extends Conta {
    private double taxaDeJuros;

    public Poupanca(){

    }
    public Poupanca(Cliente cliente, double saldo, double taxaDeJuros){
        super(cliente, saldo);
        this.taxaDeJuros = taxaDeJuros;

    }

    public void recolheJuros(){
        Double saldo =  this.getSaldo();
        if (saldo >= 0){
            saldo = (taxaDeJuros*saldo)+saldo;
            this.setSaldo(saldo);
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
