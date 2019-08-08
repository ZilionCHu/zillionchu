package com.github.zilionchu.test.zilionchutest.mode.Adapter;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-08 16:12
 * @Description:
 */

public class ClassSiginForWebChatAdapter extends SiginService implements ISiginForWebChat {

    @Override
    public ResultMsg loginForWechat(String openId) {
        return this.login("", "");
    }
}
