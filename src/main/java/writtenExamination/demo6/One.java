package writtenExamination.demo6;

import java.util.*;

public class One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("请输入字符串:");
            String str = sc.nextLine();
            method(str);
            System.out.println("1、清除结果，重新计算");
            System.out.println("2、结束");
            int a = sc.nextInt();
            if (a==1)
                continue;
            if (a==2)
                flag=false;
        }
    }

    public static void method(String str) {
        Map<Character,Integer>map=new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(!Character.isLetter(c)&&!Character.isDigit(c)&&c!=' ')
                continue;
            if (map.get(str.charAt(i))==null){
                map.put(str.charAt(i),1);
            }else {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        StringBuilder stringBuffer = new StringBuilder();
        while (map.size()!=0){
            int max=0;
            char key= ' ';
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue()>max){
                    max=entry.getValue();
                    key=entry.getKey();
                }
            }
            stringBuffer.append(key);
            map.remove(key);
        }
        System.out.println(stringBuffer.toString());
    }
}

