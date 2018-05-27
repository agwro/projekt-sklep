package model;

import java.math.BigDecimal;

public class Komputer extends Produkt { //to znaczy że klada komputer dziedziczy z klasy produkt
                                       // (rozszerza produkt czyli dzieciczy wszystkie jego metody składowe i dodaje coś od siebiwe)

    private String marka;
    private int ram;

    public Komputer(String nazwa, BigDecimal cena, String marka, int ram) {
        super(nazwa,cena);
        this.marka = marka;
        this. ram = ram;


    }


    public String getMarka() {
        return marka;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", marka='" + marka + '\'' +
                ", ram=" + ram +
                '}';
    }
}
