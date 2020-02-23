public class Produs {

    private String nume;
    private String descriere;
    private double pret;

    public double getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }

    public String getDescriere() {
        return descriere;
    }


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public Produs(String nume, String descriere, double pret) {
        this.nume = nume;
        this.descriere = descriere;
        this.pret = pret;
    }
}
