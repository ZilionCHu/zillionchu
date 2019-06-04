package com.github.zillionchu.admin.zillionchuadmin.guava;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/22 18:21
 * @Description:
 */
@Slf4j
public class Escape {
    private int thisCanBeEscape = 0;

    public Escape () {
        new InnerClass();
    }

    private class InnerClass {

        public InnerClass() {
            log.info("{}", Escape.this.thisCanBeEscape);
            System.out.println(Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }

}
