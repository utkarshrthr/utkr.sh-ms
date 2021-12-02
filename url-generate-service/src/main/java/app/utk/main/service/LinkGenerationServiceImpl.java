package app.utk.main.service;

import app.utk.main.dao.LinkGenerationDAO;
import app.utk.main.model.GeneratedLink;
import app.utk.main.request.LinkGenerationRequest;
import app.utk.main.response.LinkGenerationResponse;
import app.utk.main.utils.AppConstant;
import app.utk.main.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author UtkarshRathore on 22-11-2021
 **/
@Service
public class LinkGenerationServiceImpl implements LinkGenerationService {

    @Autowired
    private LinkGenerationDAO linkGenerationDAO;

    @Override
    public LinkGenerationResponse generateLink(LinkGenerationRequest request) {
        LinkGenerationResponse response = new LinkGenerationResponse();
        if(request.getCode() == null){
            String code = AppUtils.generateRandomShortCode();
            while (linkGenerationDAO.existsByCode(code));{
                code = AppUtils.generateRandomShortCode();
            }
            GeneratedLink link =  linkGenerationDAO.save(new GeneratedLink(code, request.getLink()));
            if(link.getId()  != null){
                response.setCode(code);
                response.setOriginalLink(request.getLink());
                response.setShortLink(AppConstant.BASE_URL+code);
            }
        }
        else {
            GeneratedLink link =  linkGenerationDAO.save(new GeneratedLink(request.getCode(), request.getLink()));
            if(link.getId()  != null){
                response.setCode(request.getCode());
                response.setOriginalLink(request.getLink());
            }
        }
        return response;
    }
}
