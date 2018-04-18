package cn.tx.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File a =new File("test.txt");
        System.out.println(a);
        a.createNewFile();
        System.out.println(a);
        a.delete();
    }
}
