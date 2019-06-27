package com.github.zilionchu.test.zilionchutest.guava.event;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-25 10:35
 * @Description:
 */
public class Request {

    private final String orderNo;

    public Request(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "Request{" +
                "orderNo='" + orderNo + '\'' +
                '}';
    }
}
