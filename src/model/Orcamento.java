package model;

import java.sql.Date;

public class Orcamento {

    private int idOrcamento;
    private Date dtAprovacao;
    private int idEngenheiroResponsavel;

    public Orcamento() {
    }

    public Orcamento(int idOrcamento, Date dtAprovacao, int idEngenheiroResponsavel) {
        this.idOrcamento = idOrcamento;
        this.dtAprovacao = dtAprovacao;
        this.idEngenheiroResponsavel = idEngenheiroResponsavel;
    }

    public int getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(int idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public Date getDtAprovacao() {
        return dtAprovacao;
    }

    public void setDtAprovacao(Date dtAprovacao) {
        this.dtAprovacao = dtAprovacao;
    }

    public int getIdEngenheiroResponsavel() {
        return idEngenheiroResponsavel;
    }

    public void setIdEngenheiroResponsavel(int idEngenheiroResponsavel) {
        this.idEngenheiroResponsavel = idEngenheiroResponsavel;
    }
}
