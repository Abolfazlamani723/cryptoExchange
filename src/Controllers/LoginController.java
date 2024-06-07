package Controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class LoginController {
    @FXML
    private Button  loginButton,
                    signUpButton,
                    forgetPasswordButton;
    @FXML
    private PasswordField   passwordPasswordField,
                            captchaCodePasswordField;

    @FXML
    private TextField usernameTextField; 
    public void checkUsername(KeyEvent event){

    }      
    public void checkPassword(KeyEvent event){

    }
    public void afterLogin(ActionEvent event){

    }
    public void afterSignUp(ActionEvent event){

    }
    public void afterForgetPassword(ActionEvent event){
        
    }
                        
}

