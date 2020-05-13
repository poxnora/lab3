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
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Date date = new Date(11,12,1987);
        Czlowiek czlowiek = new Czlowiek("A" ,"B",date);
        czlowiek.Dane();
    }
    
}
