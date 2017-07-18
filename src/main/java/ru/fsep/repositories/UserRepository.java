package ru.fsep.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.fsep.models.User;

/**
 * 10.07.2017
 *
 * @author Robert Bagramov.
 */

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User getUserById(Long id);
}
