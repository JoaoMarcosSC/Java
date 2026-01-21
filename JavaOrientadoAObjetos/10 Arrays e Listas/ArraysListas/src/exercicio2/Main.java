package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int qtdPessoas = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++) {

            System.out.println("Nome:");
            String nome = sc.next();

            System.out.println("Idade:");
            int idade = sc.nextInt();

            System.out.println("Altura:");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double somaAlturas = 0.0;
        for (int i = 0; i < qtdPessoas; i++) {
            somaAlturas += pessoas[i].getAltura();
        }

        double mediaAltura = somaAlturas / qtdPessoas;
        System.out.printf("Altura média: %.2f%n", mediaAltura);

        int pMenor16 = 0;
        for (int i = 0; i < qtdPessoas; i++) {
            if (pessoas[i].getIdade() < 16) {
                pMenor16++;
            }
        }

        System.out.println("Pessoas com menos de 16: " + pMenor16);

        sc.close();
    }
}
