package br.edu.unifeg.ccomp.projeto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
public class Orcamento {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private long cliente_id;
    private int numero;
    private String data_orcamento;
    private String comentario;
    private float valor_itens;
    private float valor_imposto;
    private float valor_liquido;
    private String data_venda;
    private String data_fatura;
    private long nro_nf;
    private String data_entrega;
    private String data_pagamento;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(long cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData_orcamento() {
        return data_orcamento;
    }

    public void setData_orcamento(String data_orcamento) {
        this.data_orcamento = data_orcamento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public float getValor_itens() {
        return valor_itens;
    }

    public void setValor_itens(float valor_itens) {
        this.valor_itens = valor_itens;
    }

    public float getValor_imposto() {
        return valor_imposto;
    }

    public void setValor_imposto(float valor_imposto) {
        this.valor_imposto = valor_imposto;
    }

    public float getValor_liquido() {
        return valor_liquido;
    }

    public void setValor_liquido(float valor_liquido) {
        this.valor_liquido = valor_liquido;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public String getData_fatura() {
        return data_fatura;
    }

    public void setData_fatura(String data_fatura) {
        this.data_fatura = data_fatura;
    }

    public long getNro_nf() {
        return nro_nf;
    }

    public void setNro_nf(long nro_nf) {
        this.nro_nf = nro_nf;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }


}
