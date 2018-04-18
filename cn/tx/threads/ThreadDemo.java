package cn.tx.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        CountThread ct = new CountThread("aaaa");
        CountThread ct1 = new CountThread("bbbb");

        ct.setName("表vvv");

        ct.start();
        ct1.start();
    }
}
