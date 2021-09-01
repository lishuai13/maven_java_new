package writtenExamination.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 找到重复的字符
 */
public class One {
    public static void main(String[] args) {
        String[]inputArray = {"a","a","c","b","c"};
        String[] strings = countString(inputArray);
        for (String string : strings) {
            System.out.println(string);
        }
    }
    public static String[] countString (String[] inputArray) {
        List<String>lists = new ArrayList<>();
        List<String>lists2 = new ArrayList<>();
        for (String s : inputArray) {
            if (lists.contains(s)){
                lists2.add(s);
            }else {
                lists.add(s);
            }
        }
        String[] result = new String[lists.size()-1];
        for (int i = 0; i < lists2.size(); i++) {
            result[i] =lists.get(i);
        }
        return result;
    }
}
