package cn.tx.threads;

public class CountThread1 implements Runnable {
//    private final static String name ="Thread0";


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"\thhhhh"+i);
        }
    }
}
