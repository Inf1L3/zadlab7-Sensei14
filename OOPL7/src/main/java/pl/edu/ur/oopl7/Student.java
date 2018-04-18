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
public class Student extends Osoba {
    
    private int nrIndeksu;
    private String typStudiow;
    private String kierunek;
    private int rokStudiow;

    public Student(int nrIndeksu, String typStudiow, String kierunek, int rokStudiow, String imie, String nazwisko, int dataUrodzenia, String plec) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.nrIndeksu = nrIndeksu;
        this.typStudiow = typStudiow;
        this.kierunek = kierunek;
        this.rokStudiow = rokStudiow;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public String getKierunek() {
        return kierunek;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }
   
     public void getDaneS()
    {
        System.out.println("NrIndeksu: "+this.nrIndeksu);
        System.out.println("Typ studiów: "+this.typStudiow);
        System.out.println("Kierunek: "+this.kierunek);
        System.out.println("Rok Studiów"+ this.rokStudiow);
    }

    @Override
    public String toString() {
        return "Student{" + "nrIndeksu=" + nrIndeksu + ", typStudiow=" + typStudiow + ", kierunek=" + kierunek + ", rokStudiow=" + rokStudiow + '}'
                +super.toString();
                
    }
    
  
    
}
