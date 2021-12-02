package app.utk.main.exception;

/**
 * @author UtkarshRathore on 02-12-2021
 **/
public class InvalidUrlException extends RuntimeException {

    public InvalidUrlException(String message){
        super(message);
    }
}
