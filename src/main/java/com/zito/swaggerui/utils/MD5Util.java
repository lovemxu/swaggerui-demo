package com.zito.swaggerui.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class MD5Util {
	/** 利用MD5进行加密 */
	public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// 确定计算方法
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		// 加密后的字符串
		String newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
		return newstr;
	}
	
    public static String encode(String s) {
        char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        try {
            if(s == null) {
                return null;
            } else {
                byte[] e = s.getBytes("utf-8");
                MessageDigest mdInst = MessageDigest.getInstance("MD5");
                mdInst.update(e);
                byte[] md = mdInst.digest();
                int j = md.length;
                char[] str = new char[j * 2];
                int k = 0;

                for(int jm = 0; jm < j; ++jm) {
                    byte byte0 = md[jm];
                    str[k++] = hexDigits[byte0 >>> 4 & 15];
                    str[k++] = hexDigits[byte0 & 15];
                }

                String var11 = new String(str);
                System.out.println(var11);
                return var11;
            }
        } catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }
}
