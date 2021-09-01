package MyTest.demo4;

import java.util.*;

/**
 * final测试
 */
public class FinalDemo {
    private static final Map<String, Object> NAME = new HashMap<>();
    private static final List<String> LIST = new ArrayList<>();
    private static final String[] TYPE = new String[15];
    private static final StringBuilder SB = new StringBuilder("22");
    private static final StringBuffer SBU = new StringBuffer("22");
    private static final String S = "44";
    private static final int num = 44;
    private static final String S1 = new String();



    public void setName() {
        NAME.put("1", "maomao");
        LIST.add("11");
        TYPE[0] = "1";
        SB.append("12");
        SBU.append("32");
        //S="11111";报错
        //num=1;报错
        //S1="11111";报错
        System.out.println(NAME);
        System.out.println(LIST);
        System.out.println(Arrays.asList(TYPE));
        System.out.println(SB.toString());
        System.out.println(SBU.toString());
    }

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        finalDemo.setName();
    }
}