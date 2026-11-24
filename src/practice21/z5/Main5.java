package practice21.z5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class Main5 {

    @SafeVarargs
    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> list = new ArrayList<>();
        Collections.addAll(list, elements);
        return list;
    }

    @SafeVarargs
    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        Collections.addAll(set, elements);
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys,
                                                  List<? extends V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("Количество ключей и значений должно совпадать");
        }
        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }

    public static void main(String[] args) {
        ArrayList<String> list = newArrayList("a", "b", "c");
        System.out.println("ArrayList: " + list);

        HashSet<Integer> set = newHashSet(1, 2, 2, 3);
        System.out.println("HashSet: " + set); // дубликат 2 отброшен

        List<String> keys = Arrays.asList("one", "two", "three");
        List<Integer> values = Arrays.asList(1, 2, 3);
        HashMap<String, Integer> map = newHashMap(keys, values);
        System.out.println("HashMap: " + map);
    }
}

