package com.github.zilionchu.test.zilionchutest.guava;

import com.google.common.collect.ImmutableMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.google.common.collect.ImmutableMap.of;


/**
 * @Auther: ZiLlionChu
 * @Date: 2019/4/10 15:08
 * @Description:
 */
public class joiner {


    private static int i=1_000_000;

    private static final List<String> stringList = Arrays.asList(
            "Google", "Guava", "Java", "Scala", "Kafka", null
    );

    private static final List<String> stringListWithNullValue = Arrays.asList(
            "Google", "Guava", "Java", "Scala", null
    );

    private static final Map<String, String> map = ImmutableMap.of("Hello", "Guava", "Java", "Scala");

    private static final Map<String, String> stringMap = of("Hello", "Guava", "Java", "Scala");

    public static void main(String[] args) {
//        String join = Joiner.on("#").skipNulls().join(stringList);
//        String joinUseRe = Joiner.on("#").useForNull("--").join(stringList);
//
//        final StringBuilder builder = new StringBuilder();
//        builder.append("$$$$$");
//        StringBuilder resultBuilder = Joiner.on("#").useForNull("DEFAULT").appendTo(builder, stringListWithNullValue);
//
//
//        System.out.println(resultBuilder.toString());

        // System.out.println(join);
        // System.out.println(joinUseRe);

//
//        try (FileWriter writer = new FileWriter(new File("/Users/zillionchu/Documents/My/1.txt"))) {
//           // Integer.parseInt("aaa");
//             Joiner.on("#").useForNull("DEFAULT").appendTo(writer, stringListWithNullValue);
//            // writer.
//            //assertThat(Files.isFile().test(new File(targetFileName)), equalTo(true));
//        } catch (IOException e) {
//           // fail("append to the writer occur fetal error.");
//        }


//        String result = stringListWithNullValue.
//                stream().
//                filter
//                        (item -> item != null && !item.isEmpty()).collect(joining("#"));
//
//        System.out.println(result);


//        String join = Joiner.on("#").withKeyValueSeparator("=").join(stringMap);
//        System.out.println(join);
        System.out.println(i);

    }
}
