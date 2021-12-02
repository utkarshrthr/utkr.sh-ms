package app.utk.main.service;

import app.utk.main.dao.UserDAO;
import app.utk.main.request.SignUpRequest;
import app.utk.main.response.SignUpResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author UtkarshRathore on 02-12-2021
 **/
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UserDAO dao;

    @Override
    public SignUpResponse signUp(SignUpRequest request) {
        return null;
    }
}
