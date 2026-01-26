package exercicio1;

public class ProdutoImportado extends Produto {

    private double taxaAlfandega;

    public ProdutoImportado(String nome, double price, double taxaAlfandega) {
        super(nome, price);
        this.taxaAlfandega = taxaAlfandega;
    }

    public double precoTotal() {
        return getPrice() + taxaAlfandega;
    }

    @Override
    public String etiquetaPreco() {
        return getNome()
                + " $ "
                + String.format("%.2f", precoTotal())
                + " (Taxa alfândega: $ "
                + String.format("%.2f", taxaAlfandega)
                + ")";
    }
}
