package com.wangjzh.business.domain.p;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-5-30 13:40:06
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByName(String name);

    User findByNameAndAge(String name,Integer age);

    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);
}
