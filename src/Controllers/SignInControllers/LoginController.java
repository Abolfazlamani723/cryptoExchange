package Controllers.SignInControllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class LoginController extends SignInMethods{
    @FXML
    private Button  
            loginButton,
            signUpButton,
            forgetPasswordButton;
    @FXML
    private PasswordField  
            passwordPasswordField,
            captchaCodePasswordField;
    @FXML
    private Label   
            usernameMessage,
            passwordMessage,
            captchaCodeMessage;

    @FXML
    private TextField usernameTextField; 


    public void checkUsername(KeyEvent event){
        String input = usernameTextField.getText();
        String regex = "^[a-zA-Z]{1,1}[a-zA-Z0-9-_.#$&*%]{2,12}$";
        if(!isValid(input, regex)){
                usernameMessage.setText("Error");
        }
    }

    public void checkPassword(KeyEvent event){
        String input = passwordMessage.getText();
        if(!isEmailValid(input)){
                passwordMessage.setText("Error");
        }
    }

    public void afterLogin(ActionEvent event){

    }

    public void afterSignUp(ActionEvent event){

    }

    public void afterForgetPassword(ActionEvent event){

    }
                        
}

