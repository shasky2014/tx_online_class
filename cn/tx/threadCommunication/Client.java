package cn.tx.threadCommunication;

public class Client {
    public static void main(String[] args) {
        Fruit f = new Fruit("apple");
        f.setExsit(true);

        FruitProduct fp=new FruitProduct(f);
        FruitConsumer fc = new FruitConsumer(f);

        Thread t1 = new Thread(fp);
        Thread t2 = new Thread(fc);

        t1.start();
        t2.start();
    }

}
