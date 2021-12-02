package app.utk.main.exception;

/**
 * @author UtkarshRathore on 02-12-2021
 **/

public class LinkNotFoundException extends RuntimeException {

    public LinkNotFoundException(String message){
        super(message);
    }
}
