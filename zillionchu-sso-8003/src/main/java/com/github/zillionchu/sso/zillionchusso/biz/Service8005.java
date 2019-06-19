package com.github.zillionchu.sso.zillionchusso.biz;

import com.alibaba.fastjson.JSONObject;
import com.github.zilionchu.core.zillionchucore.utils.common.HttpClientUtils;
import org.springframework.stereotype.Service;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-19 13:43
 * @Description:
 */

@Service
public class Service8005 {


    public JSONObject getPost8005() {
        JSONObject jsonObject = HttpClientUtils.httpGet("http://127.0.0.1:8005/member/user");
        return jsonObject;
    }


}
