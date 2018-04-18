package cn.tx.set;

public class CompareDemo {
    public static void main(String [ ] args){
        String str = "abc";
        String str1 = "abcnba";

        int val = str.compareTo(str1);

        System.out.println(val);
    }
}
