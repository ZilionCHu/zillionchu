package com.github.zilionchu.test.zilionchutest.zExample.encrypt.api;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-11 10:48
 * @Description:使用一对密钥：一个用于加密信息，另一个则用于解密信息。     两个密钥之间存在着相互依存关系：即用其中任一个密钥加密的信息只能用另一个密钥进行解密。
 *     其中加密密钥不同于解密密钥,公钥加密私钥解密，反之也可私钥加密公钥解密。
 *     密钥依据性质划分，将其中的一个向外界公开，称为公钥；另一个则自己保留，称为私钥。公钥(Public key)常用于数据加密（用对方公钥加密）或签名验证（用对方公钥解密），私钥(Private key)
 * 常用于数据解密（发送方用接收方公钥加密）或数字签名（用自己私钥加密）。
 *     机密性、完整性、抗抵赖性
 * <p>
 * 优点：难破解
 * 缺点: 加密速度慢
 * 常用算法：
 * RSA、Elgamal、背包算法、Rabin、D-H、ECC（椭圆曲线加密算法)
 */
public class RSAUtil {

    public static String publicKey; // 公钥
    public static String privateKey; // 私钥

    /**
     * 生成公钥和私钥
     */
    public static void generateKey() {
        KeyPairGenerator keyPairGenerator;
        try {
            keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            SecureRandom sr = new SecureRandom();
            keyPairGenerator.initialize(512, sr);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            RSAPublicKey rsaPublicKey = (RSAPublicKey) keyPair.getPublic();
            RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPair.getPrivate();
            publicKey = Base64.encodeBase64String(rsaPublicKey.getEncoded());
            privateKey = Base64.encodeBase64String(rsaPrivateKey.getEncoded());
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 私钥匙加密或解密
     *
     * @param content
     * @param privateKeyStr
     * @return
     */
    public static String encryptByprivateKey(String content, String privateKeyStr, int opmode) {
        // 私钥要用PKCS8进行处理
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decodeBase64(privateKeyStr));
        KeyFactory keyFactory;
        PrivateKey privateKey;
        Cipher cipher;
        byte[] result;
        String text = null;
        try {
            keyFactory = KeyFactory.getInstance("RSA");
            // 还原Key对象
            privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
            cipher = Cipher.getInstance("RSA");
            cipher.init(opmode, privateKey);
            if (opmode == Cipher.ENCRYPT_MODE) { // 加密
                result = cipher.doFinal(content.getBytes());
                text = Base64.encodeBase64String(result);
            } else if (opmode == Cipher.DECRYPT_MODE) { // 解密
                result = cipher.doFinal(Base64.decodeBase64(content));
                text = new String(result, "UTF-8");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return text;
    }

    /**
     * 公钥匙加密或解密
     *
     * @param content
     * @param publicKeyStr
     * @return
     */
    public static String encryptByPublicKey(String content, String publicKeyStr, int opmode) {
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decodeBase64(publicKeyStr));
        KeyFactory keyFactory;
        PublicKey publicKey;
        Cipher cipher;
        byte[] result;
        String text = null;
        try {
            keyFactory = KeyFactory.getInstance("RSA");
            publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
            cipher = Cipher.getInstance("RSA");
            cipher.init(opmode, publicKey);
            if (opmode == Cipher.ENCRYPT_MODE) { // 加密
                result = cipher.doFinal(content.getBytes());
                text = Base64.encodeBase64String(result);
            } else if (opmode == Cipher.DECRYPT_MODE) { // 解密
                result = cipher.doFinal(Base64.decodeBase64(content));
                text = new String(result, "UTF-8");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return text;
    }

    // 测试方法
    public static void main(String[] args) {
        /**
         * 注意： 私钥加密必须公钥解密 公钥加密必须私钥解密
         */
        System.out.println("-------------生成两对秘钥，分别发送方和接收方保管-------------");
        RSAUtil.generateKey();
        System.out.println("公钥匙给接收方:" + RSAUtil.publicKey);
        System.out.println("私钥给发送方:" + RSAUtil.privateKey);

        System.out.println("-------------第一个栗子，私钥加密公钥解密-------------");
        // String textsr = "早啊，你吃早饭了吗？O(∩_∩)O~";
        // // 私钥加密
        // String cipherText = RSAUtil.encryptByprivateKey(textsr,
        // RSAUtil.privateKey, Cipher.ENCRYPT_MODE);
        // System.out.println("发送方用私钥加密后：" + cipherText);
        // // 公钥解密
        // String text = RSAUtil.encryptByPublicKey(cipherText,
        // RSAUtil.publicKey, Cipher.DECRYPT_MODE);
        // System.out.println("接收方用公钥解密后：" + text);

        System.out.println("-------------第二个栗子，公钥加密私钥解密-------------");
        // 公钥加密
        String textsr = "admin";

        String cipherText = RSAUtil.encryptByPublicKey(textsr, RSAUtil.publicKey, Cipher.ENCRYPT_MODE);
        System.out.println("接收方用公钥加密后：" + cipherText);
        // 私钥解密
        String text = RSAUtil.encryptByprivateKey(cipherText, RSAUtil.privateKey, Cipher.DECRYPT_MODE);
        System.out.print("发送方用私钥解密后：" + text);
    }

}