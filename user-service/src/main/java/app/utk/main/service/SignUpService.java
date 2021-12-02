package app.utk.main.service;

import app.utk.main.request.SignUpRequest;
import app.utk.main.response.SignUpResponse;

/**
 * @author UtkarshRathore on 02-12-2021
 **/
public interface SignUpService {
    public SignUpResponse signUp(SignUpRequest request);
}
