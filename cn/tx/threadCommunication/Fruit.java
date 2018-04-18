package cn.tx.threadCommunication;

public class Fruit {
    private String name;
    private boolean isExsit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExsit() {
        return isExsit;
    }

    public void setExsit(boolean exsit) {
        isExsit = exsit;
    }

    public Fruit() {
    }

    public Fruit(String name) {
        this.name = name;
    }

}
