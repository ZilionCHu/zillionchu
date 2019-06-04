package com.github.zillionchu.zuul.zillionchuzuul;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZillionchuZuulApplicationTests {


    @Autowired
    private BCryptPasswordEncoder encoder;


    @Test
    public void contextLoads() {

        String encode = encoder.encode("123");
        System.out.println("############################"+encode);

    }
}

