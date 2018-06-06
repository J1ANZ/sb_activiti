package com.wangjzh.tests;

import com.wangjzh.business.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactsApplicationTests {

	@Autowired
	private UserService userService;

	@Before
	public void setUp() {
		//准备，清空user表
		userService.deleteAllUsers();
	}

	@Test
	public void test() throws Exception {
		//插入5个用户
		userService.create("111", 1);
		userService.create("222", 2);
		userService.create("333", 3);
		userService.create("444", 4);
		userService.create("555", 5);
	}
}
