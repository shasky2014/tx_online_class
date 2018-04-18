package cn.tx.threads;

public class CountThread extends Thread {
//    private final static String name ="Thread0";

    public CountThread(){

    }

    public CountThread(String name){
        super(name);
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+"\thhhhh"+i);
        }
    }
}
