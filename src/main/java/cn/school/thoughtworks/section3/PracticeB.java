package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        List list = object.get("value");
        for (Map.Entry entry : collectionA.entrySet()) {
            if (list.contains(entry.getKey())) {
                int value = (int) entry.getValue();
                collectionA.put((String) entry.getKey(), value - value / 3);
            }
        }
        return collectionA;
    }
}
