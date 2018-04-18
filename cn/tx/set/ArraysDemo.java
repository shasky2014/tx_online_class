package cn.tx.set;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArraysDemo {
    public static void main(String [ ] args){

        Integer[] arr = {1,2,3,54,67,87};
        List<Integer> integers = Arrays.asList(arr);
        System.out.println(integers);
        integers.set(2,222);
        System.out.println(integers);

    }
}
