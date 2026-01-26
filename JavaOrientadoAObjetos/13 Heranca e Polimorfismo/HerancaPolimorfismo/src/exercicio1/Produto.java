package exercicio1;

public class Produto {

    private String nome;
    private double price;

    public Produto(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public String etiquetaPreco() {
        return nome + " $ " + String.format("%.2f", price);
    }
}
