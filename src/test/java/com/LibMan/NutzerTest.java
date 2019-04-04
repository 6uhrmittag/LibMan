package com.LibMan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.math.BigDecimal;

@DisplayName("Teste Klasse Nutzer")
class NutzerTest {

    @DisplayName("Erzeuge neue Nutzer")
    @ParameterizedTest
    @ValueSource(strings = { "hans", "tim" })
    void createNewNutzer(String name) {
        Nutzer nutzer = new Nutzer(name, LocalDate.now(), new Ausweis());
        assertEquals(nutzer.getGeburtsdatum(), LocalDate.now());
        assertEquals(nutzer.getName(), name);
        assertEquals(nutzer.getGebuehrenstand(), new BigDecimal("0.0"));
    }

    @DisplayName("Addiere positive Gebühren")
    @ParameterizedTest
    @ValueSource(strings = { "1.0", "1.5", "2.0" })
    void setGebuehrenstandToPositive(String value) {
        Nutzer nutzer = new Nutzer("hans", LocalDate.now(), new Ausweis());
        assertEquals(nutzer.getGebuehrenstand(), new BigDecimal("0.0"));
        nutzer.setGebuehrenstand(new BigDecimal(value));
        assertEquals(nutzer.getGebuehrenstand(), new BigDecimal(value));
    }

    @DisplayName("Erlaube keine negative Gebühren.")
    @ParameterizedTest
    @ValueSource(strings = { "-0.1", "-1.0", "-1.5", "-2.0" })
    void setGebuehrenstandToNegative(String value) {
        Nutzer nutzer = new Nutzer("hans", LocalDate.now(), new Ausweis());
        assertEquals(nutzer.getGebuehrenstand(), new BigDecimal("0.0"));
        nutzer.setGebuehrenstand(new BigDecimal(value));
        assertEquals(nutzer.getGebuehrenstand(), new BigDecimal("0.0"));
    }
}