package com.LibMan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;

import javafx.scene.Scene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

// Test HowTo
// https://github.com/TestFX/TestFX

@ExtendWith(ApplicationExtension.class)
class MainTest{

    /**
     * Will be called with {@code @Before} semantics, i. e. before each test method.
     *
     * @param primaryStage - Will be injected by the test runner.
     */
    @Start
    private void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/GUI.fxml"));
        primaryStage.setTitle("LibMan - Bibliotheksmanagement");
        primaryStage.setScene(new Scene(root));
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.toFront();
    }

    /**
     * @param robot - Will be injected by the test runner.
     */
    @Test
    void should_contain_button_with_text(FxRobot robot) {
        FxAssert.verifyThat("#btnAusleihen", LabeledMatchers.hasText("Ausleihen"));
    }
}