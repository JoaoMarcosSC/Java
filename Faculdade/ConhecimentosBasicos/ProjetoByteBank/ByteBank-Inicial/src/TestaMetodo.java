public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 50;
        contaDoPaulo.titular = "Paulo Silva";

        contaDoPaulo.deposita(50);
        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(conseguiuRetirar);
        System.out.println(contaDoPaulo.saldo);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.saldo = 100;
        contaDaMarcela.titular = "Marcela Souza";

        contaDaMarcela.deposita(50);
        System.out.println(contaDaMarcela.saldo);

        if (contaDaMarcela.tranfere(50, contaDoPaulo)){
            System.out.println("Tranferencia realizada com sucesso");
        }else{
            System.out.println("Erro na Tranferencia");
        }

        System.out.println(contaDoPaulo.saldo);
        System.out.println(contaDaMarcela.saldo);

    }
}
