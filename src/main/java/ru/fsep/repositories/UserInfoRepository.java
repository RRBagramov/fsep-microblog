package ru.fsep.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.fsep.models.UserInfo;

/**
 * 10.07.2017
 *
 * @author Robert Bagramov.
 */

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {
    @Query(value = "SELECT * FROM user_info WHERE user_id = :userId",nativeQuery = true)
    UserInfo getUserInfoByUserId(@Param("userId") Long id);
}
