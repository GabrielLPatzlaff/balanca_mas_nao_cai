package model;

import java.math.BigDecimal;
import java.sql.Date;

public class OrcamentoObra {

    private int idOrcamento;
    private int idObra;
    private Date dtInicio;
    private Date dtFim;
    private BigDecimal vlPrevisto;
    private BigDecimal vlRealizado;

    public OrcamentoObra() {
    }

    public OrcamentoObra(int idOrcamento, int idObra, Date dtInicio, Date dtFim, BigDecimal vlPrevisto, BigDecimal vlRealizado) {
        this.idOrcamento = idOrcamento;
        this.idObra = idObra;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.vlPrevisto = vlPrevisto;
        this.vlRealizado = vlRealizado;
    }

    public int getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(int idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
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

    public BigDecimal getVlPrevisto() {
        return vlPrevisto;
    }

    public void setVlPrevisto(BigDecimal vlPrevisto) {
        this.vlPrevisto = vlPrevisto;
    }

    public BigDecimal getVlRealizado() {
        return vlRealizado;
    }

    public void setVlRealizado(BigDecimal vlRealizado) {
        this.vlRealizado = vlRealizado;
    }
}
