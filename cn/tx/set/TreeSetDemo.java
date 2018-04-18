package cn.tx.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String [ ] args){

        Set<String> set = new TreeSet<>();
        set.add("r");
        set.add("s");
        set.add("ry");
        set.add("n");
        System.out.println(set);

        Set<Persion> pSet = new TreeSet<>();
        pSet.add(new Persion(10,"assa"));
        pSet.add(new Persion(15,"221"));
        pSet.add(new Persion(13,"dwq"));
        pSet.add(new Persion(12,"汉字"));
        System.out.println(pSet);

    }
}
