package ru.fsep.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.fsep.models.Post;

/**
 * 10.07.2017
 *
 * @author Robert Bagramov.
 */
public interface PostRepository extends CrudRepository<Post,Long> {
}

