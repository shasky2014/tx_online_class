package cn.tx.poker;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class PokerPair {
    public static void main(String[] args){

//        Poker a = new Poker(1,3);
//        System.out.println(a);
//        a.setColorValue(0,1);
//        System.out.println(a);

        Pokers aPair = new Pokers();
        aPair.creatPokerPair();
//        System.out.println( aPair);
//
        aPair.sufferPokers();
        System.out.println( aPair);
//
//        aPair.sortPokers();
//        System.out.println( aPair);

        for (Poker ss : aPair.getPokerPair()){
            System.out.print( ss +", ");
        }



        // 初始化一副扑克

//        List<Poker> PokerPair = setPokerPair();
//        System.out.println( PokerPair.size());
//        System.out.println( PokerPair);

        //洗牌

    }

    private static List<Poker> setPokerPair(){

        List<Poker> PokerPair = new ArrayList<>();
        for (int c = 1;c<5;c++){
            for (int v=1;v<14;v++){
                PokerPair.add(new Poker(c,v) );
            }
        }

        PokerPair.add(new Poker(0,14));
        PokerPair.add(new Poker(0,15));
        return PokerPair;
    }

}
