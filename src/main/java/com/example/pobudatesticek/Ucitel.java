package com.example.pobudatesticek;

public class Ucitel {
    public String jmeno;
    public String predmet;
    public int hodnoceni;

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public void setHodnoceni(int hodnoceni) {
        this.hodnoceni = hodnoceni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPredmet() {
        return predmet;
    }

    public int getHodnoceni() {
        return hodnoceni;
    }

    public Ucitel(String jmeno, String predmet, int hodnoceni) {
        this.jmeno = jmeno;
        this.predmet = predmet;
        this.hodnoceni = hodnoceni;
    }
    @Override
    public String toString() {
        return jmeno;
    }
}
