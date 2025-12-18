package com.example.pobudatesticek;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.lang.reflect.Field;

public class HelloController {
    @FXML
    private ListView<Ucitel> ucitel;
    private Label jmenoLabel, predmetLabel, hodnoceniLabel;
    private Field hodnoceniField;

    @FXML
    private void initialize() {
        ucitel.getItems().add(new Ucitel("Pepa","Matika",6));
        ucitel.getItems().add(new Ucitel("Franta","Tělocvik",2));
        ucitel.getItems().add(new Ucitel("Lojza","Dějepis",7));
        ucitel.getItems().add(new Ucitel("Honza","Fyzika",8));
        ucitel.getItems().add(new Ucitel("Dominik","Programování",10));
        ucitel.getItems().add(new Ucitel("Jana","Čeština",3));
    }

    @FXML
    private void jmenoClick() {
        try{
            Ucitel vybrany = ucitel.getSelectionModel().getSelectedItem();
            jmenoLabel.setText("Jméno: " + vybrany.getJmeno());
            predmetLabel.setText("Predmet: " + vybrany.getPredmet());
            hodnoceniLabel.setText("Hodnoceni: " + vybrany.getHodnoceni());
        } catch (Exception e) {
            System.out.println("Chyba: " +e.getMessage());
        }
    }

    @FXML
    private void upravHodnoceni(){
        try{
            Ucitel vybrany = ucitel.getSelectionModel().getSelectedItem();
            String hodnoceni = hodnoceniField.get(vybrany).toString();
            if(hodnoceni==null || hodnoceni.isBlank())return;
            vybrany.setJmeno(hodnoceni);
            ucitel.refresh();
        }catch(Exception e){
            System.out.println("Chyba"+e.getMessage());
        }
    }
}

