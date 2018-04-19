package cn.tx.prio;

public class PrioTest {
    public static void main(String[] args) {
        PrioThread pt1 = new PrioThread();
        PrioThread pt2 = new PrioThread();
        PrioThread pt3 = new PrioThread();

        pt1.start();
        pt2.start();
        pt3.start();
    }
}
