/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Date;

/**
 *
 * @author J
 */
public class Czlowiek
{
    String imie,nazwisko;
    Date data_urodzenia;
    
    public Czlowiek()
    {
    
    }
    
    public Czlowiek(String imie, String nazwisko, Date data)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data;
    }
    void Dane()
    {
        System.out.println("Imie: " + imie + " Nazwisko: " + nazwisko + " Data urodzenia " + data_urodzenia);
    }
    
    
    
}
