package com.github.zilionchu.test.zilionchutest.zExample.apiUnique;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-10 11:14
 * @Description:
 */

@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestApiUnique {
    String type();
}
