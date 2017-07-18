package ru.fsep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fsep.models.User;
import ru.fsep.repositories.UserRepository;

/**
 * 18.07.2017
 *
 * @author Robert Bagramov.
 */

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }
}
