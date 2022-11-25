package ca.durhamcollege.oop3200f2022week11b;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Vector2CanvasController implements Initializable
{

    @FXML
    private Button VectorListButton;

    @FXML
    void VectorListButton_Clicked(ActionEvent event) throws IOException
    {
        SceneManager.Instance().changeScene(event, "shape-view.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }
}