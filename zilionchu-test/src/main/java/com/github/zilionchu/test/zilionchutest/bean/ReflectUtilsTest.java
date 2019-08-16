package com.github.zilionchu.test.zilionchutest.bean;

import com.github.zilionchu.core.zillionchucore.utils.bean.ReflectUtils;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-13 11:09
 * @Description:
 */
public class ReflectUtilsTest {
    public static void main(String[] args) {
        System.out.println(ReflectUtils.reflect(String.class).newInstance().get().equals(""));
    }
}
