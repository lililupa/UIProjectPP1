package org.example.uiprojectpp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import org.example.uiprojectpp.services.CalculateFromTextFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HelloController {
    @FXML
    public TextArea textAreaResult;

    @FXML
    public void onClickPolishNotationTXT(ActionEvent actionEvent) {
//        transformInformationToFile();
        String transformedString = new CalculateFromTextFile().transformInformationToFile();
        textAreaResult.setText(transformedString);
    }
}