package com.LibMan;

import java.util.ArrayList;

public class Speicher {

    private ArrayList<Ausleihobject> speicher = new ArrayList();

    public Speicher() {

    }

    public void speichern(Ausleihobject ausleihe) {
        speicher.add(ausleihe);
    }

    public Ausleihobject getAusleihe(){
        return this;
    }

}
