public class Medlemmer extends Object {
    private String firmaNavn;
    private String eMail;
    private String kodeOrd;
    private int cvr;
    private String lokale;

    public String getFirmaNavn() {
        return firmaNavn;
    }

    public void setFirmaNavn(String firmaNavn) {
        this.firmaNavn = firmaNavn;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getKodeOrd() {
        return kodeOrd;
    }

    public void setKodeOrd(String kodeOrd) {
        this.kodeOrd = kodeOrd;
    }

    public int getCvr() {
        return cvr;
    }

    public void setCvr(int cvr) {
        this.cvr = cvr;
    }

    public String getLokale() {
        return lokale;
    }

    public void setLokale(String lokale) {
        this.lokale = lokale;
    }

    public String getLokaleBeskrivelse() {
        return lokaleBeskrivelse;
    }

    public void setLokaleBeskrivelse(String lokaleBeskrivelse) {
        this.lokaleBeskrivelse = lokaleBeskrivelse;
    }

    private String lokaleBeskrivelse;

    public Medlemmer(String firmaNavn, String eMail, String kodeOrd, int cvr, String lokale, String lokaleBeskrivelse) {
        this.firmaNavn = firmaNavn;
        this.eMail = eMail;
        this.kodeOrd = kodeOrd;
        this.cvr = cvr;
        this.lokale = lokale;
        this.lokaleBeskrivelse = lokaleBeskrivelse;
    }
    //new line
}
