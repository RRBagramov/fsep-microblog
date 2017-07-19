package ru.fsep.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.fsep.models.Following;

/**
 * 10.07.2017
 *
 * @author Robert Bagramov.
 */

@Repository
public interface FollowingRepository extends CrudRepository<Following, Long> {
}
