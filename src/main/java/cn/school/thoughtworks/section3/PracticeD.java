package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();
        int index = 0, value;
        String key;
        for (String s : collectionA) {
            if ((index = s.indexOf("-")) > 0 && isNum(s.substring(index + 1))) {
                key = s.substring(0, index);
                value = Integer.valueOf(s.substring(index + 1));
                if (collection3.containsKey(key)) {
                    collection3.put(key, collection3.get(key) + value);
                } else {
                    collection3.put(key, value);
                }
            } else {
                if (collection3.containsKey(s)) {
                    collection3.put(s, collection3.get(s) + 1);
                } else {
                    collection3.put(s, 1);
                }
            }
        }
        return new PracticeB().createUpdatedCollection(collection3, object);
    }

    public static boolean isNum(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
