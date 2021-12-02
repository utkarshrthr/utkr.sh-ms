package app.utk.main.service;

import app.utk.main.dao.UserDAO;
import app.utk.main.request.LoginRequest;
import app.utk.main.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author UtkarshRathore on 02-12-2021
 **/
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserDAO dao;
    
    @Override
    public LoginResponse login(LoginRequest request) {
        return null;
    }
}
