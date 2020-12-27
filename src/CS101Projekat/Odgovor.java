package CS101Projekat;

import java.io.Serializable;

public class Odgovor implements Serializable {
    private String odgovor;
    private boolean jeTacan;

    Odgovor(String odgovor, boolean jeTacan){
        this.odgovor = odgovor;
        this.jeTacan = jeTacan;
    }

    public void setOdgovor(String odgovor) {
        this.odgovor = odgovor;
    }

    public void setJeTacan(boolean jeTacan) {
        this.jeTacan = jeTacan;
    }

    public String getOdgovor() {
        return odgovor;
    }

    public boolean getjeTacan() {
        return jeTacan;
    }

    @Override
    public String toString() {
        return "Odgovor{" +
                "odgovor='" + odgovor + '\'' +
                ", jeTacan=" + jeTacan +
                '}';
    }
}