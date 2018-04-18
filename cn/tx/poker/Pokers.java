package cn.tx.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pokers {
    /**
     * 属性:
     *     扑克张数:54
     *     花色数量:4
     *     扑克牌的集合:
     * 方法:
     *     创建扑克
     *     洗牌
     *     排序
     *     抽取一张
     * */
    private  Integer colors;
    private  Integer pokersCount;

    public List<Poker> getPokerPair() {
        return PokerPair;
    }

    private List<Poker> PokerPair;

    @Override
    public String toString() {
        return PokerPair.toString();
    }

    public List<Poker> creatPokerPair() {
        colors=5;
        pokersCount = 54;
        PokerPair = new ArrayList<>();

        for (int c = 1;c<5;c++){
            for (int v=1;v<14;v++){
                PokerPair.add(new Poker(c,v) );
            }
        }

        PokerPair.add(new Poker(0,14));
        PokerPair.add(new Poker(0,15));

        return PokerPair;
    }

    public List<Poker> sufferPokers(){
        Collections.shuffle(PokerPair);
        return PokerPair;
    }

    public List<Poker> sortPokers(){
        Collections.sort(PokerPair);
        return PokerPair;
    }

    public  Poker getRandomPoker() {
        Random r = new Random();
        int size = PokerPair.size()-1;
        return PokerPair.get(r.nextInt(size)+1);
    }

}
