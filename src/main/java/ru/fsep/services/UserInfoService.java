package ru.fsep.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fsep.models.UserInfo;
import ru.fsep.repositories.UserInfoRepository;

/**
 * 18.07.2017
 *
 * @author Robert Bagramov.
 */

@Service
public class UserInfoService {

    @Autowired
    UserInfoRepository userInfoRepository;

    public UserInfo getUserInfoById(Long id) {
        return userInfoRepository.getUserInfoByUserId(id);
    }
}
