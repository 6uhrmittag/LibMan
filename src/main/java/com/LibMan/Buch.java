package com.LibMan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class Buch {

    private String author = null;
    private String titel = null;
    private UUID buchID = null;
    private Boolean ausleihbar = false;

    public Buch(String titel, String author, Boolean ausleihbar) {
        this.titel = titel;
        this.author = author;
        this.ausleihbar = ausleihbar;
        this.buchID = UUID.randomUUID();
    }

    public Ausleihobject ausleihen(Nutzer nutzer) {

        return new Ausleihobject(this, nutzer, LocalDate.now().plusWeeks(2));
    }

    public void vorbestellen(

    ) {
    }

    public void zurueckgeben() {
    }

    public void verlaengern() {
    }

    public String getAuthor() {
        return author;
    }

    public String getTitel() {
        return titel;
    }

    public UUID getBuchID() {
        return buchID;
    }

    public Boolean getAusleihbar() {
        return ausleihbar;
    }
}
