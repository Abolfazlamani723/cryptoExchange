package MainPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class SignUpController {
    @FXML
    private TextField 
            firstNameTextField,
            lastNameTextField,
            usernameTextField,
            emailTextField,
            phoneNumberTextField,
            passwordTextField,
            repeatPasswordTextField,
            captchaTextField;

    @FXML 
    private Label
            firstNameMessage,
            lastNameMessage,
            usernameMessage,
            emailMessage,
            phoneNumberMessage,
            passwordMessage,
            repeatPasswordMessage,
            captchaMessage,
            profileImageName;
    
    @FXML 
    private Button
            pickFileButton,
            createMyAccountButton;
    
    @FXML
    public void checkEmail(KeyEvent event) {
        // String email = emailTextField.getText();
        // if (email.isEmpty() || !email.contains("@")) {
        //     emailMessage.setText("Invalid email format");
        // } else {
        //     emailMessage.setText("");
        // }
        emailMessage.setText("error");
    }

    @FXML
    public void afterPickFile(ActionEvent event) {
        // Add file picker logic here
        // Example: profileImageName.setText("Selected: image.png");
    }

    @FXML
    public void afterCreateMyAccount(ActionEvent event) {
        
    }
}