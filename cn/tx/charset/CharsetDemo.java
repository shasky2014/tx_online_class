package cn.tx.charset;

import java.io.*;

public class CharsetDemo {
    public static void main(String[] args) {
        printCharset();

    }

    public static void printCharset()  {

        OutputStreamWriter ow = null;
        try {
            ow = new OutputStreamWriter(new FileOutputStream("charsetdemo1.txt"), "utf-8");
            ow.write("sss汉字english1234.");
            ow.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (ow != null){
                try {
                    ow.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
