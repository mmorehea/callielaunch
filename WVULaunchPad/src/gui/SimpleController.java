package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;


public class SimpleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addAxonButton;

    @FXML
    private Button addBodyButton;

    @FXML
    private Button addDendriteButton;

    @FXML
    private Button addInputButton;

    @FXML
    private Button addNucleusButton;

    @FXML
    private ListView<?> cellList;

    @FXML
    private TextField currentCellName;

    @FXML
    private ListView<?> dendriteList;

    @FXML
    private ListView<?> inputList;

    @FXML
    private Button launchButton;

    @FXML
    private Button newCellButton;

    @FXML
    private Button removeAxonButton;

    @FXML
    private Button removeBodyButton;

    @FXML
    private Button removeDendriteButton;

    @FXML
    private Button removeInputButton;

    @FXML
    private Button removeNucleusButton;

    @FXML
    private Button saveCellButton;

    @FXML
    private TreeView<?> setView;


    @FXML
    void getPath(ActionEvent event) {
    }

    @FXML
    void saveCell(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert addAxonButton != null : "fx:id=\"addAxonButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert addBodyButton != null : "fx:id=\"addBodyButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert addDendriteButton != null : "fx:id=\"addDendriteButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert addInputButton != null : "fx:id=\"addInputButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert addNucleusButton != null : "fx:id=\"addNucleusButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert cellList != null : "fx:id=\"cellList\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert currentCellName != null : "fx:id=\"currentCellName\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert dendriteList != null : "fx:id=\"dendriteList\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert inputList != null : "fx:id=\"inputList\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert launchButton != null : "fx:id=\"launchButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert newCellButton != null : "fx:id=\"newCellButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert removeAxonButton != null : "fx:id=\"removeAxonButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert removeBodyButton != null : "fx:id=\"removeBodyButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert removeDendriteButton != null : "fx:id=\"removeDendriteButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert removeInputButton != null : "fx:id=\"removeInputButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert removeNucleusButton != null : "fx:id=\"removeNucleusButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert saveCellButton != null : "fx:id=\"saveCellButton\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";
        assert setView != null : "fx:id=\"setView\" was not injected: check your FXML file 'wvuLaunchpad.fxml'.";


    }

}
