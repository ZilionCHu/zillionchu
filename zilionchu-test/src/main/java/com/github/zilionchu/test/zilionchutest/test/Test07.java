package com.github.zilionchu.test.zilionchutest.test;

import java.util.*;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-05 15:06
 * @Description:
 */
public class Test07 {
    public static void main(String[] args) {
        user user00 = new user("1", "a");
        user user01 = new user("1", "b");
        user user02 = new user("2", "c");
        user user03 = new user("2", "d");
        user user04 = new user("2", "f");
        user user05 = new user("3", "g");

        List<user> users = Arrays.asList(user00, user01, user02, user03, user04, user05);


        Map<String, List<String>> map = new HashMap<>();
        List<String> listAge = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            user user = users.get(i);
            boolean b = map.containsKey(user.getName());
            if (b) {
                listAge.add(user.getAge());
                map.put(user.getName(), listAge);
            } else {
                listAge = new ArrayList<>();
                listAge.add(user.getAge());
                map.put(user.getName(), listAge);
            }
        }

        //     map.forEach((s, strings) -> System.out.println(s + "--" + Arrays.toString(strings.toArray())));
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            //entry.getKey();
            //entry.getValue();
            System.out.println(entry.getKey() + "---" + entry.getValue());

        }


        Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> next = iterator.next();
            System.out.println(next.getKey() + "====" + next.getValue());

        }


        for (String key : map.keySet()
                ) {
            System.out.println(key + "##########" + map.get(key));


        }

        Iterator<String> iterator1 = map.keySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, List<String>> next = iterator.next();
            next.getKey();
            next.getValue();

        }


    }


    static class user {
        String name;
        String age;


        public user(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}
