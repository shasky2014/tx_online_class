package cn.tx.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String [] args){
        Map<String,String> map1 = new HashMap<>();
        map1.put("k1","v1");
        map1.put("k2","v2");
        map1.put(null,"v3");
        System.out.println(map1);
        System.out.println(map1.get(null));
        System.out.println(map1.get("k2"));
        Map<String,String> map2 = new HashMap<>();

        map2.put("kk1","vv1");
        map2.put("kk2","vv2");
        map2.put("kk3","vv3");
        System.out.println(map2);

        map1.putAll(map2);
        System.out.println(map1);

    }
}
