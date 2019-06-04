package com.github.zillionchu.admin.zillionchuadmin.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/4/4 16:15
 * @Description:
 */
public class Test10 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("1","2");
       // System.out.println(Arrays.toString(list.toArray()));
        List<Object> objects = null;
        System.out.println(objects.get(0));

        System.out.println(Arrays.toString(Collections.emptyList().toArray()));
    }
}
