package br.edu.unifeg.ccomp.projeto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
public class OrcamentoImposto {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private long orcamento_id;
    private float imposto;
    private float taxa;

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

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }


}
