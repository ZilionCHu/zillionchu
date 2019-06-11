package com.github.zilionchu.test.zilionchutest.zExample.encrypt.url;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-11 09:18
 * @Description: 不管是以何种方式传递url时，如果要传递的url中包含特殊字符，如想要传递一个+，但是这个+会被url会被编码成空格，想要传递&，被url处理成分隔符。
 * 尤其是当传递的url是经过Base64加密或者RSA加密后的，存在特殊字符时，这里的特殊字符一旦被url处理，就不是原先你加密的结果了。
 * url特殊符号及对应的编码:
 * 符号	url中的含义	                编码
 * +	URL 中+号表示空格	            %2B
 * 空格	URL中的空格可以用+号或者编码	%20
 * /	分隔目录和子目录	            %2F
 * ?	分隔实际的URL和参数	        %3F
 * %	指定特殊字符	                %25
 * #	表示书签	                    %23
 * &	URL中指定的参数间的分隔符	    %26
 * =	URL中指定参数的值	            %3D
 */
public class URLdocode {

    private final static String _UTF_8 = "UTF-8";

    public static void main(String[] args) {
        try {
            String encode = URLEncoder.encode("?", _UTF_8);
            String decode = URLDecoder.decode(encode, _UTF_8);

            System.out.println(String.format("encode  url ..%s", encode));
            System.out.println(String.format("decode  url ..%s", decode));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
