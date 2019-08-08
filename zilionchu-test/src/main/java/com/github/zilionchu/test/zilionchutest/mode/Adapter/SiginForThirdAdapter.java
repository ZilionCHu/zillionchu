package com.github.zilionchu.test.zilionchutest.mode.Adapter;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-08 17:05
 * @Description:
 */
public abstract class SiginForThirdAdapter implements ISiginForThirdService {


    @Override
    public ResultMsg loginForQQ(String openId) {
        return new ResultMsg("200","qq登录成功",new Object());
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }
}
