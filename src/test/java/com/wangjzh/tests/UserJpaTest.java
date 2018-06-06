package com.wangjzh.tests;

import com.wangjzh.business.domain.p.User;
import com.wangjzh.business.domain.p.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserJpaTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception{
        userRepository.save(new User("111",10));
        userRepository.save(new User("222",22));

        //测试findAll
        Assert.assertEquals(2,userRepository.findAll().size());

        //测试findByName
        Assert.assertEquals(10,userRepository.findByName("111").getAge().longValue());

        Assert.assertEquals(10,userRepository.findUser("111").getAge().longValue());

        Assert.assertEquals("111",userRepository.findByNameAndAge("111",10).getName());

        userRepository.delete(userRepository.findByName("111"));

        //测试findAll
        Assert.assertEquals(1,userRepository.findAll().size());

    }
}
