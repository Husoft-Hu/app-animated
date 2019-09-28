/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_animated;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author dell
 */
public class HomeController implements Initializable {
    
    @FXML
    private Circle c1;
     @FXML
    private Circle c2;
      @FXML
    private Circle c3;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    @FXML
    private void play(ActionEvent event){
            
        setRotate(c1,true,360,10);
        setRotate(c2,true,180,18);
        setRotate(c3,true,145,24);
    }
    
    private void setRotate(Circle c,boolean reverse,int angle,int duration){
        RotateTransition rt= new RotateTransition(Duration.seconds(duration),c);
        rt.setAutoReverse(reverse);
        rt.setByAngle(angle);
        rt.setDelay(Duration.seconds(0));
        rt.setRate(3);
        rt.setCycleCount(18);
        rt.play();
    }
    
    
    
    
    
}
