package cz.itnetwork;

/**
 * Třída sloužící k inicializaci pojištěnce
 */
public class Pojistenec {
    private String jmeno;
    private String prijmeni;
    private String telefon;

    private int vek;

    /**
     * Kontruktor pojištěnce
     *
     * @param jmeno    jméno pojištěnce
     * @param prijmeni příjmení pojištěnce
     * @param vek      věk pojištěnce
     * @param telefon  telefon pojištěnce
     */
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefon = telefon;
        this.vek = vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    /**
     * Metodá, která vrací jméno, příjmení, věk a telefon pojištěnce
     *
     * @return jméno, prijmeni, vek, telefon
     */
    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " " + vek + "    " + telefon;
    }
}


