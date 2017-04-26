package com.rokyinfo.convert.util;

/**
 * Created by yuanzhijian on 2017/4/26.
 */
public class StringUtils {
    /**
     * 将十六进制字符串转换为字节数组
     *
     * @param str
     * @return 字符数组
     */
    public static byte[] stringToByteArray(String str) {

        int len = str.length();
        if ((len & 0x01) != 0) {
            throw new RuntimeException("odd number of str");
        }

        byte[] out = new byte[len >> 1];

        for (int i = 0, j = 0; j < len; i++) {

            int f = Character.digit(str.charAt(j), 16) << 4;
            j++;
            f = f | Character.digit(str.charAt(j), 16);
            j++;

            out[i] = (byte) (f & 0xFF);
        }

        return out;
    }
}
