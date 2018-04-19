package test;

import com.sun.xml.internal.fastinfoset.util.CharArray;

/***
 *
 * @ProjectName: odpsUDF
 * @Package: test
 * @ClassName: homeWork1
 * @Description: java类作用描述
 * @Author: 王晨晨
 * @CreateDate: 2018/4/18 10:26
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/4/18 10:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 ***/
public class homeWork1 {
    public static void main(String[] args) {
        String in1="aabbbccdeddfabc";
        String out1=removeDub1(in1);
        System.out.println(in1);
        System.out.println(out1);
    }


    private static String removeDub1(String in1) {
        if(in1==null || in1.length()<=1){
            return in1;
        }
        String out1 = "";
        for(char a: in1.toCharArray()){
            if ( !out1.endsWith( String.valueOf(a)) )
                out1 = out1 + a;
        }
        return out1;
    }

    private static String removeDub2(String in1) {
        if(in1==null || in1.length()<=1){
            return in1;
        }
        StringBuilder out1 = new StringBuilder();
        for(char a: in1.toCharArray()){
            if ( !out1.toString().endsWith( String.valueOf(a)) )
                out1.append(a);
        }
        return out1.toString();
    }

    private static String removeDub3(String in1) {
        if(in1==null || in1.length()<=1){
            return in1;
        }
        StringBuilder out1 = new StringBuilder();
        for(char a: in1.toCharArray()){
            if ( !out1.toString().endsWith( String.valueOf(a)) )
                out1.append(a);
        }
        return out1.toString();
    }

}
