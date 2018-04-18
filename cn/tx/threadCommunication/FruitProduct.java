package cn.tx.threadCommunication;

public class FruitProduct implements Runnable {

    private Fruit fruit;

    FruitProduct(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public void run(){
        while(true){
            synchronized (fruit){
                if(fruit.isExsit()){
                    try {
                        fruit.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(fruit.getName()+" had been created!");
                fruit.setExsit(true);
                fruit.notify();
            }
        }

    }


}
