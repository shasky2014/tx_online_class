package cn.tx.seril;

import java.io.*;

public class SerilDemo {
    public static void main(String[] args) {
        // 读写一个对象
        writeObject();
        readObject();
    }

    private static void writeObject() {
        ObjectOutputStream oos = null;
        try {

            oos = new ObjectOutputStream(new FileOutputStream("persons.txt"));
            Person a = new Person("zhangsan",20);
            Person a1 = new Person("李晟",22);
            Person a2 = new Person("忘我",12);
            Person a3 = new Person("!!@#$",3);

            oos.writeObject(a);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void readObject() {
        ObjectInputStream oos = null;
        try {

            oos = new ObjectInputStream(new FileInputStream("persons.txt"));
            System.out.printf(oos.readObject().toString());


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
