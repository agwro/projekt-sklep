package Pliki;

import model.Sklep;

public interface OperacjePlikowe {

    public void zapisz(Sklep sklep) throws Exception;

    Sklep wczytaj() throws Exception;

    default void wyswietl() {

    }


}
