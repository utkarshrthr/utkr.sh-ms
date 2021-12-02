package app.utk.main.service;

import app.utk.main.dao.LinkGenerationDAO;
import app.utk.main.exception.LinkNotFoundException;
import app.utk.main.model.GeneratedLink;
import app.utk.main.utils.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author UtkarshRathore on 02-12-2021
 **/
@Service
public class LinkRedirectionServiceImpl implements LinkRedirectionService {

    @Autowired
    private LinkGenerationDAO linkGenerationDAO;

    @Override
    public String getRedirectLink(String code) {
        GeneratedLink link = linkGenerationDAO.findByCode(code);
        if(link == null)
            throw new LinkNotFoundException(AppConstant.BASE_URL+code+" does not exists");
        return linkGenerationDAO.findByCode(code).getUrl();
    }
}
