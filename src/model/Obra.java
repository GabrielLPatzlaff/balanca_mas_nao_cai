package model;

import java.sql.Date;

public class Obra {

    private int idObra;
    private String descricao;
    private Date dtInicio;
    private Date dtFim;
    private int idEngenheiro;
    private String nrCrea;
    private Date dtDdmissaoEngenheiro;

    public Obra() {
    }

    public Obra(int idObra, String descricao, Date dtInicio, Date dtFim, int idEngenheiro, String nrCrea, Date dtDdmissaoEngenheiro) {
        this.idObra = idObra;
        this.descricao = descricao;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.idEngenheiro = idEngenheiro;
        this.nrCrea = nrCrea;
        this.dtDdmissaoEngenheiro = dtDdmissaoEngenheiro;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public int getIdEngenheiro() {
        return idEngenheiro;
    }

    public void setIdEngenheiro(int idEngenheiro) {
        this.idEngenheiro = idEngenheiro;
    }

    public String getNrCrea() {
        return nrCrea;
    }

    public void setNrCrea(String nrCrea) {
        this.nrCrea = nrCrea;
    }

    public Date getDtDdmissaoEngenheiro() {
        return dtDdmissaoEngenheiro;
    }

    public void setDtDdmissaoEngenheiro(Date dtDdmissaoEngenheiro) {
        this.dtDdmissaoEngenheiro = dtDdmissaoEngenheiro;
    }
}
