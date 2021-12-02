package app.utk.main.exception;

/**
 * @author UtkarshRathore on 02-12-2021
 **/
public class DuplicateCodeException extends RuntimeException {

    public DuplicateCodeException(String message){
        super(message);
    }
}
