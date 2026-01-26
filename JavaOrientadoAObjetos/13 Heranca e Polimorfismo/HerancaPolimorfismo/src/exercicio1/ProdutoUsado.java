package exercicio1;

import java.util.Date;

public class ProdutoUsado extends Produto {

    Date dataFabricacao;

    public ProdutoUsado(String nome, double price, Date dataFabricacao) {
        super(nome, price);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiquetaPreco() {
        return getNome()
                + " $ "
                + String.format("%.2f", getPrice())
                + " (Data Fabricaçao"
                +  dataFabricacao
                + ")";
    }
}

