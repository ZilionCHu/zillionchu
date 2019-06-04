package com.github.zillionchu.admin.zillionchuadmin.WebService;

import lombok.extern.slf4j.Slf4j;

import javax.xml.ws.Endpoint;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/4/3 13:59
 * @Description:
 */
@javax.jws.WebService
@Slf4j
public class WebServiceImpl  implements WebService {
    @Override
    public String getCity(String name) {
        log.info("-name-{}",name);
        return name;

    }

    public static void main(String[] args) {
        Endpoint.publish("http://192.168.137.4:1234/city",new WebServiceImpl());
    }
}
