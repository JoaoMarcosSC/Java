public class TesteReferencia {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo da primeira conta: " + primeiraConta);

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta);

        if (primeiraConta == segundaConta){
            System.out.println("São a mesma conta");
        }else{
            System.out.println("São contas diferentes");
        }
    }

}
