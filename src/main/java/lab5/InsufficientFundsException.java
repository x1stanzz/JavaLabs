package lab5;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException (String message){
        super(message);
    }
}
