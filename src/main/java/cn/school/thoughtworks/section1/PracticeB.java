package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<>();
        for (String s : collection1) {
            for (List<String> list : collection2) {
                if(list.contains(s)){
                    result.add(s);
                    break;
                }
            }
        }
        return result;
    }
}
