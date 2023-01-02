public class Cliente implements Autenticavel{

    private AutenticacaoUtil autenticador;

    public Cliente(){
        this.autenticador = new AutenticacaoUtil();
    }
    @Override
    public boolean autentica(int senha) {
        boolean autenticou = this.autenticador.autentica(senha);
        return autenticou;
    }

    @Override
    public int getSenha() {
        return 0;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
}
