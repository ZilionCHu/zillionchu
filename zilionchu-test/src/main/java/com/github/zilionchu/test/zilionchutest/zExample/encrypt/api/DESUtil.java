package com.github.zilionchu.test.zilionchutest.zExample.encrypt.api;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-11 10:18
 * @Description: 对称密码技术：发件人和收件人使用其共同拥有的单个密钥 ,这种密钥既用于加密，也用于解密，叫做机密密钥(也称为对称密钥或会话密钥)。
 *     能够提供信息机密性（没有密钥信息不能被解密）、完整性（被改变的信息不能被解密）的服务。
 *     对称式密码学又称：单钥密码学、秘密密钥密码学、会话密钥密码学、私钥密码学、共享秘钥密码学
 * <p>
 *  DES（数据加密标准）：分组式加密，算法源于Lucifer，作为NIST对称式加密标准；64位（有效位56位、校验8位），分组算法
 *   3DES：128位，分组算法
 *     IDEA（国际数据加密算法）：128位，比DES快，分组算法
 *     Blowfish：32-448位，算法公开，分组算法
 *     RC4：流密码，密钥长度可变
 *     RC5：分组密码，密钥长度可变，最大2048位
 *     Rijndael：128位/196位/256位
 *     AES（高级加密标准）：DES升级版，算法出自Rinjindael
 * <p>
 * 对称密码的优点
 * 用户只需记忆一个密钥，就可用于加密、解密；
 * 与非对称加密方法相比，加密解密的计算量小，速度快，简单易用，适合于对海量数据进行加密处理 。
 * 对称密码的缺点
 * 如果密钥交换不安全，密钥的安全性就会丧失。特别是在电子商务环境下，当客户是未知的、不可信的实体时，如何使客户安全地获得密钥就成为一大难题。
 * 如果用户较多情况下的密钥管理问题。N*(N-1)/2
 *  如果密钥多个用户被共享，不能提供抗抵赖性
 */
public class DESUtil {


    private final static String _DES = "DES";


    /**
     * 加密
     *
     * @param datasource byte[]
     * @param password   String
     * @return byte[]
     */
    public static byte[] encrypt(byte[] datasource, String password) {
        try {
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(_DES);
            SecretKey securekey = keyFactory.generateSecret(desKey);
            Cipher cipher = Cipher.getInstance(_DES);
            cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
            return cipher.doFinal(datasource);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解密
     *
     * @param src      byte[]
     * @param password String
     * @return byte[]
     * @throws Exception
     */
    public static byte[] decrypt(byte[] src, String password) throws Exception {
        SecureRandom random = new SecureRandom();
        DESKeySpec desKey = new DESKeySpec(password.getBytes());
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(_DES);
        SecretKey securekey = keyFactory.generateSecret(desKey);
        Cipher cipher = Cipher.getInstance(_DES);
        cipher.init(Cipher.DECRYPT_MODE, securekey, random);
        return cipher.doFinal(src);
    }

    public static void main(String args[]) throws Exception {
        String str = "admin001";
        String password = "e89c4035323e775550c96f4316c34730c07e37091ba94792";
        byte[] encrypt = encrypt(str.getBytes(), password);
        System.out.println("encrypt:" + new String(encrypt));


        byte[] decrypt = decrypt(encrypt, password);
        System.out.println("decrypt:" + new String(decrypt, "UTF-8"));
    }

}
