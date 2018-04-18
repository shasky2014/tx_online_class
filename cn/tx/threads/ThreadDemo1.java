package cn.tx.threads;

public class ThreadDemo1 {
    public static void main(String[] args) {
        CountThread1 ct = new CountThread1();
        CountThread1 ct1 = new CountThread1();

        Thread t = new Thread(ct,"aaaa");
        Thread t1 = new Thread(ct1,"bnbb");

        t.start();
        t1.start();
    }
}
