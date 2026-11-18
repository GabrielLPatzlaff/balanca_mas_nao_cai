package model;

import java.sql.Date;

public class ObraEngenheiro {

    private int idObra;
    private int idEngenheiro;
    private Date dtAdmissaoEngenheiro;
    private Date dtInicioTrabalho;
    private Date dtFimTrabalho;
    private int idFuncao;

    public ObraEngenheiro() {
    }

    public ObraEngenheiro(int idObra, int idEngenheiro, Date dtAdmissaoEngenheiro, Date dtInicioTrabalho, Date dtFimTrabalho, int idFuncao) {
        this.idObra = idObra;
        this.idEngenheiro = idEngenheiro;
        this.dtAdmissaoEngenheiro = dtAdmissaoEngenheiro;
        this.dtInicioTrabalho = dtInicioTrabalho;
        this.dtFimTrabalho = dtFimTrabalho;
        this.idFuncao = idFuncao;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public int getIdEngenheiro() {
        return idEngenheiro;
    }

    public void setIdEngenheiro(int idEngenheiro) {
        this.idEngenheiro = idEngenheiro;
    }

    public Date getDtAdmissaoEngenheiro() {
        return dtAdmissaoEngenheiro;
    }

    public void setDtAdmissaoEngenheiro(Date dtAdmissaoEngenheiro) {
        this.dtAdmissaoEngenheiro = dtAdmissaoEngenheiro;
    }

    public Date getDtInicioTrabalho() {
        return dtInicioTrabalho;
    }

    public void setDtInicioTrabalho(Date dtInicioTrabalho) {
        this.dtInicioTrabalho = dtInicioTrabalho;
    }

    public Date getDtFimTrabalho() {
        return dtFimTrabalho;
    }

    public void setDtFimTrabalho(Date dtFimTrabalho) {
        this.dtFimTrabalho = dtFimTrabalho;
    }

    public int getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(int idFuncao) {
        this.idFuncao = idFuncao;
    }
}
