package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    public static Map<String, Integer> map = new HashMap<>();

    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        int index;
        for (String s : collection1) {
            if ((index = s.indexOf("-")) > 0) {
                String key = s.substring(0, index);
                String value = s.substring(index + 1);
                if (isNum(value)) {
                    putMap(key, Integer.valueOf(value));
                } else {
                    putMap(s,1);
                }
            }else if ((index = s.indexOf(":")) > 0) {
                String key = s.substring(0, index);
                String value = s.substring(index + 1);
                if (isNum(value)) {
                    putMap(key, Integer.valueOf(value));
                } else {
                    putMap(s,1);
                }
            }else if ((index = s.indexOf("[")) > 0) {
                String key = s.substring(0, index);
                String value = s.substring(index + 1, s.length() - 1);
                if (isNum(value)) {
                    putMap(key, Integer.valueOf(value));
                } else {
                    putMap(s,1);
                }
            }else {
                putMap(s, 1);
            }
        }
        return map;
    }
    /*
    判断字符串是否能转化数字
    */
    public static boolean isNum(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
   /*
   更新map
   */
    public static void putMap(String str,int nums){
        if (map.containsKey(str)) {
            map.put(str, map.get(str) + nums);
        } else {
            map.put(str, nums);
        }
    }
}
