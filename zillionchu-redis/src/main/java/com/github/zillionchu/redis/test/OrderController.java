package com.github.zillionchu.redis.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-15 15:07
 * @Description:
 */
@RestController
public class OrderController {

    @Autowired
    private RedisTemplate redisTemplate;

   // StringRedisTemplate

    @RequestMapping("/order")
    public String order(String key) {
        RedisAtomicLong redisAtomicLong = new RedisAtomicLong(key, redisTemplate.getConnectionFactory());
        for (int i = 0; i < 100; i++) {
            long incrementAndGet = redisAtomicLong.incrementAndGet();
            // 5位
            String orderId = prefix() + "-" + String.format("%1$05d", incrementAndGet);
            String orderSQL = "insert into orderNumber value('" + orderId + "');";
            System.out.println(orderSQL);
        }

        return "success";
    }

    @RequestMapping("/order1")
    public String order1(String key) {
        RedisAtomicLong redisAtomicLong = new RedisAtomicLong(key, redisTemplate.getConnectionFactory());
        // // 起始值
        // redisAtomicLong.set(10);
        // 设置步长加10
        redisAtomicLong.addAndGet(9);
        return redisAtomicLong.incrementAndGet() + "";
    }

    public static String prefix() {
        String temp_str = "";
        Date dt = new Date();
        // 最后的aa表示“上午”或“下午” HH表示24小时制 如果换成hh表示12小时制
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        temp_str = sdf.format(dt);
        return temp_str;
    }

}
