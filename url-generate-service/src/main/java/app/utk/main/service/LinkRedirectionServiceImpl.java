package app.utk.main.service;

import app.utk.main.dao.LinkGenerationDAO;
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
        return linkGenerationDAO.findByCode(code).getUrl();
    }
}
