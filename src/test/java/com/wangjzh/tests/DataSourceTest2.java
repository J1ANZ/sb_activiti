package com.wangjzh.tests;

import com.wangjzh.business.domain.p.User;
import com.wangjzh.business.domain.p.UserRepository;
import com.wangjzh.business.domain.s.Message;
import com.wangjzh.business.domain.s.MessageRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 01435743 on 2018/5/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTest2 {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageRepository messageRepository;

    @Test
    public void test() throws Exception {

        userRepository.save(new User("aaa", 10));
        userRepository.save(new User("bbb", 20));
        userRepository.save(new User("ccc", 30));
        userRepository.save(new User("ddd", 40));
        userRepository.save(new User("eee", 50));

        Assert.assertEquals(5, userRepository.findAll().size());

        messageRepository.save(new Message("o1", 10));
        messageRepository.save(new Message("o2", 20));
        messageRepository.save(new Message("o3", 30));

        Assert.assertEquals(3, messageRepository.findAll().size());

    }

}
