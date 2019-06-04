package com.github.zillionchu.admin.zillionchuadmin.entity;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/1/25 17:16
 * @Description:
 */
public class jwt {
    public static void main(String[] args) {

        JwtBuilder jwtBuilder = Jwts.builder().
                setId("111").
                setSubject("test").
                setIssuedAt(new Date()).
                signWith(SignatureAlgorithm.HS256, "test");
        System.out.println(jwtBuilder.compact());
    }
}
