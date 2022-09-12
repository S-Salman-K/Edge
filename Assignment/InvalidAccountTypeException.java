package Assignment;

public class InvalidAccountTypeException extends IllegalArgumentException{
    public InvalidAccountTypeException(String message){
        super(message);
    }
}
