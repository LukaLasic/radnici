package radniciPaket;

import jdk.jfr.Percentage;

import java.util.Date;

public class Radnik {
    String ime;
    String prezime;
    double placa;

    String datum;
    double postotak;


    public Radnik() {

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }


    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public double getPlaca() {
        return placa;
    }

    public void setPlaca(double placa) {
        this.placa = placa;
    }

    public double getPostotak() {
        return postotak;
    }

    public void setPostotak(double postotak) {
        this.postotak = postotak;
    }


    public Radnik(String ime, String prezime, int placa, String datum) {
        this.ime = ime;
        this.prezime = prezime;
        this.placa = placa;
        this.datum =datum;
    }

    @Override
    public String toString() {
        return
                "Ime: " + ime +
                ", Prezime: " + prezime +
                ", Plaća: " + placa +
                ", Datum zaposlenja: " + datum;
    }
    public void PovecajPlacu (double postotak){
        double a=postotak/100;
        double b=placa*a;
        placa=placa+b;
        //
    }





}
