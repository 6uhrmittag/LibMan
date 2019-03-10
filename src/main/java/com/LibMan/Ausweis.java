package com.LibMan;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

public class Ausweis {

    private UUID AusweisID;
    private LocalDate AbaufDatum;
    private Boolean gesperrt;

    public Ausweis() {
        this.AusweisID = UUID.randomUUID();
        this.AbaufDatum = LocalDate.now().plusYears(1);
        this.gesperrt = false;
    }

    public UUID getAusweisID() {
        return this.AusweisID;
    }

    public LocalDate getAbaufDatum() {
        return this.AbaufDatum;
    }

    public void setAbaufDatum(LocalDate abaufDatum) {
        this.AbaufDatum = abaufDatum;
    }

    public void sperren() {
        this.gesperrt = true;
    }

    public void entsperren() {
        this.gesperrt = false;
    }

    public boolean istGesperrt() {
        return this.gesperrt;
    }

}
