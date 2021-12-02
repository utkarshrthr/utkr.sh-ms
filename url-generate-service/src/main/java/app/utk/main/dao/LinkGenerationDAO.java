package app.utk.main.dao;

import app.utk.main.model.GeneratedLink;
import org.springframework.data.repository.CrudRepository;

/**
 * @author UtkarshRathore on 22-11-2021
 **/
public interface LinkGenerationDAO extends CrudRepository<GeneratedLink, Long> {

    boolean existsByCode(String code);
}
