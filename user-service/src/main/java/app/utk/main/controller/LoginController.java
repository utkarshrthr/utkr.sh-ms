package app.utk.main.controller;

import app.utk.main.request.LoginRequest;
import app.utk.main.response.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author UtkarshRathore on 02-12-2021
 **/
@RequestMapping
@RestController
public class LoginController {

    @PostMapping
    public LoginResponse login(@RequestBody LoginRequest request){
        return new LoginResponse();
    }
}
