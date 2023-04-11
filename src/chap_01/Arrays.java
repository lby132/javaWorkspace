package chap_01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.jar.Manifest;

public class Arrays {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("f");
        set.add("g");
        set.add("h");

        System.out.println(set.size());
        set.remove("h");

        set.clear();
        for (Object o : set) {
            System.out.println("o = " + o);
        }

        HashMap<String, Integer> map = new HashMap<>();

        map.put("U", 10);
        map.put("park", 5);
        map.put("k", 3);

        System.out.println(map.size());
        System.out.println(map.get("U"));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("entry = " + entry);

        }
    }
}
