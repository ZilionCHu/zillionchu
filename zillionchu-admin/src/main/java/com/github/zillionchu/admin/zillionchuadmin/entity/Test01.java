package com.github.zillionchu.admin.zillionchuadmin.entity;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/22 20:48
 * @Description:
 */
public class Test01 {


    private final static ThreadLocal<Long> re=new ThreadLocal<>();

    static ImmutableList<String> list = ImmutableList.of("1", "2");

    static ImmutableMap map = ImmutableMap.<String, String>builder().put("1", "1").build();

   ConcurrentHashMap hashMap= new ConcurrentHashMap();

    public static void main(String[] args) {


        //re.

       // Arrays.asList()

        System.out.println(list.get(0));
        System.out.println(map.get("1"));

//        HashMap<String, String> map = new HashMap();
//        map.put("1", "1");
//        System.out.println(map.get("1"));
//        map = (HashMap<String, String>) Collections.unmodifiableMap(map);
//        System.out.println(map.get("1"));


    }
}
