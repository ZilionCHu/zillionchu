//package com.github.zillionchu.controller;
//
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collections;
//import java.util.Map;
//
///**
// * @Auther: ZiLlionChu
// * @Date: 2019-08-06 14:58
// * @Description:
// */
//@RestController
//@RequestMapping
//public class TestController {
//
//    @RequestMapping("getTest")
//    public Map<String, Boolean> getTest() {
//        return Collections.singletonMap("785", true);
//    }
//
//    @RequestMapping("getTest01")
//    public Map<String, Boolean> getTest01(@RequestBody AgentFlowDto agentFlowDto) {
//        System.out.println(agentFlowDto.toString());
//        return Collections.singletonMap("785", true);
//    }
//
//}
