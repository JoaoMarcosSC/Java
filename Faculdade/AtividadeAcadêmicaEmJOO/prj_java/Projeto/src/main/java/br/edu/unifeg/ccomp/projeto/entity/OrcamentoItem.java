package br.edu.unifeg.ccomp.projeto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
public class OrcamentoItem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private long orcamento_id;
    private long produto_id;
    private int qtd;
    private float valor_unitario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrcamento_id() {
        return orcamento_id;
    }

    public void setOrcamento_id(long orcamento_id) {
        this.orcamento_id = orcamento_id;
    }

    public long getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(long produto_id) {
        this.produto_id = produto_id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }


}
