package anki.Super;

public class Pessoa {
    String nome;

    // Construtor da superclasse
    Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Construtor de Pessoa chamado");
    }

    // Método da superclasse
    void apresentar() {
        System.out.println("Meu nome é " + nome);
    }
}
