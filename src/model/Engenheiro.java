package model;

import java.sql.Date;

public class Engenheiro {

    private int idEngenheiro;
    private String dsNome;
    private String nrCREA;
    private Date dtAdmissao;

    public Engenheiro() {
    }

    public Engenheiro(int idEngenheiro, String dsNome, String nrCREA, Date dtAdmissao) {
        this.idEngenheiro = idEngenheiro;
        this.dsNome = dsNome;
        this.nrCREA = nrCREA;
        this.dtAdmissao = dtAdmissao;
    }

    public int getIdEngenheiro() {
        return idEngenheiro;
    }

    public void setIdEngenheiro(int idEngenheiro) {
        this.idEngenheiro = idEngenheiro;
    }

    public String getDsNome() {
        return dsNome;
    }

    public void setDsNome(String dsNome) {
        this.dsNome = dsNome;
    }

    public String getNrCREA() {
        return nrCREA;
    }

    public void setNrCREA(String nrCREA) {
        this.nrCREA = nrCREA;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }
}
