package app.utk.main.service;

import app.utk.main.request.LinkGenerationRequest;
import app.utk.main.response.LinkGenerationResponse;

/**
 * @author UtkarshRathore on 22-11-2021
 **/
public interface LinkGenerationService {
    public LinkGenerationResponse generateLink(LinkGenerationRequest request);
}
