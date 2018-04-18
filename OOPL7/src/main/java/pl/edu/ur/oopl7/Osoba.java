/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class Osoba {
    
    private String imie;
    private String nazwisko;
    private int dataUrodzenia;
    private String plec;

    public Osoba(String imie, String nazwisko, int dataUrodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataUrodzenia(int dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Osoba{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", dataUrodzenia=" + dataUrodzenia + ", plec=" + plec + '}';
    }
    
    
    
    
    
    
    
}
