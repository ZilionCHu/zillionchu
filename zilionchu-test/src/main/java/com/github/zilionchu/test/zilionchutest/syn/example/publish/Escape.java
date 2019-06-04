package com.github.zilionchu.test.zilionchutest.syn.example.publish;


import lombok.extern.slf4j.Slf4j;

//import com.mmall.concurrency.annoations.NotThreadSafe;

@Slf4j

//@NotRecommend
public class Escape {

    private int thisCanBeEscape = 0;

    public Escape () {
        new InnerClass();
    }

    private class InnerClass {

        public InnerClass() {
            log.info("{}", Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}
