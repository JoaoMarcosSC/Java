public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(1337, 24226);
        conta.setAgencia(-50);
        conta.setNumero(0);

        Conta conta1 = new Conta(1337, 2555);
        System.out.println(Conta.getTotal());
    }
}
