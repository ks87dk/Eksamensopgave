public class Lokale implements LokaleImpl
{
    public String getLokaleNavn() {
        return lokaleNavn;
    }

    public void setLokaleNavn(String lokaleNavn) {
        this.lokaleNavn = lokaleNavn;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String lokaleNavn;
    private String location;


}