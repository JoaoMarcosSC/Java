public class TestaConexao {
    public static void main(String[] args) {


        try (Conexao conexao = new Conexao()){
            conexao.leDados();
        } catch (IllegalStateException ex){
            System.out.println("Deu erro na conexão");
        }

//        Conexao Con = null;
//        try {
//            Con = new Conexao();
//            Con.leDados();
//        } catch (IllegalStateException ex) {
//            System.out.println("Deu erro na conexão");
//        } finally {
//            System.out.println("Finally");
//            if (Con !=null) {
//                Con.close();
//            }
//        }
    }
}