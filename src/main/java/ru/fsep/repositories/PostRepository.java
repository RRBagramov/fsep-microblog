package ru.fsep.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.fsep.models.Post;

import java.util.List;

/**
 * 10.07.2017
 *
 * @author Robert Bagramov.
 */

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    //language=SQL
    @Query(value = "SELECT * FROM post WHERE user_id=:userId", nativeQuery = true)
    List<Post> getPostsByUserId(@Param("userId") Long id);
}


