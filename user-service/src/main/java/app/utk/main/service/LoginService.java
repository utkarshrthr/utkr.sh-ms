package app.utk.main.service;


import app.utk.main.request.LoginRequest;
import app.utk.main.response.LoginResponse;

/**
 * @author UtkarshRathore on 02-12-2021
 **/
public interface LoginService {

    public LoginResponse login(LoginRequest request);
}
