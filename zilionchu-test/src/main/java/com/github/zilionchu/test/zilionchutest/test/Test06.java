package com.github.zilionchu.test.zilionchutest.test;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-07-10 09:29
 * @Description:
 */
public class Test06 {

    private String Orgcode ;

    public String getOrgcode() {
        return Orgcode;
    }

    public void setOrgcode(String orgcode) {
        Orgcode = orgcode;
    }

    public static void main(String[] args) {
        String mobile="1 8988888888";
//        String desensMobile = mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
//        System.out.println(desensMobile);


        boolean whitespace = Character.isWhitespace(mobile.charAt(1));
        System.out.println(whitespace);
    }

}
