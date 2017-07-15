package ru.fsep.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.fsep.models.UserInfo;

/**
 * 10.07.2017
 *
 * @author Robert Bagramov.
 */
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {


}
