package com.LibMan;

import java.time.LocalDate;

public class Cli {
    public static void main(String[] args) {

        //Test Ausweis
        Ausweis ausweis1 = new Ausweis();
        System.out.println("Ausweis1 leer: " + ausweis1.getAbaufDatum().toString() + " " + ausweis1.getAusweisID().toString());

        //Test Nutzer
        Nutzer nutzer1 = new Nutzer("heinz", LocalDate.now(), ausweis1);
        System.out.println("nutzer1, Name: Heinz: " + nutzer1.getName() + " " + nutzer1.ausweis.getAusweisID().toString() + " " + nutzer1.ausweis.getAbaufDatum());


    }
}
