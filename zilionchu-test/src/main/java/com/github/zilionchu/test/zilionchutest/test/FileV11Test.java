package com.github.zilionchu.test.zilionchutest.test;

import com.github.zilionchu.core.zillionchucore.utils.io.FileIOUtils;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-13 14:34
 * @Description:
 */
public class FileV11Test {

    public static void main(String[] args) {
//        boolean orExistsDir = FileUtils_v11.createOrExistsDir("D:\\t\\t\\t");
//        System.out.println(orExistsDir);
        String i="FileIOUtils.writeFileFromBytesByChannel(\"1D:\\\\\\\\t\\\\\\\\t\\\\\\\\t\\\\1.txt\",);\n";
        FileIOUtils.writeFileFromBytesByChannel("D:\\\\t\\\\t\\\\t\\1.txt",i.getBytes(),true,true);


    }
}
