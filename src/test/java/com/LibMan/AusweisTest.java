package com.LibMan;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

class AusweisTest {


    @Test
    void createNewAusweis(){
        Ausweis ausweis = new Ausweis();
        assertEquals(ausweis.getAbaufDatum(), LocalDate.now().plusYears(1) );
        assertThat(ausweis.getAusweisID(), instanceOf(java.util.UUID.class));
    }

    @Test
    void setAbaufDatum() {
        Ausweis ausweis = new Ausweis();
        assertEquals(ausweis.getAbaufDatum(), LocalDate.now().plusYears(1) );
        ausweis.setAbaufDatum(LocalDate.now().plusYears(3));
        assertEquals(ausweis.getAbaufDatum(), LocalDate.now().plusYears(3) );

    }

    @Test
    void sperren() {
        Ausweis ausweis = new Ausweis();
        assertFalse(ausweis.istGesperrt());
        ausweis.sperren();
        assertTrue(ausweis.istGesperrt());
    }

    @Test
    void entsperren() {
        Ausweis ausweis = new Ausweis();
        assertFalse(ausweis.istGesperrt());

        ausweis.sperren();
        assertTrue(ausweis.istGesperrt());

        ausweis.entsperren();
        assertFalse(ausweis.istGesperrt());
    }

    @Test
    void istGesperrt() {
        Ausweis ausweis = new Ausweis();
        assertFalse(ausweis.istGesperrt());

        ausweis.sperren();
        assertTrue(ausweis.istGesperrt());

        ausweis.entsperren();
        assertFalse(ausweis.istGesperrt());
    }
}