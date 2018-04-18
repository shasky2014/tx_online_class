package cn.tx.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String [ ] args){

        Integer[] arr = {1,2,3,54,67,87};
        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(arr));

        System.out.println(integers);

//        integers.add(2222);

//        System.out.println(integers);

        Collections.shuffle(integers);

        System.out.println(integers);

        List<Integer> iList = new ArrayList<>();
        iList.addAll(Arrays.asList(arr));

        Collections.sort(iList);
        Collections.sort(iList);
        System.out.println(iList);

    }
}
