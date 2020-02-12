public class Main {

    public static void main(String[] args){

        Cliente talita = new Cliente("1", "Maria", "1111", "1010");
        Corrente conta1 = new Corrente(talita, 1000);
        Poupanca conta2 = new Poupanca(talita, 1000, 3);

        Cheque cheque1 = new Cheque(10, "Banco Santander", "12/02/2020");
        conta1.depositarCheque(cheque1);
        conta1.consultaSaldo();
        conta1.saque(100);
        conta1.saque(2000);
        Cheque cheque2 = new Cheque(2000, "Banco Itáu", "01/02/2020");
        conta1.depositarCheque(cheque2);
        conta1.consultaSaldo();

    }
}
