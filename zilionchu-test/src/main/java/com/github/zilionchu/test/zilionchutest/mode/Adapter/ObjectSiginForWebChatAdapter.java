package com.github.zilionchu.test.zilionchutest.mode.Adapter;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-08 16:47
 * @Description:
 */
public class ObjectSiginForWebChatAdapter implements ISiginForWebChat {
    private ISiginSerevice siginService;

    public ObjectSiginForWebChatAdapter(ISiginSerevice siginService) {
        this.siginService = siginService;
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return siginService.login(openId, null);
    }
}
