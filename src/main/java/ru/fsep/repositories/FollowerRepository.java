package ru.fsep.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.fsep.models.Follower;

/**
 * 10.07.2017
 *
 * @author Robert Bagramov.
 */
public interface FollowerRepository extends CrudRepository<Follower, Long> {

}
