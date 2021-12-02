package app.utk.main.controller;

import app.utk.main.request.LinkGenerationRequest;
import app.utk.main.response.LinkGenerationResponse;
import app.utk.main.service.LinkGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author UtkarshRathore on 22-11-2021
 **/
@RestController
@RequestMapping("/api/v1/")
public class LinkGenerationController {

    @Autowired
    private LinkGenerationService linkGenerationService;

    @PostMapping
    public LinkGenerationResponse generateLink(@RequestBody LinkGenerationRequest request){
        return linkGenerationService.generateLink(request);
    }
}
