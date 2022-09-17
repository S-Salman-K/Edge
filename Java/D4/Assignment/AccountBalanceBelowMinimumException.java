package Assignment;

public class AccountBalanceBelowMinimumException extends Exception{
    public AccountBalanceBelowMinimumException(String message){
        super(message);
    }
}
