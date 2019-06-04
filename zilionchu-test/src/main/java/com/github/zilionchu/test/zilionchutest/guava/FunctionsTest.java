package com.github.zilionchu.test.zilionchutest.guava;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Preconditions;

import javax.annotation.Nullable;
import java.io.IOException;
import java.net.ServerSocket;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/4/11 14:16
 * @Description:
 */
public class FunctionsTest {
    public static void main(String[] args) throws IOException {
        Function<String, Integer> function = new Function<String, Integer>() {

            @Nullable
            @Override
            public Integer apply(@Nullable String input) {
                Preconditions.checkNotNull(input, "The input Stream should not be null.");
                return input.length();
            }
        };

        System.out.println(function.apply("Hello"));

//        process("Hello", new Handler.LengthDoubleHandler());
        System.out.println(Functions.toStringFunction().apply(new ServerSocket(8888)));


        Function<String, Double> compose = Functions.compose(new Function<Integer, Double>() {
            @Nullable
            @Override
            public Double apply(@Nullable Integer input) {
                return input * 1.0D;

            }
        }, new Function<String, Integer>() {

            @Nullable
            @Override
            public Integer apply(@Nullable String input) {
                return input.length();
            }
        });

        System.out.println(compose.apply("Hello"));

    }



}
