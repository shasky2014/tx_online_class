package test;

import java.util.ArrayList;

/***
 *
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
        int input = 43;
        ArrayList<Integer> output = IntegerDecomposition(input);
        System.out.println(input+"="+output);
        System.out.println(output+"="+IntegerMultiply(output));

    }

    /**
     * 把整数分解为质数组合: 100 -> [2 2 5 5]
     * */
    public static ArrayList<Integer> IntegerDecomposition(Integer input){
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


}
