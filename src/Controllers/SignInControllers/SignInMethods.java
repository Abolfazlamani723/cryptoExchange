package Controllers.SignInControllers;

public class SignInMethods {

    public boolean isValid(String input, String regex){
        return input.matches(regex);
    }

    public boolean isEmailValid(String input){
        return isValid(input, "^[a-zA-Z]{1,1}[a-zA-Z0-9-_.]{4,63}@[a-zA-Z]+\\.[a-zA-z]+$");
    }

    public boolean isUserNameValid(String input){
        return isValid(input, "[a-zA-Z]{1,1}[a-zA-Z0-9-_.#$&*%]{2,12}");
    }

    public boolean isPasswordValid(String input){
        return isValid(input, "^[a-zA-Z0-9]{5,15}$");
    }

    public boolean isNameValid(String input){
        return isValid(input, "^[a-zA-Z ]{2,20}$");
    }

    public boolean isPhoneNumberValid(String input){
        return isValid(input, "^[0-9]{4,10}$");
    }
}
