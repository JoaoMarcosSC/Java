package anki.Super;

public class Aluno extends Pessoa {

    int matricula;

    // Construtor da subclasse chamando o construtor da superclasse
    Aluno(String nome, int matricula) {
        super(nome); // chama o construtor da classe Pessoa
        this.matricula = matricula;
        System.out.println("Construtor de Aluno chamado");
    }

    // Método sobrescrito
    @Override
    void apresentar() {
        super.apresentar(); // chama o método da superclasse
        System.out.println("Minha matrícula é " + matricula);
    }
}
