public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta na agência " + this.agencia +
            " de número " + this.agencia);
    }

    public abstract void deposita(double valor);

    public void saca (double valor){
        if (this.saldo < valor){
            throw new SaldoInsuficienteException("Salado Insuficiente");
        }

        this.saldo -= valor;
    }

    public void tranfere (double valor, Conta destino) {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("Não é permitido 0 ou valores negativos");
            return;
        }else {
            this.numero = numero;
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("Não é permitido 0 ou valores negativos");
            return;
        }else {
            this.agencia = agencia;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}
