package com.wangjzh.business.domain.s;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-5-30 13:40:06
 */
public interface MessageRepository extends JpaRepository<Message,Long> {

    Message findByName(String name);

    Message findByNameAndAge(String name,Integer age);

    @Query("from Message u where u.name=:name")
    Message findUser(@Param("name") String name);
}
