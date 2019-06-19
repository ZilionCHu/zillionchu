package com.github.zillionchu.sso.zillionchusso.hystrix;

import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.*;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-18 17:10
 * @Description:
 */
public class UserHystrixCommand extends HystrixCommand<JSONObject> {


//    @Autowired
//    private Service


    protected UserHystrixCommand(Setter setter) {
        super(setter());
    }

    @Override
    protected JSONObject run() throws Exception {
//        JSONObject member = memberService.getMember();
//        System.out.println("当前线程名称:" + Thread.currentThread().getName() + ",订单服务8005:member:" + member);
        return null;
    }

    @Override
    protected JSONObject getFallback() {
        System.out.println("##########################系统错误！");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 500);
        jsonObject.put("msg", "#######################系统错误！");
        return jsonObject;
    }

    private static Setter setter() {

        // 服务分组
        HystrixCommandGroupKey groupKey = HystrixCommandGroupKey.Factory.asKey("zillinchu-sso");
        // 服务标识
        HystrixCommandKey commandKey = HystrixCommandKey.Factory.asKey("member");
        // 线程池名称
        HystrixThreadPoolKey threadPoolKey = HystrixThreadPoolKey.Factory.asKey("member-pool");
        // #####################################################
        // 线程池配置 线程池大小为10,线程存活时间15秒 队列等待的阈值为100,超过100执行拒绝策略
        HystrixThreadPoolProperties.Setter threadPoolProperties = HystrixThreadPoolProperties.Setter().withCoreSize(10)
                .withKeepAliveTimeMinutes(15).withQueueSizeRejectionThreshold(100);
        // ########################################################
        // 命令属性配置Hystrix 开启超时
        HystrixCommandProperties.Setter commandProperties = HystrixCommandProperties.Setter()
                // 采用线程池方式实现服务隔离
                .withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.THREAD)
                // 禁止
                .withExecutionTimeoutEnabled(false);
        return HystrixCommand.Setter.withGroupKey(groupKey).andCommandKey(commandKey).andThreadPoolKey(threadPoolKey)
                .andThreadPoolPropertiesDefaults(threadPoolProperties).andCommandPropertiesDefaults(commandProperties);

    }
}
