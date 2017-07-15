package ru.fsep.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.fsep.models.User;

/**
 * 10.07.2017
 *
 * @author Robert Bagramov.
 */

public interface UserRepository extends CrudRepository<User, Long> {

}
