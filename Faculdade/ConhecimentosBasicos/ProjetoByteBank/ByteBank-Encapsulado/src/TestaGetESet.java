public class TestaGetESet {
    public static void main(String[] args) {

        Conta conta = new Conta(234,555);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silva");

        conta.setTitular(paulo);
        conta.getTitular().setProfissao("Programdor");

        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getProfissao());
    }
}
