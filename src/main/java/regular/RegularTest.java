package regular;

import java.util.regex.Pattern;

/**
 * 正则表达式测试
 * @author lishuai
 */
public class RegularTest {
    public static void main(String[] args) {

        //test1();
        test2();
    }

    public static void test1(){
        String str = "FDE";
        //^在中括号内时表示匹配除中括号内元素的其他任一元素
        String regex  = "[^ABC]DE";

        //匹配DE结尾，长度为3，开头不是ABC任一字母的字符串
        boolean matches = Pattern.matches(regex, str);
        //结果为true
        System.out.println(matches);
    }

    public static void test2(){
        String str = "784";
        //^在中括号外时表示开头必须是^后的第一个元素
        String regex  = "^7[0-9]";

        //匹配以7开头且第二个字符是数字
        //结果为true
        System.out.println(str.matches(regex));
    }
}
