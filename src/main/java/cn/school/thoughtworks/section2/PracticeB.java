package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        for (String s : collection1) {
            int index = s.indexOf("-");
            if (index == -1 ) {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            } else {
                String key = s.substring(0, index);
                String value = s.substring(index + 1);
                if (isNum(value)) {
                    map.put(key, Integer.valueOf(value));
                }else {
                    if (map.containsKey(s)) {
                        map.put(s, map.get(s) + 1);
                    } else {
                        map.put(s, 1);
                    }
                }
            }
        }
        return map;
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
