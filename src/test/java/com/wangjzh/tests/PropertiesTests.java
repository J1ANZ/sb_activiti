package com.wangjzh.tests;

import com.wangjzh.dto.TestProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 01435743 on 2018/5/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTests {

    @Autowired
    private TestProperties testProperties;

    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(testProperties.getName(),"j1anzzz");
        Assert.assertEquals(testProperties.getTitle(),"王建壮");
        Assert.assertEquals(testProperties.getDesc(),"j1anzzz的中文名字是王建壮");
    }
}
