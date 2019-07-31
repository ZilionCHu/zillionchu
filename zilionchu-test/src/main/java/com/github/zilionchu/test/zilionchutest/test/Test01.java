package com.github.zilionchu.test.zilionchutest.test;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.regex.Pattern;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-07-11 16:14
 * @Description:
 */
public class Test01 {

   // private static final String INVALID_HR_DATE = "\\d{4}年(((0[1-9])|(1[0-2])))月";
    private static final String INVALID_HR_DATE = "\\d{4}年((([1-9])|(1[0-2])))月";
    private static final Pattern HR_PATTERN =
            Pattern.compile(INVALID_HR_DATE);

    public static void main(String[] args) {

        // System.out.println(isValidHrDate(" "));
       // System.out.println(isValidHrDate("2019年01月"));
        System.out.println(new Date());


    }

    public static boolean isValidHrDate(String date) {
        if (StringUtils.isBlank(date)) {
            return false;
        }
        return HR_PATTERN.matcher(date).matches();
    }
}
