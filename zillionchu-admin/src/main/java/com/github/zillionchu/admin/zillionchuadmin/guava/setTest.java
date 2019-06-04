package com.github.zillionchu.admin.zillionchuadmin.guava;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/1/31 16:34
 * @Description:
 */
public class setTest{
    private static final String LIST_SEPARATOR = ",";

    protected static Splitter splitter = Splitter.on(LIST_SEPARATOR).omitEmptyStrings().trimResults();

    public static void main(String[] args) {
        String i="1,2,3,5";
        HashSet<String> strings =Sets.newHashSet(i.split(","));
        /**
         * util
         */
        //Collections.emptyList();
        //Collections.singletonList();
        if (CollectionUtils.isEmpty(strings)) {

        }
        List<String> list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println();
        ArrayList<String> arrayList = Lists.newArrayList(list);
        arrayList.add("D");
       // System.out.println(Lists.reverse(arrayList));


        String s = Arrays.toString(",a,,b,".split(","));
        //System.out.println("#############:"+s);


        List<String> admin = splitter.splitToList("admin,os,,,ox,");
        System.out.println(admin.size());
        System.out.println(Arrays.toString(admin.toArray()));




        Executors.newScheduledThreadPool(1, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread=new Thread();

                return thread;
            }
        });


    }
}
