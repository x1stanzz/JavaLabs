package lab6;

import java.util.concurrent.locks.ReentrantLock;

public class NegativeValueException extends RuntimeException {
    public NegativeValueException(String message){
        super(message);
    }
}
