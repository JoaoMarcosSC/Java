public class TestaGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Abelha");
        g1.setSalario(5000.0);

        g1.setSenha(1313);
        boolean autentica = g1.autentica(1313);
        System.out.println(autentica);
        System.out.println(g1.getBonificacao());

    }
}
