package app.utk.main.controller;

import app.utk.main.service.LinkRedirectionService;
import app.utk.main.utils.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author UtkarshRathore on 02-12-2021
 **/

@RestController
@RequestMapping
public class LinkRedirectionController {

    @Autowired
    private LinkRedirectionService linkRedirectionService;

    @GetMapping(path = "/{code}")
    public void redirectTo(@PathVariable String code, HttpServletResponse response) throws IOException {
        response.setStatus(HttpStatus.MOVED_PERMANENTLY.value());
        response.sendRedirect(linkRedirectionService.getRedirectLink(code));
    }
    
}
