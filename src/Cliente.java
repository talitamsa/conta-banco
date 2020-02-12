public class Cliente {
    private String numeroDeCliente;
    private String sobrenome;
    private String rg;
    private String cpf;

    public Cliente(String numeroDeCliente, String sobrenome, String rg, String cpf){
        this.numeroDeCliente = numeroDeCliente;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(String numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
