package com.github.zillionchu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-06 14:58
 * @Description:
 */
@RestController
@RequestMapping
public class TestController {

    private final static String URL = "http://127.0.0.1:9926/getTest01";

    @RequestMapping("getTest")
    public Map<String, Boolean> getTest() {
        AgentFlowDto agentFlowDto = new AgentFlowDto();
        agentFlowDto.setNodeName("Test");
        agentFlowDto.setSystemType("Test");
        agentFlowDto.setAgentFromId(100L);
        agentFlowDto.setAgentToIdList(Arrays.asList(1L, 2L));
        agentFlowDto.setSubmitPersonDeptId(10L);
        agentFlowDto.setFlowId(100L);
        agentFlowDto.setWorkItemId(100L);

        JSONObject jsonObject = new JSONObject();
        String sJson = jsonObject.toJSONString(agentFlowDto);
        JSONObject jsonObjectParam = JSONObject.parseObject(sJson);
        JSONObject resp = HttpClientUtils.httpPost(URL, jsonObjectParam);

        Map<String, Boolean> var6 = JSON.toJavaObject(resp, Map.class);

        return var6;
    }

    @RequestMapping("getTest01")
    public Map<String, Boolean> getTest01(@RequestBody AgentFlowDto agentFlowDto) {
        System.out.println("=======================" + agentFlowDto.toString());
        List<Long> agentToIdList = agentFlowDto.getAgentToIdList();
        //agentToIdList.stream().collect(Collectors.toMap( ,Boolean::));
        Map<String, Boolean> map = new HashMap();
        for (Long o : agentToIdList
                ) {
            map.put(String.valueOf(o), false);
        }

        map.forEach((s, aBoolean) -> System.out.println(s + "===" + aBoolean));
        return map;
    }

}
