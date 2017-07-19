package ru.fsep.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fsep.models.Post;
import ru.fsep.repositories.PostRepository;

import java.util.List;

/**
 * 18.07.2017
 *
 * @author Robert Bagramov.
 */

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getPostsByUserId(Long id) {
        return postRepository.getPostsByUserId(id);
    }

}
