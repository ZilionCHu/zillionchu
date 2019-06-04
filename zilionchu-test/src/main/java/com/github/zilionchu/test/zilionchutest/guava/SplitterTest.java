package com.github.zilionchu.test.zilionchutest.guava;

import com.google.common.base.Splitter;

import java.util.List;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/4/11 09:32
 * @Description:
 */
public class SplitterTest {

    public static void main(String[] args) {
        List<String> result = Splitter.on("|").omitEmptyStrings().splitToList("hello | world|||");

    }
}
