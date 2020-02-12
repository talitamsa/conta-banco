public class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta(){

    }

    public Conta(Cliente cliente, double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void saque(double valor){
        if (this.saldo>=valor){
            this.saldo-=valor;
            System.out.println("Saldo atual "+ this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposito(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    public void consultaSaldo(){
        System.out.println("Seu saldo é: " + this.saldo);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
