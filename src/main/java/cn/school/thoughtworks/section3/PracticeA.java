package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        List list = object.get("value");
        for (Map.Entry entry : collectionA.entrySet()) {
            if (list.contains(entry.getKey())) {
                collectionA.put((String) entry.getKey(), (Integer) entry.getValue() - 1);
            }
        }
        return collectionA;
    }
}
