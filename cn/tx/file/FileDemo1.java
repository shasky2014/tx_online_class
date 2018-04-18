package cn.tx.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File a =new File("test.txt");
        System.out.println(a);
        System.out.println("exists:"+a.exists());


        a.createNewFile();
        System.out.println("\n--------createNewFile-------");

        System.out.println(a.exists());
        System.out.println(a.isFile());
        System.out.println(a.isHidden());
        System.out.println(a.isAbsolute());
        System.out.println(a.isDirectory());
        System.out.println(a.canExecute());
        System.out.println(a.canRead());
        System.out.println(a.canWrite());
        System.out.println(a=a.getAbsoluteFile());
        System.out.println(a.getName());
        System.out.println(a.getPath());
        System.out.println(new Date(a.lastModified()) );
        System.out.println(a.getTotalSpace());
        System.out.println(a.getFreeSpace());
        System.out.println(a.getUsableSpace());

//        a.delete();
//        System.out.println("\n--------delete-------");
//        System.out.println("exists:"+a.exists());
    }
}
