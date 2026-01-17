public class TesteSistema {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(1313);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);

        Administrador adm = new Administrador();
        adm.setSenha(1313);
        si.autentica(adm);
    }
}
