package cn.beijing.ssfh.util;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Mr.W on 2017/9/24.
 */
public class Md5Utils {


    public static String encryptPassword(String password) {
        String ecoding = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            BASE64Encoder base64Encoder = new BASE64Encoder();
            ecoding = base64Encoder.encode(messageDigest.digest(password.getBytes("utf-8")));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return ecoding;
    }

    public static boolean checkPassword(String inputPwd, String dbPwd) {
         String encoding = encryptPassword(inputPwd);
         return (encoding.equals(dbPwd));
    }
    }
