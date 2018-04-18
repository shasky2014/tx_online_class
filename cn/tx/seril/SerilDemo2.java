package cn.tx.seril;

import java.io.*;
import java.util.ArrayList;

public class SerilDemo2 {
    public static void main(String[] args) {
        // 读写多个对象时,先做一个数组或者集合对象,在做序列化.
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
            ArrayList<Person> pl = new ArrayList<>();
            pl.add(a);
            pl.add(a1);
            pl.add(a2);
            pl.add(a3);
            oos.writeObject(pl);

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
            ArrayList<Person> pl = (ArrayList<Person>) oos.readObject();

            for(Person p :pl){
                System.out.println(p.toString());
            }


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
