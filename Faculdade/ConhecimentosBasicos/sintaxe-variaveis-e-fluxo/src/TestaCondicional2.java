public class TestaCondicional2 {

    public static void main(String[] args) {

        int idade = 16;
        int quantidadeDePessoas = 3;
        boolean acompanhado = quantidadeDePessoas >=2;

        if (idade >= 18 || acompanhado){
            System.out.println("Seja bem vindo a festa!");

        }else {
            System.out.println("Infelizmente não pode entrar");
        }
    }
}
