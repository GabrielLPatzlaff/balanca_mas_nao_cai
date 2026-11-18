package model;

import java.sql.Date;

public class ObraFase {

    private int idObra;
    private int idFase;
    private Date dtIniciofase;
    private Date dtTerminoFase;

    public ObraFase() {
    }

    public ObraFase(int idObra, int idFase, Date dtIniciofase, Date dtTerminoFase) {
        this.idObra = idObra;
        this.idFase = idFase;
        this.dtIniciofase = dtIniciofase;
        this.dtTerminoFase = dtTerminoFase;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public int getIdFase() {
        return idFase;
    }

    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }

    public Date getDtIniciofase() {
        return dtIniciofase;
    }

    public void setDtIniciofase(Date dtIniciofase) {
        this.dtIniciofase = dtIniciofase;
    }

    public Date getDtTerminoFase() {
        return dtTerminoFase;
    }

    public void setDtTerminoFase(Date dtTerminoFase) {
        this.dtTerminoFase = dtTerminoFase;
    }
}
