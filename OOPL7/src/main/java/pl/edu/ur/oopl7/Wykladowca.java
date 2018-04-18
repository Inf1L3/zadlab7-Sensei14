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
public class Wykladowca extends Osoba{
    
    private int nrIndeksu;
    private String stopien;
    private String email;
    private String katedra;

    public Wykladowca(int nrIndeksu, String stopien, String email, String katedra, String imie, String nazwisko, int dataUrodzenia, String plec) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.nrIndeksu = nrIndeksu;
        this.stopien = stopien;
        this.email = email;
        this.katedra = katedra;
    }

    @Override
    public String toString() {
        return "Wykladowca{" + "nrIndeksu=" + nrIndeksu + ", stopien=" + stopien + ", email=" + email + ", katedra=" + katedra + '}' + super.toString();
    }
    
    
    
    
    
}
