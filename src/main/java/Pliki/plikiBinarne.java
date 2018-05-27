package Pliki;

import model.Sklep;

import java.io.*;

public class plikiBinarne implements OperacjePlikowe {


    //InputString OutputString - pliki binarne
    //Reader (Scanner), Writer - pliki tekstowe
    public void zapisz(Sklep sklep) throws IOException {
        FileOutputStream fos = new FileOutputStream("sklep.bin");
        ObjectOutputStream ous = new ObjectOutputStream(fos);//bierze sklep zamienia na bajty i zapisuje do pliku bin

        ous.writeObject(sklep);

        ous.close();
        fos.close();

    }
    public Sklep wczytaj() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("sklep.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Sklep sklep = (Sklep)ois.readObject();

        ois.close();
        fis.close();
return sklep;
    }
}
