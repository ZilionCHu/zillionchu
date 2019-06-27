package com.github.zilionchu.test.zilionchutest.guava;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-27 09:42
 * @Description:
 */
public class Test01 {

    public static void main(String[] args) {
        System.out.println(Strings.isNullOrEmpty(" "));
        System.out.println(" ".length());
        ArrayList<String> Strings = Lists.newArrayList();
        List<String> strings = Lists.asList("1", new String[]{"a", "b"});
        // synchronized ()
        System.out.println(String.format("List.asList list  is ..... %s ", strings));
//        if(Collections.){
//
//        }
        Strings.add("a");

        Strings.add("b");
        Collections.addAll(Strings, "1", "2");
        System.out.println(Arrays.toString(Strings.toArray()));

        if (strings != null && !strings.isEmpty()) {
            List<String> objects = Collections.synchronizedList(new ArrayList<>());

        } else {
        }
    }
}
