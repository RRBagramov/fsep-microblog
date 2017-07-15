package ru.fsep.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.fsep.models.Following;

/**
 * 10.07.2017
 *
 * @author Robert Bagramov.
 */
public interface FollowingRepository extends CrudRepository<Following, Long> {
}
