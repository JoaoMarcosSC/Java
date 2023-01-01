public class TestaBanco {
    public static void main(String[] args) {

        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silva";
        paulo.cpf = "111.111.111-11";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);
        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);

    }
}
