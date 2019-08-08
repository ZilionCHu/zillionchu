package com.github.zilionchu.test.zilionchutest.mode.Adapter;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-08 17:02
 * @Description:
 */
public interface ISiginForThirdService {

    /**
     * 通过qq登录
     *
     * @param openId
     * @return
     */
    ResultMsg loginForQQ(String openId);

    /**
     * 通过微信登录
     *
     * @param openId
     * @return
     */
    ResultMsg loginForWechat(String openId);

    /**
     * 通过手机号和验证码登录
     *
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);
}
