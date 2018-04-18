package cn.tx.charset;

import java.io.*;

public class CharsetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String a="回家";

        byte[] bs1 = a.getBytes();
        byte[] bs2 = a.getBytes("UTF-8");
        byte[] bs3 = a.getBytes("GBK");
        printBytes(bs1);
        System.out.println(new String(bs1));
        printBytes(bs2);
        System.out.println(new String(bs2,"UTF-8"));
        printBytes(bs3);
        System.out.println(new String(bs3,"GBK"));
    }

    public static void printBytes(byte[] bs3){
        for (byte b:bs3){
            System.out.print(b+" ");
        }

    }

}
