package com.LibMan;

import jdk.nashorn.internal.objects.NativeUint8Array;

import java.time.LocalDate;

public class Ausleihobject {

    private Buch buch;
    private Nutzer nutzer;
    private LocalDate rueckgabeDatum;
    private Boolean vorbestellt;

    public Ausleihobject() { }

    public Buch getBuch() { return buch; }

    public Nutzer getNutzer() { return nutzer; }

    public LocalDate getRueckgabeDatum() { return rueckgabeDatum; }

    public Boolean getVorbestellt() { return vorbestellt; }

    public void setBuch(Buch buch) { this.buch = buch; }

    public void setNutzer(Nutzer nutzer) { this.nutzer = nutzer; }

    public void setRueckgabeDatum(LocalDate rueckgabeDatum) { this.rueckgabeDatum = rueckgabeDatum; }

    public void setVorbestellt(Boolean vorbestellt) { this.vorbestellt = vorbestellt; }

}
