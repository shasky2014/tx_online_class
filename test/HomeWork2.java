package test;

import java.util.ArrayList;

/***
 * @ProjectName: odpsUDF
 * @Package: test
 * @ClassName: HomeWork2
 * @Description: 把整数分解为质数组合: 100 -> 2 2 5 5
 * @Author: 王晨晨
 * @CreateDate: 2018/4/20 11:49
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/4/20 11:49
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 ***/
public class HomeWork2 {
    public static void main(String[] args) {
        int input = 1002;
        ArrayList<Integer> output = decompositionForInt(input);
        System.out.println(input+"="+output);
        System.out.println(output+"="+IntegerMultiply(output));
    }

    /**
     * 把整数分解为质数组合: 100 -> [2 2 5 5]
     * */
    public static ArrayList<Integer> IntegerDecomposition(Integer input){
        ArrayList<Integer> outList = new ArrayList<>();
        int num=0;
        for (int j=2;j<input/2+1;j++){
            for(int i=2;i<input/i+1;i++){
                System.out.printf("%d:\t除数=%d,被除数=%d,商=%d,余数=%d\n",num++,input,i,input/i,input%i);
                if(input%i==0){
                    outList.add(i);
                    input = input/i;
                    j=outList.get(outList.size()-1);
                    break;
                }
            }
        }
        outList.add(input);
        return outList;
    }


    public static Integer IntegerMultiply(ArrayList<Integer>  input){
        int output =1;
        for(int a: input){
            output = output*a;
        }
        return output;
    }

    /**
     * 把整数分解为质数组合: 100 -> [2 2 5 5]
     * todo 待优化
     * 循环的参数过程可以优化,还没有考虑清楚.
     * 其实是直接吧质数列列出来,输入数据是质数时循环次数最多.
     * */
    public static ArrayList<Integer> IntegerDecomposition2(Integer input){
        ArrayList<Integer> outList = new ArrayList<>();
        for (int j=2;j<input/2+1;j++){
            for(int i=2;i<input/i+1;i++){
                System.out.printf("除数=%d,被除数=%d,商=%d,余数=%d\n",input,i,input/i,input%i);
                if(input%i==0){
                    outList.add(i);
                    input = input/i;
                    j=outList.get(outList.size()-1);
                    break;
                }
            }
        }
        outList.add(input);
        return outList;
    }


    private static final int[] PRIME_NUMBERS = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
            71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181,
            191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307,
            311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433,
            439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571,
            577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701,
            709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853,
            857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997 };

    /**
     * 指数列表
     * @param input
     * @return
     */
    public static ArrayList<Integer> decompositionForInt(Integer input) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int theNum = input;
        int length = PRIME_NUMBERS.length;

        while (theNum != 1 && i < length) {
            int thePri = PRIME_NUMBERS[i];
            int mod = theNum % thePri;

            if (mod == 0) {
                result.add(thePri);
                theNum /= thePri;
                continue;
            }

            i++;
        }

        if (i >= length) {
            throw new RuntimeException("Shuld add more primes.");
        }

        return result;
    }

}
