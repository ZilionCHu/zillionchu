package com.github.zilionchu.test.zilionchutest.test;

import com.github.zilionchu.core.zillionchucore.utils.bean.ReflectUtils;

import java.lang.reflect.Field;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-12 14:35
 * @Description:
 */
public class TestChild extends TestParent {

    public static void main(String[] args) {
        TestParent testParent = new TestParent();
        testParent.setName("Tom");
        testParent.setAge("jack");
//        testParent.setSex(null);
//        String age = getToString(testParent, TestParent.class);
//        System.out.println(age);

        Object name = ReflectUtils.reflect(testParent).field("name").get();
        System.out.println((String) name);


    }


    public static String getToString(Object obj, Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        StringBuffer clazzToString = new StringBuffer();
        clazzToString.append(obj.getClass().getSimpleName() + ">>>>[");
        for (Field field : fields) {
            try {
                String fieldName = field.getName();
                Field valueField = clazz.getDeclaredField(fieldName);
                valueField.setAccessible(true);
                Object object = valueField.get(obj);
                String var1 = object == null ? "null" : object.toString();
                clazzToString.append(fieldName);
                clazzToString.append("=");
                clazzToString.append(var1);
                clazzToString.append(";");
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        clazzToString.append("]");
        return clazzToString.toString();
    }

}
