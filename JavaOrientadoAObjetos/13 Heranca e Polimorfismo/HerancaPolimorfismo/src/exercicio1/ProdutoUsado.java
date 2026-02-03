package exercicio1;

import java.time.LocalDate;
import java.util.Date;

public class ProdutoUsado extends Produto {

    LocalDate dataFabricacao;

    public ProdutoUsado(String nome, double price, LocalDate dataFabricacao) {
        super(nome, price);
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
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

