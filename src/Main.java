public class Main {

    public static void main(String[] args){

        Cliente talita = new Cliente("1", "Maria", "1111", "1010");
        Corrente conta1 = new Corrente(talita, 1000);


        Cheque cheque1 = new Cheque(10, "Banco Santander", "12/02/2020");
        conta1.depositarCheque(cheque1);
    }
}
