package Controllers.SignInControllers;

public class SignInMethods {

    public boolean isValid(String input, String regex){
        return input.matches(regex);
    }
    public boolean isEmailValid(String input){
        return isValid(input, "^[a-zA-Z]{1,1}[a-zA-Z0-9-_.]{4,63}@[a-zA-Z]+\\.[a-zA-z]+$");
    }
}
