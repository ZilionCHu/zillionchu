package com.github.zillionchu.zuul.zillionchuzuul.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/21 10:02
 * @Description: urlFileter
 */
public class urlFilter extends  ZuulFilter {
    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        return null;
    }
}
