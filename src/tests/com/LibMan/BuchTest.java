package com.LibMan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BuchTest {

    @DisplayName("Erzeuge neue Bücher")
    @Test
    void neuesBuch() {
        Buch buch = new Buch("wie gehts karl", "heinz", false);
        assertEquals(buch.getAuthor(), "heinz");
        assertEquals(buch.getTitel(), "wie gehts karl");
        assertFalse(buch.getAusleihbar());
    }

    @Test
    void ausleihen() {
    }

    @Test
    void vorbestellen() {
    }

    @Test
    void zurueckgeben() {
    }

    @Test
    void verlaengern() {
    }

}