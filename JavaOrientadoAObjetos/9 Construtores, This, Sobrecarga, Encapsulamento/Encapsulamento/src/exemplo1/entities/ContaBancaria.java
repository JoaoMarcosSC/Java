package exemplo1.entities;

public class ContaBancaria {

    private int nrConta;
    private String nmConta;
    private String saldoInicial;
    private double vlSaldo;

    public ContaBancaria(int nrConta, String nmConta, String saldoInicial, double vlSaldo) {
        this.nrConta = nrConta;
        this.nmConta = nmConta;
        this.saldoInicial = saldoInicial;
        this.vlSaldo = vlSaldo;
    }

    public ContaBancaria(int nrConta, String nmConta, String saldoInicial) {
        this.nrConta = nrConta;
        this.nmConta = nmConta;
        this.saldoInicial = saldoInicial;
    }

    public void Deposito(double vlSaldo){
        this.vlSaldo += vlSaldo;
    }

    public void Saque(double vlSaldo){
        this.vlSaldo -= vlSaldo;
    }
    public int getNrConta() {
        return nrConta;
    }

    public String getNmConta() {
        return nmConta;
    }

    public void setNmConta(String nmConta) {
        this.nmConta = nmConta;
    }

    public String getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(String saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getVlSaldo() {
        return vlSaldo;
    }


}
