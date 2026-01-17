public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario nico = new Gerente();
        nico.setNome("Nico Santana");
        nico.setCpf("111.111.111-23");
        nico.setSalario(2600.00);
        System.out.println(nico.getBonificacao());
    }
}
