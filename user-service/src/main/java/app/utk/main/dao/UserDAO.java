package app.utk.main.dao;

import app.utk.main.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author UtkarshRathore on 02-12-2021
 **/
@Repository
public interface UserDAO extends CrudRepository<User, Long> {
}
