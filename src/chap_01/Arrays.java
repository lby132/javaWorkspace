package chap_01;

import java.util.*;
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

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Iterator<String> iterator = list.iterator();
        System.out.println("iterator = " + iterator.next());
        System.out.println("iterator = " + iterator.next());
        System.out.println("iterator = " + iterator.next());

        iterator = list.iterator(); // 커서를 다시 첫번째로 올림
        while (iterator.hasNext()) {
            String i = iterator.next();
            if (i.contains("bbb")) {
                iterator.remove();
            }
        }

        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }

        System.out.println("===================================");

        HashSet<String> set1 = new HashSet<>();
        set1.add("aaa");
        set1.add("bbb");
        Iterator<String> itSet = set1.iterator();
        while (itSet.hasNext()) {
            System.out.println("itSet.next() = " + itSet.next());
        }
        System.out.println("---------------------------------");

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("aaa", 10);
        map2.put("bbb", 5);

        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println("itKey = " +itMapKey.next());
        }
        System.out.println("----------------------------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println("itVal =" + itMapValue.next());
        }
        System.out.println("----------------------------------");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }

    }
}
