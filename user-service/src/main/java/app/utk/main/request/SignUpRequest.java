package app.utk.main.request;

/**
 * @author UtkarshRathore on 02-12-2021
 **/
public class SignUpRequest {

    private String email;
    private String password;
    private String contact;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public SignUpRequest(String email, String password, String contact) {
        this.email = email;
        this.password = password;
        this.contact = contact;
    }

    public SignUpRequest(){}
}
