package com.LibMan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;


public class Nutzer {

    private String name;

    private LocalDate geburtsdatum;
    private UUID nutzerID;



    private BigDecimal gebuehrenstand;
    private Ausweis ausweis;

    public Nutzer(String name, LocalDate geburtsdatum) {
        this.name = name;
        this.geburtsdatum = geburtsdatum;
        this.nutzerID = UUID.randomUUID();
        this.gebuehrenstand = new BigDecimal( "0.0" );
    }

    public boolean anmeldung() {
        Boolean authentifiziert = false;

        return authentifiziert;
    }


    public void setGebuehrenstand(BigDecimal gebuehrenstand) {
        //  a.compareTo(b);  // returns (-1 if a < b), (0 if a == b), (1 if a > b)
        // http://www.opentaps.org/docs/index.php/How_to_Use_Java_BigDecimal:_A_Tutorial
        if (gebuehrenstand.compareTo(new BigDecimal( "0.0" )) != -1){
            this.gebuehrenstand = gebuehrenstand;
        }
        //else return error
    }

    public String getName() {
        return name;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public UUID getNutzerID() {
        return nutzerID;
    }

    public BigDecimal getGebuehrenstand() {
        return gebuehrenstand;
    }
}
