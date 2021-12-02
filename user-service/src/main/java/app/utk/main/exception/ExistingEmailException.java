package app.utk.main.exception;

/**
 * @author UtkarshRathore on 02-12-2021
 **/
public class ExistingEmailException extends RuntimeException {

    public ExistingEmailException(String message){
        super(message);
    }
}
