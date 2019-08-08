package com.github.zilionchu.test.zilionchutest.mode.Adapter;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-08 17:08
 * @Description:
 */
public class LoginForTelphoneAdapter extends SiginForThirdAdapter {

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        System.out.println("通过电话号码登录");
        ResultMsg msg = new ResultMsg("200", "qq登录成功", new Object());
        System.out.println("登录的结果为" + msg.getMsg());
        return msg;
    }
}
