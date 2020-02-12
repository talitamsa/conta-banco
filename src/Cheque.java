public class Cheque {
    private double valor;
    private String bancoEmissor;
    private String dataDePagamento;

    public Cheque(double valor, String bancoEmissor, String dataDePagamento){
        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.dataDePagamento = dataDePagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public String getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(String dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }
}
