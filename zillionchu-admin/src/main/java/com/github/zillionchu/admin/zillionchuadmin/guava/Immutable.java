package com.github.zillionchu.admin.zillionchuadmin.guava;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/26 09:32
 * @Description:
 */
public class Immutable {


    public static void main(String[] args) {
        ImmutableList<Integer> list = ImmutableList.of(1, 2, 3);
        //.add(5);
        getIndex(list);


        ExecutorService exec = Executors.newCachedThreadPool();
    }

    public static void getIndex(List list){

        list.stream().forEach(o -> {
            System.out.println(o);
        });

    }

}
