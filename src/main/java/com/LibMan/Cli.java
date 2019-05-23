package com.LibMan;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cli {
    public static void main(String[] args) {

        //Test Ausweis
        Ausweis ausweis1 = new Ausweis();
        System.out.println("Ausweis1 leer: " + ausweis1.getAbaufDatum().toString() + " " + ausweis1.getAusweisID().toString());

        //Test Nutzer
        Nutzer nutzer1 = new Nutzer("heinz", LocalDate.now(), ausweis1);
        System.out.println("nutzer1, Name: Heinz: " + nutzer1.getName() + " " + nutzer1.ausweis.getAusweisID().toString() + " " + nutzer1.ausweis.getAbaufDatum());

        //Test Buch
        Buch buch1 = new Buch("Bibel", "Jebus", false);
        System.out.println(("buch1: Titel: " + buch1.getTitel() + " " + buch1.getAuthor() + " " + buch1.getAusleihbar().toString()));


        // Speichern der Ausleihen in zentralen Speicher
        ArrayList<Ausleihobject> speicher = new ArrayList<>();


        speicher.add(buch1.ausleihen(nutzer1));

        System.out.println(speicher.get(0).getBuch().getTitel());


    }
}
