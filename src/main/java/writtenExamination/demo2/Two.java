package writtenExamination.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 找到不含重复字母的最长字串
 */
public class Two {
    public static void main(String[] args) {
        String str = "abcdbcdcbabcdefggcwa";
        final String maxSubstr = findMaxSubstr(str);
        System.out.println(maxSubstr);
    }
    public static String findMaxSubstr (String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            StringBuilder string = new StringBuilder();
            for (int j = i; j < str.length(); j++){
                boolean flag = true;
                for (int k = 0; k < string.length(); k++) {
                    if (string.charAt(k)==str.charAt(j))
                        flag=false;
                }
                if (!flag)
                    break;
                string.append(str.charAt(j));
            }
            list.add(string.toString());
        }
        int max = list.get(0).length();
        String result = list.get(0);
        for (String s : list) {
            if (s.length()>max){
                result=s;
                max=result.length();
            }
        }
        return result;
    }
}
