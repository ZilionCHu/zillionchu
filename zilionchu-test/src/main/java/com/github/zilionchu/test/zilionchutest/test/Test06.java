package com.github.zilionchu.test.zilionchutest.test;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-07-10 09:29
 * @Description:
 */
public class Test06 {

    private String Orgcode ;

    private String test01;

    private String test02;

    private String test03;

    public String getTest01() {
        return test01;
    }

    public void setTest01(String test01) {
        this.test01 = test01;
    }

    public String getTest02() {
        return test02;
    }

    public void setTest02(String test02) {
        this.test02 = test02;
    }

    public String getTest03() {
        return test03;
    }

    public void setTest03(String test03) {
        this.test03 = test03;
    }

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
