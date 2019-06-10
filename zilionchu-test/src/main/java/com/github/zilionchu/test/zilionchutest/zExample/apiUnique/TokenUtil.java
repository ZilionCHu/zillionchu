package com.github.zilionchu.test.zilionchutest.zExample.apiUnique;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-10 15:42
 * @Description:
 */
public class TokenUtil {

    private static final ConcurrentHashMap<String, Object> tokenMap = new ConcurrentHashMap();


    public static String getToken() {
        String token = UUID.randomUUID().toString().replace("-", "").concat("@zillion");
        tokenMap.put(token, token);
        return token;
    }

    public static boolean checkToken(String token) {
        Object o = tokenMap.get(token);
        if (o == null) {
            return false;
        }
        tokenMap.remove(token);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(TokenUtil.getToken());
    }
}
