public class Corrente extends Conta {


    public Corrente(){

    }

    public Corrente(Cliente cliente, double saldo){
        super(cliente, saldo);

    }

    @Override
    public void saque(double valor) {
        Double saldo =  this.getSaldo();
        if (valor > saldo){
            saldo-=valor;
            this.setSaldo(saldo);
            System.out.println("Você acaba de entrar em cheque especial! Seu saldo é: " + saldo);
        } else {
            saldo-=valor;
            this.setSaldo(saldo);
            System.out.println("Saque realizado com sucesso! Seu saldo é: " + saldo);
        }
    }

    public void depositarCheque(Cheque cheque){
        double somaCheque = getSaldo() + cheque.getValor();
        setSaldo(somaCheque);
        System.out.println("Valor depositado com sucesso: " + cheque.getValor());
    }

    public void deposito(double valor){
        if (valor >= 0){
            Double saldo =  this.getSaldo();
            saldo += valor;
            this.setSaldo(saldo);
            System.out.println("Depósito realizado com sucesso!");
        }
    }
}
